/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import domain.*;

public class Club {
    
    private PersonService lidService;
    
    public Club(){
        lidService = new PersonService();
    }
    
    public void addPerson(Person p) throws DomainException{
        lidService.add(p);
        //lidService.addDB(p);
    }
    
    public void removeLid(int id) throws DomainException {
        lidService.remove(id);
        //lidService.removeDB(id);
    }
    
    public void editLid(String rijksregistersnr, String naam, String voornaam, Adres adres, boolean heeftBetaald) throws DomainException{
        Person pers = new Person( rijksregistersnr, naam, voornaam, adres);
        lidService.edit(pers);
        //lidService.editDB(pers);
    }
    public ArrayList<Person> getAllLid(){
        return lidService.getAll();
        //return lidService.getAllDB();
    }
    
    public void betaal(String naam, String voornaam) throws DomainException{
        lidService.betaal(naam, voornaam);
        //lidService.betaalDB(naam,voornaam);
    }
    
    
    
}
