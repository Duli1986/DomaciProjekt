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
    public Animal findCustomerById(Long id) {
        return animalRepository.findById(id).get();
    }

    @Override
    public List<Animal> findCustomers() {
        List<Animal> animalList = animalRepository.findAll().stream().collect(Collectors.toList());
        return animalList;
    }

    @Override
    public Animal saveCustomer(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public void deleteCustomer(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public void addCustomer(Animal animal) {
        animalRepository.saveAndFlush(animal);
    }

    @Override
    public List<Animal> findCustomerByName(String name) {
        List<Animal> findAnimalByName = findCustomers().
                stream()
                .filter(x -> x.getName().equals(name))
                .collect(Collectors.toList());

        return findAnimalByName;
    }

    @Override
    public List<Animal> findCustomerBySurname(String surname) {
        List<Animal> findAnimalBySurname = findCustomers()
                .stream()
                .filter(x -> x.getSurname().equals(surname))
                .collect(Collectors.toList());

        return findAnimalBySurname;
    }

    @Override
    public List<Animal> findCustomerByAge(Integer age) {
        List<Animal> findAnimalByAge = findCustomers()
                .stream()
                .filter(x -> x.getAge().equals(age))
                .collect(Collectors.toList());

        return findAnimalByAge;
    }

    @Override
    public List<Animal> findCustomerByTypeSex(String typeSex) {
        List<Animal> findAnimalByTypeSexes = findCustomers()
                .stream()
                .filter(x -> x.getTypesex().equals(typeSex))
                .collect(Collectors.toList());

        return findAnimalByTypeSexes;
    }
}
