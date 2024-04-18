package com.yflix.movieApi.dto;

import java.util.Set;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;

	@NotBlank(message = "Please provide movie's title!")
	private String title;

	@NotBlank(message = "Please provide movie's director!")
	private String director;

	@NotBlank(message = "Please provide movie's director!")
	private String studio;

	private Set<String> movieCast;

	private Integer releaseYear;

	@NotBlank(message = "Please provide movie's poster!")
	private String poster;

	@NotBlank(message = "Please provide movie's poster's url!")
	private String posterUrl;
}
