/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import db.AddressRepository;
import db.AddressRepositoryFactory;
import domain.Address;

import java.util.Collection;

public class AddressService {
    
    private AddressRepositoryFactory factory;
    private AddressRepository repository;
    
    
    public AddressService(String geheugen){
        factory = new AddressRepositoryFactory();
        this.repository = factory.getRepository(geheugen);
        
    }
    public void addAddress(Address address){
        repository.add(address);
    }
    public Address getAddress(int id){
        return repository.get(id);
    }
    public Collection<Address> getAll(){
        return repository.getAll();
    }
    public void updateAddress(Address address){
        repository.update(address);
    }
    public void removeAddress(int id){
        repository.delete(id);
    }
    
}
