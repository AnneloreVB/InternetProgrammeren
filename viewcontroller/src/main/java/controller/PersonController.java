package controller;


import domain.Address;
import domain.Person;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping(value="/new", method=RequestMethod.GET)
    public ModelAndView getnewForm(){
        return new ModelAndView("personForm","person", new Person());
    }
    @RequestMapping(method = RequestMethod.POST)
    public String save(HttpServletRequest request){
        try{
        String rijksregistersnr = request.getParameter("rijksregistersnr");
        String naam = request.getParameter("naam");
        String voornaam = request.getParameter("voornaam");
        String straat = request.getParameter("straat");
        int huisnr = Integer.parseInt(request.getParameter("huisnr"));
        String bus = request.getParameter("bus");
        int postcode = Integer.parseInt(request.getParameter("postcode"));
        String gemeente = request.getParameter("gemeente");
        Address adres = new Address(straat,huisnr,bus,postcode,gemeente);
        Person person = new Person(rijksregistersnr,naam, voornaam, adres);
        
            service.addPerson(person);
        }
        catch(Exception e){
            return "personForm";
        }
        
        return "redirect:/person.htm";
    }
    @RequestMapping(value="/{rijksregistersnr}", method = RequestMethod.GET)
    public ModelAndView getEditForm(@PathVariable String rijksregistersnr){
        return new ModelAndView("personForm","person",service.getPerson(rijksregistersnr));
    }
    
}

