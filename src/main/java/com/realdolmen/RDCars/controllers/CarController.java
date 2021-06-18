package com.realdolmen.RDCars.controllers;

import com.realdolmen.RDCars.models.Car;
import com.realdolmen.RDCars.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    //Get All Vehicles
    @GetMapping("cars")
    public String findAll(Model model){
        model.addAttribute("cars", carService.findAll());
        return "car";
    }

    @RequestMapping("cars/findById")
    @ResponseBody
    public Car findById(Integer id)
    {
        return carService.findById(id);
    }

    //Add Vehicle
    @PostMapping(value="cars/addNew")
    public String addNew(Car car) {
        carService.save(car);
        return "redirect:/cars";
    }

    @RequestMapping(value="cars/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Car car) {
        carService.save(car);
        return "redirect:/cars";
    }

    @RequestMapping(value="cars/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        carService.delete(id);
        return "redirect:/cars";
    }

}
