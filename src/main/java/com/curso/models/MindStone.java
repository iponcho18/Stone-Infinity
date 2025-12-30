package com.curso.models;

import lombok.ToString;

@ToString
public class MindStone extends Stone{
    private static final String COLOR = "Yellow";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "loki scepter";
    private static final int ENERGY_LEVEL = 3;

    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Piedra Mente " + super.toString());
    }
}
