package com.example.demo.services;

import com.example.demo.dto.Animal;

import java.util.List;

public interface AnimalServices {

    Animal findAnimalById(Long id);

    List<Animal> findAnimals();

    Animal saveAnimal(Animal animal);

    void deleteAnimal(Long id);

    void addAnimal(Animal animal);

    List<Animal> findAnimalByName(String name);

    List<Animal> findAnimalByAge(Integer age);

    List<Animal> findAnimalByTypeSex(String typeSex);
}
