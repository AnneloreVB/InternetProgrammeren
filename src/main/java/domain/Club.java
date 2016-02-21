/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Collection;
import java.util.List;


public class Club {
    
    private PersonService lidService;
    
    public Club(){
        lidService = new PersonService();
    }
    
    public void addPerson(Person p){
        if(p == null){
            throw new DomainException("geef geldige persoon op");
        }
        lidService.add(p);
        
    }
    
    public void removePerson(int id){
        lidService.remove(id);
        
    }
    
    public void editPerson(Person p){
        if(p == null){
            throw new DomainException("geef geldige persoon op");
        }
        lidService.edit(p);
        //lidService.editDB(pers);
    }
    public Person getPerson(int id){
        return lidService.getPerson(id);
    }
    public Collection<Person> getAllLid(){
        return lidService.getAll();
        //return lidService.getAllDB();
    }
    
    public void betaal(String naam, String voornaam){
        lidService.betaal(naam, voornaam);
        //lidService.betaalDB(naam,voornaam);
    }
    
    
    
}
