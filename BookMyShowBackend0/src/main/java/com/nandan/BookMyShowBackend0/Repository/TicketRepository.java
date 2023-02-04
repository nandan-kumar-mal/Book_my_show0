package com.nandan.BookMyShowBackend0.Repository;

import com.nandan.BookMyShowBackend0.Models.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
}
