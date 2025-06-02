package com.hotel.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.model.Jugador;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
    
}