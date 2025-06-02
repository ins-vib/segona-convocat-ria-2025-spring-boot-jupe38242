package com.hotel.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.model.Equip;

@Repository
public interface EquipRepository extends JpaRepository<Equip, Long> {
    
}