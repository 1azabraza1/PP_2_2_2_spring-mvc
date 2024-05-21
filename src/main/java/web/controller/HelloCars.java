package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarDao;

@Controller

public class HelloCars {

    private final CarDao carDao;

    @Autowired
    public HelloCars(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public String getOfCount(@RequestParam(name = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", carDao.getCars(count));
        return "cars";
    }


}
