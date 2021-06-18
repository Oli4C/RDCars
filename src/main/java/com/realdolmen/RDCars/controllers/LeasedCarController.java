package com.realdolmen.RDCars.controllers;

import com.realdolmen.RDCars.models.LeasedCar;
import com.realdolmen.RDCars.services.LeasedCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LeasedCarController {

    @Autowired
    private LeasedCarService leasedCarService;

    //Get All Vehicles
    @GetMapping("leasedcars")
    public String findAll(Model model){
        model.addAttribute("leasedcars", leasedCarService.findAll());
        return "leasedcar";
    }

    @RequestMapping("leasedcars/findById")
    @ResponseBody
    public LeasedCar findById(Integer id)
    {
        return leasedCarService.findById(id);
    }

    //Add Vehicle
    @PostMapping(value="leasedcars/addNew")
    public String addNew(LeasedCar leasedCar) {
        leasedCarService.save(leasedCar);
        return "redirect:/leasedcars";
    }

    @RequestMapping(value="leasedcars/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(LeasedCar leasedCar) {
        leasedCarService.save(leasedCar);
        return "redirect:/leasedcars";
    }

    @RequestMapping(value="leasedcars/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        leasedCarService.delete(id);
        return "redirect:/leasedcars";
    }

}
