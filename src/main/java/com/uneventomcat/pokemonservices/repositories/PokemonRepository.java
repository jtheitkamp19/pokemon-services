package com.uneventomcat.pokemonservices.repositories;

import com.uneventomcat.pokemonservices.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    @Query(value = "SELECT * FROM pokemon WHERE name LIKE %:name%", nativeQuery = true)
    public List<Pokemon> findByName(@Param("name") String name);
}
