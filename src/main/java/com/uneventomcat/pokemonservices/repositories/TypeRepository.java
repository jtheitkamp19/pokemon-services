package com.uneventomcat.pokemonservices.repositories;

import com.uneventomcat.pokemonservices.models.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {
}
