package com.hotel.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.model.Partit;

@Repository
public interface PartitRepository extends JpaRepository<Partit, Long> {
    
}