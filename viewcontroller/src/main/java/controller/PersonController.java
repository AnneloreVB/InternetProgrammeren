package controller;


import domain.Person;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


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
    @RequestMapping(value="/new" ,method = RequestMethod.POST)
    public String save( @ModelAttribute ("Person") Person person){
        if(service.containsPerson(person)){
            service.editPerson(person);
        }
        else{
            Person p = (Person)person;
           service.addPerson(p); 
        }
       return "redirect:/person.htm";
    }
    @RequestMapping(value="/{rijksregistersnr}", method = RequestMethod.GET)
    public ModelAndView getEditForm(@PathVariable String rijksregistersnr){
        return new ModelAndView("personForm","person",service.getPerson(rijksregistersnr));
    }
    
}

