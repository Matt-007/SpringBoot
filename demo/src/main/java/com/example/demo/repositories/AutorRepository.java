package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Autor;


@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    
}
