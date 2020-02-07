package com.example.demo.services;

import com.example.demo.dto.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServicesImpl implements CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findCustomers() {
        List<Customer> customerList = customerRepository.findAll().stream().collect(Collectors.toList());
        return customerList;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {

    }

    @Override
    public void addCustomer(Long id) {

    }

    @Override
    public List<Customer> findCustomerByName(String name) {
        return null;
    }

    @Override
    public List<Customer> findCustomerBySurname(String surname) {
        return null;
    }

    @Override
    public List<Customer> findCustomerByAge(Integer age) {
        return null;
    }

    @Override
    public List<Customer> findCustomerByTypeSex(String typeSex) {
        return null;
    }
}
