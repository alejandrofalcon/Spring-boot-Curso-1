package com.alejandro.curso.springboot.webapp.springbootweb.controllers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alejandro.curso.springboot.webapp.springbootweb.models.User;
import com.alejandro.curso.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")

public class UserRestController {


    @GetMapping("/details")
public UserDto details(){
    User user= new User("Andres", "Guzman");
    UserDto userDto =new UserDto();
    
    userDto.setUser(user);
    userDto.setTitle("Hola Mundo Spring Boot");
   
    return userDto;
}
@GetMapping ("/list")
public List<User> list(){
    User user= new User("Andres", "Guzman");
    User user2= new User("Pepe", "doe");
    User user3= new User("Ale", "Falcon");

    List<User> users= Arrays.asList(user,user2,user3);

   
    return users;

}
@GetMapping("/details-map")

public Map<String, Object> detailsMap(){
    User user= new User("Andres", "Guzman");
    Map<String, Object> body= new HashMap<>();

    body.put("tittle", "Hola Mundo Spring Boot");
    body.put("user", user );
    return body;
}
}
