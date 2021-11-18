package com.uneventomcat.pokemonservices.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity(name = "types")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
