package com.devsuperior.movieflix.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.services.GenreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/genres")
public class GenreResource {

  @Autowired
  private GenreService genreService;

  @GetMapping
  public ResponseEntity<List<Genre>> findAll() {
    List<Genre> list = genreService.findAll();
    return ResponseEntity.ok().body(list);
  }
}
