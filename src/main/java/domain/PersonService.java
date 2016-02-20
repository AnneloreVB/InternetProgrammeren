/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PersonService {
    Map<Integer,Person> persons;
    private int lastUsedId;
    
    public PersonService(){
        persons = new HashMap<Integer,Person>();
        lastUsedId =0;
    }
    public void add(Person p){
        if(p == null){
            throw new DomainException("geef een geldige Person in");
        }
        if(!persons.containsValue(p)){
           persons.put(getLastUsedId()+1, p);
           setLastUsedId(getLastUsedId()+1);
        }
    }
    public void addDB(Person p){
        
    }
    public void remove(int id){
        if(id == 0){
            throw new DomainException("geef geldige Person in");
        }
        persons.remove(id);
    }
    public void removeDB(int id){
        
    }
    public void edit(Person p){
        if(p == null){
            throw new DomainException("geef een geldige person in");
        }
        
        for(Person pers : persons.values()){
            if(pers.getVoornaam().equals(p.getVoornaam())&& pers.getNaam().equals(p.getNaam())){
                pers = p;
            }
        }
    }
    public void editDB(Person p){
        
    }
    public ArrayList<Person> getAll(){
        return (ArrayList)persons.values();
    }
    public ArrayList<Person> getAllDB(){
        return null;
    }
    public void betaal(String naam, String voornaam) throws DomainException{
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
    public void betaalDB(int id){
        
    }
    public int getLastUsedId(){
        return this.lastUsedId;
    }
    private void setLastUsedId(int id){
        this.lastUsedId = id;
    }
}
