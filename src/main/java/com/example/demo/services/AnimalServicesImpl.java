package com.example.demo.services;

import com.example.demo.dto.Animal;
import com.example.demo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class AnimalServicesImpl implements AnimalServices {

    @Autowired
    private AnimalRepository animalRepository;


    @Override
    public Animal findAnimalById(Long id) {
        return animalRepository.findById(id).get();
    }

    @Override
    public List<Animal> findAnimals() {
        List<Animal> animalList = animalRepository.findAll().stream().collect(Collectors.toList());
        return animalList;
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public void deleteAnimal(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public void addAnimal(Animal animal) {
        animalRepository.saveAndFlush(animal);
    }

    @Override
    public List<Animal> findAnimalByName(String name) {
        List<Animal> findAnimalByName = findAnimals().
                stream()
                .filter(x -> x.getName().equals(name))
                .collect(Collectors.toList());

        return findAnimalByName;
    }

    @Override
    public List<Animal> findAnimalByAge(Integer age) {
        List<Animal> findAnimalByAge = findAnimals()
                .stream()
                .filter(x -> x.getAge().equals(age))
                .collect(Collectors.toList());

        return findAnimalByAge;
    }

    @Override
    public List<Animal> findAnimalByTypeSex(String typeSex) {
        List<Animal> findAnimalByTypeSexes = findAnimals()
                .stream()
                .filter(x -> x.getTypesex().equals(typeSex))
                .collect(Collectors.toList());

        return findAnimalByTypeSexes;
    }
}
