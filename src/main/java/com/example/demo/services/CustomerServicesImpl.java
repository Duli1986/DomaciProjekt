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
        customerRepository.deleteById(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.saveAndFlush(customer);
    }

    @Override
    public List<Customer> findCustomerByName(String name) {
        List<Customer> findCustomerByName = findCustomers().
                stream()
                .filter(x -> x.getName().equals(name))
                .collect(Collectors.toList());

        return findCustomerByName;
    }

    @Override
    public List<Customer> findCustomerBySurname(String surname) {
        List<Customer> findCustomerBySurname = findCustomers()
                .stream()
                .filter(x -> x.getSurname().equals(surname))
                .collect(Collectors.toList());

        return findCustomerBySurname;
    }

    @Override
    public List<Customer> findCustomerByAge(Integer age) {
        List<Customer> findCustomerByAge = findCustomers()
                .stream()
                .filter(x -> x.getAge().equals(age))
                .collect(Collectors.toList());

        return findCustomerByAge;
    }

    @Override
    public List<Customer> findCustomerByTypeSex(String typeSex) {
        List<Customer> findCustomerByTypeSex = findCustomers()
                .stream()
                .filter(x -> x.getTypesex().equals(typeSex))
                .collect(Collectors.toList());

        return findCustomerByTypeSex;
    }
}
