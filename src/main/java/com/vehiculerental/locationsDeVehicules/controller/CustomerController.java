package com.vehiculerental.locationsDeVehicules.controller;

import com.vehiculerental.locationsDeVehicules.model.Customer;
import com.vehiculerental.locationsDeVehicules.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller // This means that this class is a Controller
@RequestMapping(path="/VehiculeRental")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("/customer")//me permet de créer l'adresse url ex: localhost/8808(nom du port)/allcar j'aurais si je rentre cette adresse accés a toute les voiture de ma liste du tableau sur le moniteur
    public Iterable<Customer> getAllCustomers(){// methode qui me return toutes les voitures
        return this.service.getAllCustomers();
    }
    @GetMapping("/customer/{ids}")//me permet de créer l'adresse url ex: localhost/8808(nom du port)/carbyid/1 j'aurais si je rentre cette adresse accés l'id de la voiture que je souhaite dans ma liste du tableau sur le moniteur
    public Customer getCustomerById (@PathVariable(name = "ids") int id){
        return this.service.getCustomerById(id);
    }
}
