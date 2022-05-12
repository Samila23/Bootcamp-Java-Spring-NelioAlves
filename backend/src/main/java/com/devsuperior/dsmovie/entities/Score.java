package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name= "tb_score")
public class Score {
	// Chave composta
	@EmbeddedId
	private ScorePk id = new ScorePk();
	private Double value;
	
	
	//Fazendo referencia aos atibutos do ScorePk
	public void setMovie (Movie movie) {
		id.setMovie(movie);
	}
	public void setUser (User user) {
		id.setUser(user);
	}
}
