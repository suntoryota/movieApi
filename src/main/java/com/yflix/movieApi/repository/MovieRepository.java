package com.yflix.movieApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yflix.movieApi.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
