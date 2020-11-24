package com.devsuperior.movieflix.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.movieflix.entities.Genre;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/genres")
public class GenreResource {

  @GetMapping
  public ResponseEntity<List<Genre>> findAll() {
    List<Genre> list = new ArrayList<>();

    list.add(new Genre(1L, "Suspense"));
    list.add(new Genre(2L, "Romance"));
    list.add(new Genre(3L, "Terror"));

    return ResponseEntity.ok().body(list);
  }
}
