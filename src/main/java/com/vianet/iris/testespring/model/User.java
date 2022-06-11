package com.vianet.iris.testespring.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;
    private String papel;
    private String senha;

    public User(){

    }

}
