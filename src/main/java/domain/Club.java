/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;


public class Club {
    
    private PersonService lidService;
    
    public Club(){
        lidService = new PersonService();
    }
    
    public void addPerson(Person p){
        lidService.add(p);
        //lidService.addDB(p);
    }
    
    public void removeLid(int id){
        lidService.remove(id);
        //lidService.removeDB(id);
    }
    
    public void editLid(String rijksregistersnr, String naam, String voornaam, Adres adres, boolean heeftBetaald){
        Person pers = new Person( rijksregistersnr, naam, voornaam, adres);
        lidService.edit(pers);
        //lidService.editDB(pers);
    }
    public List<Person> getAllLid(){
        return lidService.getAll();
        //return lidService.getAllDB();
    }
    
    public void betaal(String naam, String voornaam){
        lidService.betaal(naam, voornaam);
        //lidService.betaalDB(naam,voornaam);
    }
    
    
    
}
