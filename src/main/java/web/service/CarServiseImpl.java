package web.service;

import web.model.Car;

import java.util.List;

public class CarServiseImpl implements CarService {
    private final List<Car> cars;
    private final Integer number;

    public CarServiseImpl(List<Car> cars, int number) {
        this.cars = cars;
        this.number = number;
    }

    @Override
    public List<Car> numberOfCars(List<Car> cars, Integer number) {
        if (number > cars.size()) number = cars.size();
        return cars.subList(0, number);
    }
}