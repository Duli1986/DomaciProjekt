package com.example.demo.controller;

import com.example.demo.dto.Animal;
import com.example.demo.services.AnimalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest/animals")
public class AnimalsController {

    @Autowired
    private AnimalServices animalServices;

    @GetMapping(value = "/getallanimals")
    Iterable<Animal> getAllAnimals(){
        return animalServices.findAnimals();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Animal saveAnimal(@RequestBody Animal animal){
        return animalServices.saveAnimal(animal);
    }

    @RequestMapping(value = "/addAnimal")
    public String addAnimal(){
        Animal a1 =  new Animal();
        a1.setName("Martin");
        a1.setAge(9);
        a1.setTypesex("muz");

        animalServices.addAnimal(a1);

        return "success";
    }
}
