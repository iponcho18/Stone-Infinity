package com.curso.singleton;

import com.curso.models.RealityStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RealityStoneSingleton {
    private static volatile RealityStone realityStoneInstance;

    public static RealityStone getInstance(){
        if (realityStoneInstance == null){
            synchronized (RealityStoneSingleton.class){
                if (realityStoneInstance == null){
                    log.info("se crea instancia de realidad");
                    realityStoneInstance = new RealityStone();
                }
            }
        }
        return realityStoneInstance;
    }
}
