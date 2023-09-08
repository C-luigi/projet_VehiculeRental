package com.vehiculerental.locationsDeVehicules.controller;

import com.vehiculerental.locationsDeVehicules.model.Car;
import com.vehiculerental.locationsDeVehicules.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // This means that this class is a Controller
@RequestMapping(path="/VehiculeRental")
public class CarController {
    @Autowired
    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping("/car")//me permet de créer l'adresse url ex: localhost/8808(nom du port)/allcar j'aurais si je rentre cette adresse accés a toute les voiture de ma liste du tableau sur le moniteur
    public Iterable<Car> getAllCars(){// methode qui me return toutes les voitures
        return this.service.getAllCars();
    }
    @GetMapping("/car/{ids}")//me permet de créer l'adresse url ex: localhost/8808(nom du port)/carbyid/1 j'aurais si je rentre cette adresse accés l'id de la voiture que je souhaite dans ma liste du tableau sur le moniteur
    public Car getCarById (@PathVariable(name = "ids") int id) {
        return this.service.getCarById(id);
    }

}
