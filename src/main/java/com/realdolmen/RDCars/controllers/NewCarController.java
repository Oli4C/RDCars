package com.realdolmen.RDCars.controllers;

import com.realdolmen.RDCars.models.NewCar;
import com.realdolmen.RDCars.services.NewCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class NewCarController {
    @Autowired
    private NewCarService newCarService;

    //Get All Vehicles
    @GetMapping("vehicles")
    public String findAll(Model model){
        model.addAttribute("vehicles", newCarService.findAll());
        return "vehicle";
    }

    @RequestMapping("vehicles/findById")
    @ResponseBody
    public NewCar findById(Integer id)
    {
        return newCarService.findById(id);
    }

    //Add Vehicle
    @PostMapping(value="vehicles/addNew")
    public String addNew(NewCar newCar) {
        newCarService.save(newCar);
        return "redirect:/vehicles";
    }

    @RequestMapping(value="vehicles/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(NewCar newCar) {
        newCarService.save(newCar);
        return "redirect:/vehicles";
    }

    @RequestMapping(value="vehicles/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        newCarService.delete(id);
        return "redirect:/vehicles";
    }

}
