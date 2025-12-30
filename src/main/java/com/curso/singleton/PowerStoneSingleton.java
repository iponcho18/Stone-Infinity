package com.curso.singleton;

import com.curso.models.PowerStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PowerStoneSingleton {
    private static volatile PowerStone powerStoneInstance;

    public static PowerStone getInstance(){
        if (powerStoneInstance == null){

            synchronized (PowerStoneSingleton.class){
                if (powerStoneInstance == null){
                    log.info("se crea instancia de poder");
                    powerStoneInstance = new PowerStone();
                }
            }
        }
        return powerStoneInstance;
    }
}
