package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Genero;
import br.uniesp.si.techback.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @PostMapping
    public Genero incluir(Genero genero) {
        return generoService.cadastrar(genero);
    }
    @GetMapping
    public List<Genero> listar() {
        return generoService.listar();
    }

    @PutMapping
    public Genero alterar (Genero genero) {
        return generoService.alterar(genero);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(Integer id) {
        generoService.excluir(id);
        return ResponseEntity.ok().build();

    }
}