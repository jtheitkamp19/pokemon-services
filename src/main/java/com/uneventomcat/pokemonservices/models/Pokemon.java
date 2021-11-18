package com.uneventomcat.pokemonservices.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;
    private String name;
    private Integer generation;
    private Double height;
    private Double weight;
    private Integer hp;
    private Integer attack;
    private Integer defense;
    private Integer spatk;
    private Integer spdef;
    private Integer speed;
    private Integer familyid;
    private Integer evonum;
    private String color;

    @ManyToMany
    @JoinTable(
        name = "pokemon_types",
        joinColumns = @JoinColumn(name = "number"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
    private List<Type> types;

    public Pokemon() {

    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSpatk() {
        return spatk;
    }

    public void setSpatk(Integer spatk) {
        this.spatk = spatk;
    }

    public Integer getSpdef() {
        return spdef;
    }

    public void setSpdef(Integer spdef) {
        this.spdef = spdef;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getFamilyid() {
        return familyid;
    }

    public void setFamilyid(Integer familyid) {
        this.familyid = familyid;
    }

    public Integer getEvonum() {
        return evonum;
    }

    public void setEvonum(Integer evonum) {
        this.evonum = evonum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
