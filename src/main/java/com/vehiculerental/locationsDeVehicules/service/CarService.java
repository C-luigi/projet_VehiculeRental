package com.vehiculerental.locationsDeVehicules.service;

import com.vehiculerental.locationsDeVehicules.model.Car;
import com.vehiculerental.locationsDeVehicules.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // Create
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    // Read (get one by ID)
    public Car getCarById(int id) {
        return carRepository.findById(id).orElse(null);
    }

    // Read (get all)
    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    // Update
    public Car updateCar(int id, Car car) {
        if (carRepository.existsById(id)) {
            car.setIdCar(id);
            return carRepository.save(car);
        }
        return null;
    }

    // Delete
    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }
}