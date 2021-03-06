/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Address;
import domain.DomainException;
import domain.Person;

import java.util.Collection;



public class Club {
    
    private PersonService personService;
    private AddressService addressService;
    
    public Club(){
        this("DB");
    }
    public Club(String geheugen){
        personService = new PersonService(geheugen);
        addressService = new AddressService(geheugen);
    }
    
    public void addPerson(Person p){
        if(p == null){
            throw new DomainException("geef geldige persoon op");
        }
        personService.add(p);
    }
    
    public void removePerson(String rijksregisternr){
        personService.remove(rijksregisternr);
        
    }
    
    public void editPerson(Person p){
        if(p == null){
            throw new DomainException("geef geldige persoon op");
        }
        personService.edit(p);
    }
    public Person getPerson(String rijksregisternr){
        return personService.getPerson(rijksregisternr);
    }
    public Collection<Person> getAllPersons(){
        return personService.getAll();
    }
    public boolean containsPerson(Person p){
        if(p == null){
            throw new DomainException("geef geldige persoon in");
        }
        return personService.containsPerson(p);
    }
   
    public Address getAddressWithId(int id){
        return addressService.getAddress(id);
    }
    public Collection<Address> getAllAddresses(){
        return addressService.getAll();
    }
    public void addAddress(Address address){
        addressService.addAddress(address); 
    }
    public void removeAddress(int id){
        addressService.removeAddress(id);
    }
    public void updateAddress(Address address){
        addressService.updateAddress(address);
    }
}
