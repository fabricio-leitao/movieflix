package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.GenreRepository;
import com.devsuperior.movieflix.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
