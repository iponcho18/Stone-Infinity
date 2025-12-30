package com.curso.models;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class Stone {
    String color;
    String name;
    String location;
    Integer energyLevel;
    Integer numberOfSides;

    private static final int NUMBER_SIDES = 6;

    public Stone(String color, String name, String location, Integer energyLevel) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLevel = energyLevel;
        this.numberOfSides = NUMBER_SIDES;
    }

    public abstract void usePower();
}
