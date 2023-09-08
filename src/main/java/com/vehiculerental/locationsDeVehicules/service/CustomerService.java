package com.vehiculerental.locationsDeVehicules.service;

import com.vehiculerental.locationsDeVehicules.model.Customer;
import com.vehiculerental.locationsDeVehicules.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Create
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // get by ID
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    // get all
    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Update
    public Customer updateCustomer(int id, Customer customer) {
        if (customerRepository.existsById(id)) {
            customer.setIdCustomer(id);
            return customerRepository.save(customer);
        }
        return null;
    }

    // Delete
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }
}
