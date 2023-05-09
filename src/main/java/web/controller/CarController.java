package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService = new CarServiceImpl();
    private final List<Car> carList = carService.buildCarsByAmount(5);

    @GetMapping(value = "/")
    public String getCarList(ModelMap model, @RequestParam(value = "count", required = false) Integer amount) {
        model.addAttribute("cars", amount == null
                ? carService.getCarsByAmount(carList, carList.size())
                : carService.getCarsByAmount(carList, amount));
        return "cars";
    }
}