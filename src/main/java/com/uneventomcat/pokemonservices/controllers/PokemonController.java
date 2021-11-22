package com.uneventomcat.pokemonservices.controllers;

import com.uneventomcat.pokemonservices.models.Pokemon;
import com.uneventomcat.pokemonservices.repositories.PokemonRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/name/{name}")
    public List<Pokemon> getByName(@PathVariable String name) {
        return pokemonRepository.findByNameContaining(name);
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.PUT)
    public Pokemon update(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        Pokemon existingPokemon = pokemonRepository.getById(id);
        BeanUtils.copyProperties(pokemon, existingPokemon);
        pokemonRepository.saveAndFlush(existingPokemon);
        return existingPokemon;
    }
}
