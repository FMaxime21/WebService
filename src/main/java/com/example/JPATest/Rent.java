package com.example.JPATest;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Rent
{

    private Date beginRent;
    private Date endRent;
    private Vehicule vehicule;
    private long id;
    private Person person;

    public Rent()
    {
        super();
    }

    public Rent(Date beginRent, Date endRent)
    {
        super();
        this.beginRent = beginRent;
        this.endRent = endRent;
    }
    @ManyToOne(cascade=CascadeType.ALL)
    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @ManyToOne
    public Vehicule getVehicule()
    {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule)
    {
        this.vehicule = vehicule;
    }

    public Date getBeginRent()
    {
        return beginRent;
    }

    public void setBeginRent(Date beginRent)
    {
        this.beginRent = beginRent;
    }

    public Date getEndRent()
    {
        return endRent;
    }

    public void setEndRent(Date endRent)
    {
        this.endRent = endRent;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", debutRent='" + beginRent + '\'' +
                ", endRent=" + endRent +
                '}';
    }
}
