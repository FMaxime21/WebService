package com.example.demoJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService
{
    CarRepository carRepository;
    VanRepository vanRepository;

    @Autowired
    public WebService(CarRepository carRepository, VanRepository vanRepository)
    {
        this.carRepository = carRepository;
        Car car = new Car();
        car.setPrice(1000);
        car.setBrand("Renault");
        car.setPlateNumber("AA11BB");
        car.setNumberOfSeats(5);
        carRepository.save(car);

        this.vanRepository = vanRepository;
        Van van = new Van();
        van.setPrice(2000);
        van.setBrand("Peugeot");
        van.setPlateNumber("CC22DD");
        van.setMaxWeight(1000);
        vanRepository.save(van);
    }

    @GetMapping("/cars")
    public Iterable<Car> getAllCars()
    {
        return carRepository.findAll();
    }
}
