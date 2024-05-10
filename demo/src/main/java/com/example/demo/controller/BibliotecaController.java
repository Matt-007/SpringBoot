package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.BibliotecaService;
import com.example.demo.entities.Libro;
import com.example.demo.entities.Autor;
import com.example.demo.entities.Genero;

import java.util.List;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {
    
    @Autowired
    private BibliotecaService bibliotecaService;

    @GetMapping("/libros")
    public List<Libro> findAllLibros() {
        return bibliotecaService.getLibros();
    }

    @PostMapping("/libros")
    public Libro createLibro(@RequestBody Libro libro) {
        return bibliotecaService.saveLibro(libro);
    }

    @PutMapping("/libros/{id}")
    public Libro updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
        return bibliotecaService.updateLibro(id, libro);
    }

    @DeleteMapping("/libros/{id}")
    public void deleteLibro(@PathVariable Long id) {
        bibliotecaService.deleteLibro(id);
    }

    @PostMapping("/autores")
    public Autor createAutor(@RequestBody Autor autor) {
        return bibliotecaService.saveAutor(autor);
    }

    @PutMapping("/autores/{id}")
    public Autor updateAutor(@PathVariable Long id, @RequestBody Autor autor) {
        return bibliotecaService.updateAutor(id, autor);
    }

    @DeleteMapping("/autores/{id}")
    public void deleteAutor(@PathVariable Long id) {
        bibliotecaService.deleteAutor(id);
    }

    @PostMapping("/generos")
    public Genero createGenero(@RequestBody Genero genero) {
        return bibliotecaService.saveGenero(genero);
    }

    @PutMapping("/generos/{id}")
    public Genero updateGenero(@PathVariable Long id, @RequestBody Genero genero) {
        return bibliotecaService.updateGenero(id, genero);
    }

    @DeleteMapping("/generos/{id}")
    public void deleteGenero(@PathVariable Long id) {
        bibliotecaService.deleteGenero(id);
    }

    
}
