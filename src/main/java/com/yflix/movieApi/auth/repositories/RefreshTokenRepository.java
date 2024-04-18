package com.yflix.movieApi.auth.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yflix.movieApi.auth.entities.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Integer> {
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
