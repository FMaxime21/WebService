package com.example.JPATest;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vehicule
{
    private List<Rent> rents = new ArrayList<Rent>();

    private String plateNumber;
    private Long id;
    private String brand;
    private int price;

    public Vehicule()
    {
        super();
    }

    public Vehicule(String plateNumber)
    {
        super();
        this.plateNumber = plateNumber;
    }

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

    @OneToMany(mappedBy="vehicule", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    public List<Rent> getRents()
    {
        return rents;
    }

    public void setRents(List<Rent> rents)
    {
        this.rents = rents;
    }

}

