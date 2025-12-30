package com.curso.models;

import lombok.ToString;

@ToString
public class SoulStone extends Stone{
    private static final String COLOR = "Orage";
    private static final String NAME = "Soul Stone";
    private static final String LOCATION = "Vormi";
    private static final int ENERGY_LEVEL = 7;

    public SoulStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Piedra Alma "+ super.toString());
    }
}
