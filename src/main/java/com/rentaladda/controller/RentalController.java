package com.rentaladda.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.rentaladda.model.Customer;
import com.rentaladda.model.CustomerRepository;
import com.rentaladda.model.Information;
import com.rentaladda.model.RentalAddaInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RentalController {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private RentalAddaInformation infoRepository;

    @RequestMapping(value="/LoginPopup")
    public String LoginPopup(Model model){
        model.addAttribute("isEnabledSignUp",true);
        model.addAttribute("isEnabledLogin",true);
        model.addAttribute("isLoggedIn",false);
        //Was testing AOP here
        return "LoginPopup";
    }

    @RequestMapping(value = "/fetchRentalData/{searchKeyword}" , produces = "application/json")
    public Customer fetchRentalData(Model model, @PathVariable(value="searchKeyword") String searchKeyword){
        //model.addAttribute("isLoggedIn",true);
//        StringBuffer returnData = new StringBuffer();
//        for(Customer customer: repository.findAll()){
//            returnData.append(customer.firstName);
//            returnData.append(customer.lastName);
//        }
   System.out.println(repository.findByFirstName(searchKeyword));
        return repository.findByFirstName(searchKeyword) ;
    }

    @RequestMapping(value = "/fetchRentalInformation/{searchKeyword}" , produces = "application/json")
    public String fetchRentalInformation(Model model, @PathVariable(value="searchKeyword") String searchKeyword){
        Information ex = new Information(searchKeyword);
        Example<Information> example = Example.of(ex);
        String text = "";
        Optional<Information> information  = infoRepository.findOne(example);
        if(information.isPresent()){
           text =  information.get().text;
        }


        return text ;
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
