package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.BibliotecaService;
import com.example.demo.entities.Libro;
import com.example.demo.entities.Autor;
import com.example.demo.entities.Genero;

import java.util.List;

@RestController // Marca esta clase como un controlador REST
@RequestMapping("/biblioteca") // Todas las URL manejadas por este controlador comenzarán con /biblioteca
public class BibliotecaController {
    
    @Autowired // Inyección de dependencia, automáticamente asigna una instancia de BibliotecaService
    private BibliotecaService bibliotecaService;

    @GetMapping("/libros") // Mapea esta función a una solicitud GET en /biblioteca/libros
    public List<Libro> findAllLibros() {
        return bibliotecaService.getLibros(); // Devuelve todos los libros
    }

    @PostMapping("/libros") // Mapea esta función a una solicitud POST en /biblioteca/libros
    public Libro createLibro(@RequestBody Libro libro) {
        return bibliotecaService.saveLibro(libro); // Crea un nuevo libro
    }

    @PutMapping("/libros/{id}") // Mapea esta función a una solicitud PUT en /biblioteca/libros/{id}
    public Libro updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
        return bibliotecaService.updateLibro(id, libro); // Actualiza un libro existente
    }

    @DeleteMapping("/libros/{id}") // Mapea esta función a una solicitud DELETE en /biblioteca/libros/{id}
    public void deleteLibro(@PathVariable Long id) {
        bibliotecaService.deleteLibro(id); // Elimina un libro existente
    }

    @PostMapping("/autores") // Mapea esta función a una solicitud POST en /biblioteca/autores
    public Autor createAutor(@RequestBody Autor autor) {
        return bibliotecaService.saveAutor(autor); // Crea un nuevo autor
    }

    @PutMapping("/autores/{id}") // Mapea esta función a una solicitud PUT en /biblioteca/autores/{id}
    public Autor updateAutor(@PathVariable Long id, @RequestBody Autor autor) {
        return bibliotecaService.updateAutor(id, autor); // Actualiza un autor existente
    }

    @DeleteMapping("/autores/{id}") // Mapea esta función a una solicitud DELETE en /biblioteca/autores/{id}
    public void deleteAutor(@PathVariable Long id) {
        bibliotecaService.deleteAutor(id); // Elimina un autor existente
    }

    @PostMapping("/generos") // Mapea esta función a una solicitud POST en /biblioteca/generos
    public Genero createGenero(@RequestBody Genero genero) {
        return bibliotecaService.saveGenero(genero); // Crea un nuevo género
    }

    @PutMapping("/generos/{id}") // Mapea esta función a una solicitud PUT en /biblioteca/generos/{id}
    public Genero updateGenero(@PathVariable Long id, @RequestBody Genero genero) {
        return bibliotecaService.updateGenero(id, genero); // Actualiza un género existente
    }

    @DeleteMapping("/generos/{id}") // Mapea esta función a una solicitud DELETE en /biblioteca/generos/{id}
    public void deleteGenero(@PathVariable Long id) {
        bibliotecaService.deleteGenero(id); // Elimina un género existente
    }
}
