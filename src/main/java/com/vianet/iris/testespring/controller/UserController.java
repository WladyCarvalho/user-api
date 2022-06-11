package com.vianet.iris.testespring.controller;

import com.vianet.iris.testespring.dao.UserDao;
import com.vianet.iris.testespring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/iris-teste")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping
    public User Salvar(@RequestBody User user){
        return userDao.Salvar(user);
    }

    @GetMapping
    public List<User> Listar(){
        return userDao.Listar();
    }

}
