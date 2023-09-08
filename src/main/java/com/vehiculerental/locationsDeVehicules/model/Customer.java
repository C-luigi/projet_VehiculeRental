package com.vehiculerental.locationsDeVehicules.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="first_name\t")
    private String first_name	;
    @Column(name="birth_date")
    private Date birth_date;
    @Column(name="permit")
    private int permit;

    public void setIdCustomer(int id) {
        this.id = id;
    }
}
