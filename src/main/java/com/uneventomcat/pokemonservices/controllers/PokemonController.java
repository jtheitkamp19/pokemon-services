package com.uneventomcat.pokemonservices.controllers;

import com.uneventomcat.pokemonservices.models.Pokemon;
import com.uneventomcat.pokemonservices.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonController {
    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping
    public List<Pokemon> list() {
        return pokemonRepository.findAll();
    }

    @GetMapping("{id}")
    public Pokemon get(@PathVariable Long id) {
        return pokemonRepository.getById(id);
    }
}
