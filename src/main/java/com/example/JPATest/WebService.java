package com.example.JPATest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@SpringBootApplication
@RestController
public class WebService
{
    CarRepository carRepository;
    VanRepository vanRepository;
    PersonRepository personRepository;
    RentRepository rentRepository;

    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    Date date = simpleDateFormat.parse("2020-03-10");
    Date date2 = simpleDateFormat.parse("2020-04-10");

    @Autowired
    public WebService(CarRepository carRepository, VanRepository vanRepository, PersonRepository personRepository, RentRepository rentRepository) throws ParseException {
        this.carRepository = carRepository;
        Car car = new Car();
        car.setPrice(1000);
        car.setBrand("Renault");
        car.setPlateNumber("AA11BB");
        car.setNumberOfSeats(5);

        this.personRepository = personRepository;
        this.rentRepository = rentRepository;

        Rent rent = new Rent(date,date2);
        Person person = new Person("Yugi",18);

        car.getRents().add(rent);
        person.getRents().add(rent);
        rent.setPerson(person);
        rent.setVehicule(car);

        //personRepository.save(person);
        //rentRepository.save(rent);
        carRepository.save(car);

        this.vanRepository = vanRepository;
        Van van = new Van();
        van.setPrice(2000);
        van.setBrand("Peugeot");
        van.setPlateNumber("CC22DD");
        van.setMaxWeight(1000);

        vanRepository.save(van);
        carRepository.findAll();
    }

    @GetMapping("/cars")
    public Iterable<Car> getAllCars()
    {
        return carRepository.findAll();
    }

    @GetMapping("/vans")
    public Iterable<Van> getAllVans()
    {
        return vanRepository.findAll();
    }

    @GetMapping("/persons")
    public Iterable<Person> getAllPersons()
    {
        return personRepository.findAll();
    }

    @GetMapping("/rent")
    public Iterable<Rent> getAllRents()
    {
        return rentRepository.findAll();
    }

    @PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
    public void addCar(@RequestBody Car car)
    {

    }
}
