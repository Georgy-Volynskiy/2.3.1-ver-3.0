package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> numberOfCars (List<Car> cars, Integer number);
}