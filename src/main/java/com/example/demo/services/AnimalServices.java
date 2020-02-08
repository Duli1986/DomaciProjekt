package com.example.demo.services;

import com.example.demo.dto.Animal;

import java.util.List;

public interface AnimalServices {

    Animal findCustomerById(Long id);

    List<Animal> findCustomers();

    Animal saveCustomer(Animal animal);

    void deleteCustomer(Long id);

    void addCustomer(Animal animal);

    List<Animal> findCustomerByName(String name);

    List<Animal> findCustomerBySurname(String surname);

    List<Animal> findCustomerByAge(Integer age);

    List<Animal> findCustomerByTypeSex(String typeSex);
}
