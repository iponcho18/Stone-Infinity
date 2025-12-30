package com.curso.singleton;

import com.curso.models.MindStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MindStoneSingleton {

    private static volatile MindStone mindStoneInstance;

    public static MindStone getInstance(){
        if (mindStoneInstance == null){

            synchronized (MindStoneSingleton.class){
                if (mindStoneInstance == null){
                    log.info("se crea instancia de mente");
                    mindStoneInstance = new MindStone();
                }
            }
        }
        return mindStoneInstance;
    }
}
