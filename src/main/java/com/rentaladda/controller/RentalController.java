package com.rentaladda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RentalController {

    @RequestMapping(value = "/rentalPage")
    public String showRentalPage(Model model){
        model.addAttribute("isEnabledSignUp",true);
        model.addAttribute("isEnabledLogin",true);
        model.addAttribute("isLoggedIn",false);
        return "rentalPage";
    }

    @RequestMapping(value = "/fetchRentalData/{searchKeyword}")
    public String fetchRentalData(Model model){
        model.addAttribute("isLoggedIn",true);
        return "rentalPage";
    }

    @RequestMapping(value = "/insertRentalData/{Gadget}")
    public String insertRentalData(Model model){

        model.addAttribute("isLoggedIn",true);
        return "rentalPage";
    }

    @RequestMapping(value = "/updateRentalData")
    public String updateRentalData(Model model){

        model.addAttribute("isLoggedIn",true);
        return "rentalPage";
    }

    @RequestMapping(value = "/deleteRentalData")
    public String deleteRentalData(Model model){

        model.addAttribute("isLoggedIn",true);
        return "rentalPage";
    }


}
