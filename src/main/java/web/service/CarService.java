package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> buildCarsByAmount(int amount);
    List<Car> getCarsByAmount(List<Car> carList, int amount);
}