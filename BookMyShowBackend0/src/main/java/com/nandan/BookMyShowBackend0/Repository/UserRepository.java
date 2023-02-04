package com.nandan.BookMyShowBackend0.Repository;

import com.nandan.BookMyShowBackend0.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
