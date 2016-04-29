/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Address;
import domain.DomainException;
import domain.Person;
import java.util.ArrayList;
import service.PersonService;
import java.util.Collection;



public class Club {
    
    private PersonService personService;
    private AddressService addressService;
    
    public Club(){
        personService = new PersonService();
        addressService = new AddressService();
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
    
   
    public Address getAddressWithId(int id){
        return addressService.getAddress(id);
    }
    public ArrayList<Address> getAllAddresses(){
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
