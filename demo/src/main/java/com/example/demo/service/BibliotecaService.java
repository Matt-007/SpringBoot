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

@Service // Marca esta clase como un servicio de Spring
public class BibliotecaService {
    
    @Autowired // Inyección de dependencia, automáticamente asigna una instancia de AutorRepository
    private AutorRepository autorRepository;

    @Autowired // Inyección de dependencia, automáticamente asigna una instancia de GeneroRepository
    private GeneroRepository generoRepository;

    @Autowired // Inyección de dependencia, automáticamente asigna una instancia de LibroRepository
    private LibroRepository librosRepository;

    // Métodos para la entidad Autor
    public List<Autor> getAutores() {
        return autorRepository.findAll(); // Devuelve todos los autores
    }

    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor); // Guarda un nuevo autor en la base de datos
    }

    public Autor updateAutor(Long id, Autor autor) {
        Optional<Autor> optionalAutor = autorRepository.findById(id); // Busca un autor por su ID
        if (optionalAutor.isPresent()) { // Si el autor existe
            autor.setId(id); // Actualiza el ID del autor con el proporcionado
            return autorRepository.save(autor); // Guarda los cambios en la base de datos
        } else {
            // Manejar el caso en que el autor no se encuentre
            return null;
        }
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id); // Elimina un autor por su ID
    }

    // Métodos para la entidad Genero
    public List<Genero> getGeneros() {
        return generoRepository.findAll(); // Devuelve todos los géneros
    }

    public Genero saveGenero(Genero genero) {
        return generoRepository.save(genero); // Guarda un nuevo género en la base de datos
    }

    public Genero updateGenero(Long id, Genero genero) {
        Optional<Genero> optionalGenero = generoRepository.findById(id); // Busca un género por su ID
        if (optionalGenero.isPresent()) { // Si el género existe
            genero.setId(id); // Actualiza el ID del género con el proporcionado
            return generoRepository.save(genero); // Guarda los cambios en la base de datos
        } else {
            // Manejar el caso en que el género no se encuentre
            return null;
        }
    }

    public void deleteGenero(Long id) {
        generoRepository.deleteById(id); // Elimina un género por su ID
    }

    // Métodos para la entidad Libro
    public List<Libro> getLibros() {
        return librosRepository.findAll(); // Devuelve todos los libros
    }

    public Libro saveLibro(Libro libro) {
        return librosRepository.save(libro); // Guarda un nuevo libro en la base de datos
    }

    public Libro updateLibro(Long id, Libro libro) {
        Optional<Libro> optionalLibro = librosRepository.findById(id); // Busca un libro por su ID
        if (optionalLibro.isPresent()) { // Si el libro existe
            libro.setId(id); // Actualiza el ID del libro con el proporcionado
            return librosRepository.save(libro); // Guarda los cambios en la base de datos
        } else {
            // Manejar el caso en que el libro no se encuentre
            return null;
        }
    }

    public void deleteLibro(Long id) {
        librosRepository.deleteById(id); // Elimina un libro por su ID
    }
}
