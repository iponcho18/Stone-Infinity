package com.curso.singleton;

import com.curso.models.SpaceStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access =  AccessLevel.PRIVATE)
public class SpaceStoneSingleton {
    private static volatile SpaceStone spaceStoneInstance;

    public static SpaceStone getInstance(){
        if (spaceStoneInstance == null){

            synchronized (SpaceStoneSingleton.class){
                if (spaceStoneInstance == null){
                    log.info("se crea instancia de espacio");
                    spaceStoneInstance = new SpaceStone();
                }
            }
        }
        return spaceStoneInstance;
    }
}
