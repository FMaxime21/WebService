
package com.example.demoWebService;

import java.util.List;
import com.example.demoWebService.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;


public class CarServiceClient
{

    private static final Logger log = LoggerFactory.getLogger(CarServiceClient.class);

    public static void main(String[] args)
    {

        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<Car> request = new HttpEntity<>(new Car("66QT76", "Renault", 10));
        restTemplate.postForObject("http://localhost:8080/cars", request, Car.class);

        List cars = restTemplate.getForObject("http://localhost:8080/cars", List.class);
        log.info(cars.toString());

    }

}