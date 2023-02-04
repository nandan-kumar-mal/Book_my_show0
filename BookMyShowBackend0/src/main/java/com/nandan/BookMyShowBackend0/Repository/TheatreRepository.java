package com.nandan.BookMyShowBackend0.Repository;

import com.nandan.BookMyShowBackend0.Models.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<TheatreEntity,Integer> {

    TheatreEntity findByNameAndCity(String name,String city);

}
