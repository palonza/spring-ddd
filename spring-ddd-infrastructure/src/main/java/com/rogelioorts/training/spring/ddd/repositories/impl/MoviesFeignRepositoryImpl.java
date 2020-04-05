package com.rogelioorts.training.spring.ddd.repositories.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rogelioorts.training.spring.ddd.entities.Movie;
import com.rogelioorts.training.spring.ddd.mappers.MoviesFeignMapper;
import com.rogelioorts.training.spring.ddd.repositories.MoviesFeignRepository;
import com.rogelioorts.training.spring.ddd.repositories.MoviesRepository;

@Repository
public class MoviesFeignRepositoryImpl implements MoviesRepository {
	
	@Autowired
	private MoviesFeignRepository repository;
	
	@Autowired
	private MoviesFeignMapper mapper;

	@Override
	public List<Movie> findAll() {
		return null;//repository.getPage().getMovies().stream().map(mapper::map).collect(Collectors.toList());
	}

}
