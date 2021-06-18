package com.realdolmen.RDCars.controllers;

import com.realdolmen.RDCars.models.NewCar;
import com.realdolmen.RDCars.models.UsedCar;
import com.realdolmen.RDCars.services.NewCarService;
import com.realdolmen.RDCars.services.UsedCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsedCarController {

    @Autowired
    private UsedCarService usedCarService;

    //Get All Vehicles
    @GetMapping("vehicles")
    public String findAll(Model model){
        model.addAttribute("vehicles", usedCarService.findAll());
        return "vehicle";
    }

    @RequestMapping("vehicles/findById")
    @ResponseBody
    public UsedCar findById(Integer id)
    {
        return usedCarService.findById(id);
    }

    //Add Vehicle
    @PostMapping(value="vehicles/addNew")
    public String addNew(UsedCar usedCar) {
        usedCarService.save(usedCar);
        return "redirect:/vehicles";
    }

    @RequestMapping(value="vehicles/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(UsedCar usedCar) {
        usedCarService.save(usedCar);
        return "redirect:/vehicles";
    }

    @RequestMapping(value="vehicles/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        usedCarService.delete(id);
        return "redirect:/vehicles";
    }

}
