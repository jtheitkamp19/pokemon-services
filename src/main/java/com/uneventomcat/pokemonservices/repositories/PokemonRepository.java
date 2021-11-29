package com.uneventomcat.pokemonservices.repositories;

import com.uneventomcat.pokemonservices.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    List<Pokemon> findByNameContaining(String name);

    List<Pokemon> findByName(String name);

    @Query(value = "SELECT * FROM pokemon WHERE familyid = (SELECT familyid FROM pokemon WHERE number = :id) ORDER BY number ASC;", nativeQuery = true)
    List<Pokemon> findPokeFamilyForPokemonWithId(@Param("id") Long id);
}
