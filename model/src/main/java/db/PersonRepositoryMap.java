/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.DomainException;
import domain.Member;
import domain.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Annelore pc
 */
public class PersonRepositoryMap implements PersonRepository {
    
    private static Map<String,Person> persons;
    
            
    public PersonRepositoryMap(){
         persons = new HashMap<String,Person>();
    }
    
    @Override
    public Person get(String rijksregisternr) {
        return persons.get(rijksregisternr);
    }

    @Override
    public ArrayList<Person> getAll() {
        return new ArrayList( persons.values());
    }

    @Override
    public void add(Person p) {
        if(p == null){
            throw new DomainException("geef een geldige Person in");
        }
        if(!persons.containsValue(p)){
           persons.put(p.getrRijksregistersnr(), p);
        }
    }
    public void update(Person p) {
        if(p == null){
            throw new DomainException("geef een geldige person in");
        }
        
        for(Person pers : persons.values()){
            if(pers.getrRijksregistersnr().equals(p.getrRijksregistersnr())){
                pers = p;
            }
        }
    }
    public void delete(String rijksregisternr) {
         if(rijksregisternr == null){
            throw new DomainException("geef geldige Person in");
        }
        persons.remove(rijksregisternr);
    }
    public void betaal(String naam, String voornaam){
        if(naam == null || voornaam == null){
            throw new DomainException("geef een geldig lid in");
        }
        for(Person p: persons.values()){
            if(p.getVoornaam().equals(voornaam)&& p.getNaam().equals(naam)){
                if(p instanceof Member){
                    Member l = (Member) p;
                    l.betaal();
                }
            }
        }
    }

}