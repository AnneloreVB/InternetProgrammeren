/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import db.PersonRepository;
import db.PersonRepositoryMap;
import domain.DomainException;
import domain.Person;
import java.util.Collection;
import java.util.List;


public class PersonService {
    
    PersonRepository repository;
    
    public PersonService(){
        repository = new PersonRepositoryMap();
    }
    public Person getPerson(int id){
        return repository.get(id);
    }
    public void add(Person p){
        if(p == null){
            throw new DomainException("geef geldige persoon in");
        }
        repository.add(p);
    }
    public void remove(int id){
        repository.delete(id);
    }
    
    public void edit(Person p){
       if(p == null){
            throw new DomainException("geef geldige persoon in");
        } 
        repository.update(p);
    }
    public Collection<Person> getAll(){
        return repository.getAll();
    }
    public void betaal(String naam, String voornaam){
        repository.betaal(naam, voornaam);
    }
    
}
