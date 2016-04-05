package controller;


import domain.Person;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.Club;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annelore pc
 */
@Controller
@RequestMapping(value="/person")
public class PersonController {
    @Autowired
    private service.Club service;
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getPersons(){
        return new ModelAndView("overviewPerson","persons",service.getAllPersons());
    }
}
