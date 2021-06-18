package com.realdolmen.RDCars.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Cat")
    private String cat;
    @Column(name = "Brand")
    private String brand;
    @Column(name = "Model")
    private String model;
    @Column(name = "Pack")
    private String pack;
    @Column(name = "List_price_incl_real_VAT")
    private Double listPrice;
    @Column(name = "Amount_upgrade_incl_21_VAT")
    private Double upgrade;
    @Column(name = "Amount_Downgrade_incl_21_VAT")
    private Double downgrade;

}
