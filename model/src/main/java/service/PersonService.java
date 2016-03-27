/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import db.PersonRepository;
import db.PersonRepositoryFactory;
import db.PersonRepositoryMap;
import db.TypeDB;
import domain.DomainException;
import domain.Person;
import java.util.ArrayList;



public class PersonService {
    
    private PersonRepositoryFactory factory;
    private PersonRepository repository;
    
    public PersonService(){
        factory =  new PersonRepositoryFactory();
        repository = factory.getRepository(TypeDB.PersonMap);
    }
    public Person getPerson(String rijksregisternr){
        return repository.get(rijksregisternr);
    }
    public void add(Person p){
        if(p == null){
            throw new DomainException("geef geldige persoon in");
        }
        repository.add(p);
    }
    public void remove(String rijksregisternr){
        repository.delete(rijksregisternr);
    }
    
    public void edit(Person p){
       if(p == null){
            throw new DomainException("geef geldige persoon in");
        } 
        repository.update(p);
    }
    public ArrayList<Person> getAll(){
        return repository.getAll();
    }
    public void betaal(String naam, String voornaam){
        repository.betaal(naam, voornaam);
    }
    
}
