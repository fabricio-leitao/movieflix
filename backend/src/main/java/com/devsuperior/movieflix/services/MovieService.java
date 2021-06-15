package com.devsuperior.movieflix.services;

import java.util.Optional;

import com.devsuperior.movieflix.services.exceptions.DatabaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.dto.MovieDetailDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.GenreRepository;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

import javax.persistence.EntityNotFoundException;

@Service
public class MovieService {

  @Autowired
  private MovieRepository movieRepository;

  @Autowired
  GenreRepository genreRepository;

  @Transactional(readOnly = true)
  public Page<MovieDTO> findAllPagedByGenre(Long genreId, PageRequest pagerequest) {
    Genre genre = genreId == 0 ? null : genreRepository.getOne(genreId);
    Page<Movie> list = movieRepository.findAllPagedByGenre(genre, pagerequest);

    return list.map(x -> new MovieDTO(x));

  }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Optional<Movie> obj = movieRepository.findById(id);
        Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Movie not found"));
        return new MovieDTO(entity, entity.getReviews());
    }

    @Transactional
    public MovieDTO insert(MovieDTO dto) {
        Movie entity = new Movie();
        dtoToEntity(entity, dto);
        movieRepository.save(entity);
        return new MovieDTO(entity);
    }

    @Transactional
    public MovieDTO update(Long id, MovieDTO dto) {
        try {
            Movie entity = movieRepository.getOne(id);
            dtoToEntity(entity, dto);
            movieRepository.save(entity);
            return new MovieDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Movie id: " + id + " not found");
        }
    }

    public void delete(Long id) {
        try {
            movieRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Movie id: " + id + " not found");
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Integrity violation");
        }
    }

    private void dtoToEntity(Movie entity, MovieDTO dto) {
        entity.setTitle(dto.getTitle());
        entity.setSubTitle(dto.getSubTitle());
        entity.setYear(dto.getYear());
        entity.setImgUrl(dto.getImgUrl());
        entity.setSynopsis(dto.getSynopsis());

        Genre genre = genreRepository.getOne(dto.getGenreId());
        entity.setGenre(genre);
    }
}
