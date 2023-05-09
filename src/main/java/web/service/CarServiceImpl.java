package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> buildCarsByAmount(int amount) {
        List<Car> carList = List.of(
                new Car("KIA", 10, 1),
                new Car("BMW", 20, 2),
                new Car("Ford", 30, 3),
                new Car("Volvo", 40, 4),
                new Car("Chery", 50, 5));
        return carList;
    }

    @Override
    public List<Car> getCarsByAmount(List<Car> carList, int amount) {
        if (amount > carList.size() | amount < 0) {
            return carList.stream().toList();
        } else {
            return carList.stream().limit(amount).toList();
        }
    }
}