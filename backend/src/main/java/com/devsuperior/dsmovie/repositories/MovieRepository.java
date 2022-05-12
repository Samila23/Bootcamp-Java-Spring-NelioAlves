package com.devsuperior.dsmovie.repositories;

import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
