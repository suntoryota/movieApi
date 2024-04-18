package com.yflix.movieApi.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.yflix.movieApi.dto.MovieDto;
import com.yflix.movieApi.dto.MoviePageResponse;

public interface MovieService {

	MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException;

	MovieDto getMovie(Integer movieId);

	List<MovieDto> getAllMovies();

	MovieDto updateMovie(Integer movieId, MovieDto movieDto, MultipartFile file) throws IOException;

	String deleteMovie(Integer movieId) throws IOException;

	MoviePageResponse getAllMoviesWithPagination(Integer pageNumber, Integer pageSized);

	MoviePageResponse getAllMoviesWithPaginationAndSorting(Integer pageNumber, Integer pageSized, String sortBy, String dir);
}
