package com.sena.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ApiRest {
    

 @GetMapping("/api/hola")
 public String getHola() {
     return new String("Hola");
 }
 


}
