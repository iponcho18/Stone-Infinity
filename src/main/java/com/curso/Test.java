package com.curso;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Test {

    @EqualsAndHashCode.Include
    private int id;
    private String Name;


    private Boolean isActive;
    @ToString.Exclude
    private String pass;
}
