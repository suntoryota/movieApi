package com.yflix.movieApi.dto;

import java.util.List;

public record MoviePageResponse(List<MovieDto> movieDtos,
								Integer pageNumber,
								Integer pageSize,
								long totalElements,
								int totalpages,
								boolean isLast) {

}
