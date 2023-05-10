package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @GetMapping(value = "/")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            Model model) {

        List<Car> cars = new ArrayList<>();
        CarService cs = new CarServiseImpl(cars, cars.size());

        cars.add(new Car("KIA", 10, 1));
        cars.add(new Car("BMW", 20, 2));
        cars.add(new Car("Ford", 30, 3));
        cars.add(new Car("Volvo", 40, 4));
        cars.add(new Car("Chery", 50, 5));

        if (count == null) count = cars.size();
        model.addAttribute("cars", cs.numberOfCars(cars, count));
        return "cars";
    }
}