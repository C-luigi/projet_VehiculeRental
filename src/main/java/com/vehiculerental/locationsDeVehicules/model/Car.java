package com.vehiculerental.locationsDeVehicules.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
@Entity
@Table(name="Car")
public class Car {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCar;
    @Column(name="registration")
    private String registration;
    @Column(name="brand")
    private String brand;
    @Column(name="model")
    private String model;
    @Column(name="color")
    private String color;
    @Column(name="price_reservation")
    private int price_reservation;
    @Column(name="price_wear")
    private int price_wear;
    @Column(name="fiscal_horse")
    private String fiscal_horse;
    @Column(name="disponibility")
    private String  disponibility;

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }
}
