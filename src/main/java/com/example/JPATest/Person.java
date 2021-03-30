package com.example.JPATest;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Person
{
    private List<Rent> rents = new ArrayList<Rent>();

    private long id;
    private String name;
    private int age;

    public Person()
    {
        super();
    }

    public Person(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
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

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @OneToMany(mappedBy="person", fetch = FetchType.EAGER)
    @JsonIgnore
    public List<Rent> getRents()
    {
        return rents;
    }

    public void setRents(List<Rent> rents)
    {
        this.rents = rents;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
