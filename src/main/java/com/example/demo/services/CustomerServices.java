package com.example.demo.services;

import com.example.demo.dto.Customer;

import java.util.List;

public interface CustomerServices {

    Customer findCustomerById(Long id);

    List<Customer> findCustomers();

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    void addCustomer(Long id);

    List<Customer> findCustomerByName(String name);

    List<Customer> findCustomerBySurname(String surname);

    List<Customer> findCustomerByAge(Integer age);

    List<Customer> findCustomerByTypeSex(String typeSex);
}
