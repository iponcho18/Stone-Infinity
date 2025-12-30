package com.curso.models;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String email;
    private String pass;
}
