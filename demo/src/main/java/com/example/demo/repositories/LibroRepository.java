package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Libro; 

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> { 
}
