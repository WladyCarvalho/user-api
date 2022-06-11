package com.vianet.iris.testespring.dao;


import com.vianet.iris.testespring.model.User;
import com.vianet.iris.testespring.repositorio.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDao {

    @Autowired
    private UserRepository repositorio;

    public User Salvar(User user){
        return repositorio.save(user);
    }

    public List<User> Listar(){

        List<User> users = new ArrayList<>();

        Streamable.of(repositorio.findAll())
                .forEach(users::add);

        return users;
    }
}
