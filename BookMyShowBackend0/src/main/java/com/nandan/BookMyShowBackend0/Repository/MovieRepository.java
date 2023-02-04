package com.nandan.BookMyShowBackend0.Repository;

import com.nandan.BookMyShowBackend0.Models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

    MovieEntity findByMovieName(String movieName);
}
