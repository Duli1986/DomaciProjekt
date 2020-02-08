package com.example.demo.controller;

import com.example.demo.dto.Animal;
import com.example.demo.services.AnimalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/animals")
public class AnimalsController {

    @Autowired
    private AnimalServices animalServices;

    @GetMapping(value = "/getallanimals")
    Iterable<Animal> getAllAnimals(){
        return animalServices.findAnimals();
    }


}
