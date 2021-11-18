package com.uneventomcat.pokemonservices.controllers;

import com.uneventomcat.pokemonservices.models.Type;
import com.uneventomcat.pokemonservices.repositories.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/types")
public class TypeController {
    @Autowired
    private TypeRepository typeRepository;

    @GetMapping
    public List<Type> list() {
        return typeRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Type get(@PathVariable Long id) {
        return typeRepository.getById(id);
    }
}
