package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
    
}