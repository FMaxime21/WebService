package com.example.demoJpa;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car extends Vehicule
{

    private String brand;

    private String plateNumber;

    private int price;

    private int numberOfSeats;

    @Override
    public String getPlateNumber()
    {
        return plateNumber;
    }

    @Override
    public void setPlateNumber(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }

    @Override
    public String getBrand()
    {
        return brand;

    }

    @Override
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    @Override
    public int getPrice()
    {
        return price;

    }

    @Override
    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getNumberOfSeats()
    {
        return numberOfSeats;

    }

    public void setNumberOfSeats(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
    }

}