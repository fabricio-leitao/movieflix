package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO {

	private String text;
	
	public ReviewDTO() {
		
	}

	public ReviewDTO(String text) {
		this.text = text;
	}
	
	public ReviewDTO(Review entity) {
		text = entity.getText();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
