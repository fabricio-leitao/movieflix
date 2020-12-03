package com.devsuperior.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public MovieDetailDTO findById(Long id) {

		Optional<Movie> obj = movieRepository.findById(id);

		Movie mov = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found!"));

		return new MovieDetailDTO(mov);
	}

}
