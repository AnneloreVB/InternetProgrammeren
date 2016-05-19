/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import db.PersonRepository;
import db.PersonRepositoryFactory;
import domain.Address;
import domain.DomainException;
import domain.Person;

import java.util.Collection;



public class PersonService {
    
    private PersonRepositoryFactory factory;
    private PersonRepository repository;
    private AddressService addressService;
    
    public PersonService(String geheugen){
        factory =  new PersonRepositoryFactory();
        repository = factory.getRepository(geheugen);
        Address a1= new Address("nollekensstraat",70,3061,"Leefdaal");
        Person p1 =  new Person("r0457024","VB","Annelore",a1 );
        repository.add(p1);
    }
    public Person getPerson(String rijksregisternr){
        return repository.get(rijksregisternr);
    }
    public void add(Person p){
        if(p == null){
            throw new DomainException("geef geldige persoon in");
        }
        //addressService.addAddress(p.getAdres());
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
    public Collection<Person> getAll(){
        return repository.getAll();
    }
    
    
}
