package com.devsuperior.movieflix.services;

import java.util.List;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.repositories.GenreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GenreService {

  @Autowired
  private GenreRepository genreRepository;

  @Transactional(readOnly = true)
  public List<Genre> findAll() {
    return genreRepository.findAll();
  }
}
