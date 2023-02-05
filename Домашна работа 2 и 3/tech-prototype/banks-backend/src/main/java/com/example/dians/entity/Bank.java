package com.example.dians.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "banks")
@Data
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false,length = 300)
    private String name;

    @Column(name = "address", nullable = false,length = 300)
    private String address;

    @Column(name = "city", nullable = false,length = 300)
    private String city;

    @Column(name = "longitude", nullable = false,length = 250)
    private double longitude;

    @Column(name = "latitude", nullable = false,length = 250)
    private double latitude;

    public Bank(String name, String address, String city, double longitude, double latitude) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Bank() {

    }
}