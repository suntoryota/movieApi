package com.yflix.movieApi.auth.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yflix.movieApi.auth.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String username);
}
