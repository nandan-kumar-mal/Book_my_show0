package com.nandan.BookMyShowBackend0.Repository;

import com.nandan.BookMyShowBackend0.Models.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {
}
