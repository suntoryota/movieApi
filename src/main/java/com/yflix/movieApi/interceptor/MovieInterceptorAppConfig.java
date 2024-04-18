package com.yflix.movieApi.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MovieInterceptorAppConfig implements WebMvcConfigurer {

    private final MovieInterceptor movieInterceptor;


    public MovieInterceptorAppConfig(MovieInterceptor movieInterceptor) {
        this.movieInterceptor = movieInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(movieInterceptor)
                .addPathPatterns("/api/v1/movie/**"); // Apply the interceptor to all endpoints starting with "/api/v1/movie/"
    }
}
