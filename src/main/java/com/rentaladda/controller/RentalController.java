package com.rentaladda.controller;

import com.rentaladda.model.Customer;
import com.rentaladda.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping(value = "/rentalPage")
    public String showRentalPage(Model model){
        model.addAttribute("isEnabledSignUp",true);
        model.addAttribute("isEnabledLogin",true);
        model.addAttribute("isLoggedIn",false);
        return "rentalPage";
    }

    @RequestMapping(value="/LoginPopup")
    public String LoginPopup(Model model){
        model.addAttribute("isEnabledSignUp",true);
        model.addAttribute("isEnabledLogin",true);
        model.addAttribute("isLoggedIn",false);
        //Was testing AOP here
        return "LoginPopup";
    }

    @RequestMapping(value = "/fetchRentalData/{searchKeyword}" , produces = "application/json")
    public String fetchRentalData(Model model){
        //model.addAttribute("isLoggedIn",true);
        StringBuffer returnData = new StringBuffer();
        for(Customer customer: repository.findAll()){
            returnData.append(customer.firstName);
            returnData.append(customer.lastName);
        }
   System.out.println(repository.findAll());
        return returnData.toString() ;
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
