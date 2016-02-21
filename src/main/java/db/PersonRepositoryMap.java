/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.DomainException;
import domain.Lid;
import domain.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Annelore pc
 */
public class PersonRepositoryMap implements PersonRepository {
    
    Map<Integer,Person> persons;
    private int lastUsedId;
            
    public PersonRepositoryMap(){
         persons = new HashMap<Integer,Person>();
         lastUsedId = 0;
    }
    
    @Override
    public Person get(int id) {
        return persons.get(id);
    }

    @Override
    public List<Person> getAll() {
        return (ArrayList)persons.values();
    }

    @Override
    public void add(Person p) {
        if(p == null){
            throw new DomainException("geef een geldige Person in");
        }
        if(!persons.containsValue(p)){
           persons.put(generateNewId(), p);
           setLastUsedId(generateNewId());
        }
    }

    @Override
    public void update(Person p) {
        if(p == null){
            throw new DomainException("geef een geldige person in");
        }
        
        for(Person pers : persons.values()){
            if(pers.getVoornaam().equals(p.getVoornaam())&& pers.getNaam().equals(p.getNaam())){
                pers = p;
            }
        }
    }
    public void delete(int id) {
         if(id == 0){
            throw new DomainException("geef geldige Person in");
        }
        persons.remove(id);
    }
    public int getLastUsedId(){
        return this.lastUsedId;
    }
    private void setLastUsedId(int id) {
        this.lastUsedId = id;
    }
    @Override
    public int generateNewId(){
        return getLastUsedId()+1;
    }
    
    public void betaal(String naam, String voornaam){
        if(naam == null || voornaam == null){
            throw new DomainException("geef een geldig lid in");
        }
        for(Person p: persons.values()){
            if(p.getVoornaam().equals(voornaam)&& p.getNaam().equals(naam)){
                if(p instanceof Lid){
                    Lid l = (Lid) p;
                    l.betaal();
                }
            }
        }
    }

    

}
