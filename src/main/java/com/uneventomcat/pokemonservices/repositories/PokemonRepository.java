package com.uneventomcat.pokemonservices.repositories;

import com.uneventomcat.pokemonservices.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
