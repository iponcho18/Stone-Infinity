package com.curso;

import com.curso.models.*;
import com.curso.service.GuantletService;
import com.curso.service.GuantletServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final var mind  = new MindStone();
        mind.usePower();

        final var stone = new SoulStone();
        stone.usePower();

        final var realityStone = new RealityStone();
        realityStone.usePower();

        final var guantletService = new GuantletServiceImpl();
        guantletService.useGuantle("ess");
    }
}