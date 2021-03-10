package com.example.demoJpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicule
{
    private String plateNumber;

    private Long id;

    private String brand;

    private int price;

    public String getPlateNumber()
    {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }

    public String getBrand()
    {
        return brand;

    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getPrice()
    {
        return price;

    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
}
