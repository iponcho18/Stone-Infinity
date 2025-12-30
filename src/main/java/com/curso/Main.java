package com.curso;

import com.curso.dto.UserDTO;
import com.curso.mapper.UserMapper;
import com.curso.models.*;
import com.curso.service.GuantletService;
import com.curso.service.GuantletServiceImpl;
import com.curso.singleton.MindStoneSingleton;
import lombok.extern.flogger.Flogger;
import lombok.extern.java.Log;
import lombok.val;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@Log
public class Main {

    public static void main(String[] args) {


        val CONTANTE = "asdasd";
        log.info(CONTANTE);

        final var mind  = new MindStone();
        mind.usePower();

        final var stone = new SoulStone();
        stone.usePower();

        final var realityStone = new RealityStone();
        realityStone.usePower();


        final var mindSingleton = MindStoneSingleton.getInstance();
        mindSingleton.usePower();

        final var mindSingleton2 = MindStoneSingleton.getInstance();
        mindSingleton2.usePower();

        final var mindSingleton3 = MindStoneSingleton.getInstance();
        mindSingleton3.usePower();


        final var guantletService = new GuantletServiceImpl();
        guantletService.useGuantle("ess");

        Test test = new Test();
        test.setId(1);
        test.setName("JOSE");
        test.setPass("asdasd");
        test.setIsActive(true);

        Test test2 = new Test();
        test2.setId(1);
        test2.setName("JOSE");
        test2.setPass("asdasd");
        test2.setIsActive(true);
        System.out.println(test.toString());
        System.out.println(test2.toString());

       if ( test.equals(test2)){
           System.out.println("somos iguales");
       }
       else {
           System.out.println("somos diferentes");
       }

       User user = new User();
       user.setEmail("jaqibarra.sistemas@gmail.com");
       user.setId( 1);
       user.setPass("Navajas23!");
       user.setName("Jose Alfonso Quezada Ibarra");

       log.warning(user.toString());
        UserDTO userDTO = UserMapper.INSTANCE.toDTO(user);

        log.warning(userDTO.toString());

        User user2 = UserMapper.INSTANCE.toEntity(userDTO);
        log.warning(user2.toString());
    }
}