package com.curso.models;

import lombok.ToString;

@ToString
public class SpaceStone extends Stone{
    private static final String COLOR = "Blue";
    private static final String NAME = "Space Stone";
    private static final String LOCATION = "Teseract";
    private static final int ENERGY_LEVEL = 7;

    public SpaceStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Piedra Espacio "+ super.toString());
    }
}
