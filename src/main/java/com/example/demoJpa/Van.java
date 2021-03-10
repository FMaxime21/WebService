package com.example.demoJpa;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule
{
    private String plateNumber;

    private int maxWeight;

    private String brand;

    private int price;

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

    public int getMaxWeight()
    {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight)
    {
        this.maxWeight = maxWeight;
    }
}
