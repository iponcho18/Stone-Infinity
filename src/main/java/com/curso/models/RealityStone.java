package com.curso.models;

import lombok.ToString;

@ToString
public class RealityStone extends Stone{
    private static final String COLOR = "Red";
    private static final String NAME = "Reality Stone";
    private static final String LOCATION = "aether";
    private static final int ENERGY_LEVEL = 6;

    public RealityStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Piedra Realidad "+ super.toString());
    }
}
