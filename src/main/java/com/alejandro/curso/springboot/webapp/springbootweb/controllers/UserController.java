package com.alejandro.curso.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.alejandro.curso.springboot.webapp.springbootweb.models.User;

@Controller

public class UserController {

@GetMapping("/details")
public String details(Model model){
    
    User user= new User("Andres", "Guzman");
    user.setEmail("andres@correo.com");
    model.addAttribute("tittle", "Hola Mundo Spring Boot");
    model.addAttribute("user", user);
  
    return "details";
}
@GetMapping("/list")
public String list (ModelMap model){
    model.addAttribute("tittle","Listado de usuarios:");
    return "list";

}
@ModelAttribute("users")
public List<User> usersModel(){
    return Arrays.asList
    (new User("pepa","Gonzales"),
     new User("lalo", "Perez","lalo@gmail.com"),
     new User("Juanita", "Roldan"),
    new User("ivan", "Montes","calamardo@gmail.com"));

}
}
