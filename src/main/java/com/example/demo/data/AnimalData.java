package com.example.demo.data;

import com.example.demo.dto.Animal;
import com.example.demo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class AnimalData implements CommandLineRunner {

    public AnimalData(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Autowired
    private AnimalRepository animalRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(" Loading Animal Data");

    Animal c1 = new Animal();
    c1.setName("Martin");
    c1.setAge(3);
    c1.setTypesex("male");
    animalRepository.save(c1);

    Animal c2 = new Animal();
    c2.setName("Karel");
    c2.setAge(8);
    c2.setTypesex("male");
    animalRepository.save(c2);

    Animal c3 = new Animal();
    c3.setName("Gorila");
    c3.setAge(10);
    c3.setTypesex("female");
    animalRepository.save(c3);

    System.out.println("Animals Saved: " + animalRepository.count());
    }
}
