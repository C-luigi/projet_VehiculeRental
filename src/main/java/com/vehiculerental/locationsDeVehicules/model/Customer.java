package com.vehiculerental.locationsDeVehicules.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;

public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idCustomer;
    @Column(name="name")
    private String name;
    @Column(name="first_name\t")
    private String first_name	;
    @Column(name="birth_date")
    private Data birth_date;
    @Column(name="permit")
    private int permit;

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
}
