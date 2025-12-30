package com.curso.singleton;

import com.curso.models.SoulStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SoulStoneSingleton {

    private static volatile SoulStone soulStoneInstance;

    public static SoulStone getInstance(){
        if (soulStoneInstance == null){

            synchronized (SoulStoneSingleton.class){
                if (soulStoneInstance == null){
                    log.info("se crea instancia de alma");
                    soulStoneInstance = new SoulStone();
                }
            }
        }
        return soulStoneInstance;
    }
}
