package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;

public class MovieDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Size(min = 5, max = 120, message = "Deve ter entre 5 e 120 caracteres")
	@NotBlank(message = "Campo obrigatório")
	private String title;
	private String subTitle;

	@Positive(message = "Favor entrar com um ano positivo")
	private Integer year;
	private String imgUrl;
	private String synopsis;
	
	private GenreDTO genre;

	public MovieDTO() {

	}

	public MovieDTO(Long id, String title, String subTitle, Integer year, String imgUrl, String synopsis, Genre genre) {
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.genre = new GenreDTO(genre);
	}

	public MovieDTO(Movie entity) {
		id = entity.getId();
		title = entity.getTitle();
		subTitle = entity.getSubTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		synopsis = entity.getSynopsis();
		genre = new GenreDTO(entity.getGenre());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public GenreDTO getGenre() {
		return genre;
	}

	public void setGenre(GenreDTO genre) {
		this.genre = genre;
	}
	
	

}
