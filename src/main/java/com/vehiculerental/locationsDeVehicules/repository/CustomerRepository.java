package com.vehiculerental.locationsDeVehicules.repository;

import org.springframework.data.repository.CrudRepository;

import com.vehiculerental.locationsDeVehicules.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
}
