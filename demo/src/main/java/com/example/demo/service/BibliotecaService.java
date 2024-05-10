package com.example.demo.service;

import com.example.demo.entities.Autor;
import com.example.demo.entities.Genero;
import com.example.demo.entities.Libro;
import com.example.demo.repositories.AutorRepository;
import com.example.demo.repositories.GeneroRepository;
import com.example.demo.repositories.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BibliotecaService {
    
    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private GeneroRepository generoRepository;

    @Autowired
    private LibroRepository librosRepository;

    // Métodos para la entidad Autor
    public List<Autor> getAutores() {
        return autorRepository.findAll();
    }

    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor updateAutor(Long id, Autor autor) {
        Optional<Autor> optionalAutor = autorRepository.findById(id);
        if (optionalAutor.isPresent()) {
            autor.setId(id);
            return autorRepository.save(autor);
        } else {
            // Manejar el caso en que el autor no se encuentre
            return null;
        }
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }

    // Métodos para la entidad Genero
    public List<Genero> getGeneros() {
        return generoRepository.findAll();
    }

    public Genero saveGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    public Genero updateGenero(Long id, Genero genero) {
        Optional<Genero> optionalGenero = generoRepository.findById(id);
        if (optionalGenero.isPresent()) {
            genero.setId(id);
            return generoRepository.save(genero);
        } else {
            // Manejar el caso en que el género no se encuentre
            return null;
        }
    }

    public void deleteGenero(Long id) {
        generoRepository.deleteById(id);
    }

    // Métodos para la entidad Libro
    public List<Libro> getLibros() {
        return librosRepository.findAll();
    }

    public Libro saveLibro(Libro libro) {
        return librosRepository.save(libro);
    }

    public Libro updateLibro(Long id, Libro libro) {
        Optional<Libro> optionalLibro = librosRepository.findById(id);
        if (optionalLibro.isPresent()) {
            libro.setId(id);
            return librosRepository.save(libro);
        } else {
            // Manejar el caso en que el libro no se encuentre
            return null;
        }
    }

    public void deleteLibro(Long id) {
        librosRepository.deleteById(id);
    }
}
