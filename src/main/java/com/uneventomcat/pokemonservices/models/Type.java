package com.uneventomcat.pokemonservices.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    @ManyToMany(mappedBy = "types")
    @JsonIgnore
    private List<Pokemon> pokemon;

    public Type() {

    }
}
