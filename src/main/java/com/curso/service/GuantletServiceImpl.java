package com.curso.service;

import com.curso.models.RealityStone;
import com.curso.models.Stone;
import lombok.extern.java.Log;

@Log
public class GuantletServiceImpl implements GuantletService {

    public Stone reality = new RealityStone();

    @Override
    public void useGuantle(String stoneName) {
        log.info("Use stone "+ reality);
    }
}
