package com.sena.api.controller;
import org.springframework.web.bind.annotation.RestController;

import com.sena.api.model.Aprendiz;
import com.sena.api.service.AprendizService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class AprendizController {
    
   @Autowired
   AprendizService aprendizService; 

 @GetMapping("/api/aprendiz/list")
 public List<Aprendiz> getAprendizList() {
     return aprendizService.getList();
 }
 
@GetMapping("/api/aprendiz/mayor")
public Aprendiz getAprendizMayor() {
    return aprendizService.getMayorEdad();
}

@GetMapping("/apiAprendiz/promedio/edad")
public double getPromedioEdad() {
    return aprendizService.getPromedioEdad();
}


}
