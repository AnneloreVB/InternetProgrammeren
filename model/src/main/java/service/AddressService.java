/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import db.AddressRepositoryMap;
import db.AddressRepository;
import db.AddressRepositoryFactory;
import db.TypeDB;
import domain.Address;
import java.util.ArrayList;

public class AddressService {
    
    private AddressRepositoryFactory factory;
    private AddressRepository repository;
    private int lastRecentlyUsedId;
    
    public AddressService(){
        factory = new AddressRepositoryFactory();
        this.repository = factory.getRepository(TypeDB.AddressMap);
        lastRecentlyUsedId =0;
    }
    public void addAddress(Address address){
        address.setId(getLastRecentlyUsedId()+1);
        setLastRecentlyUsedId(getLastRecentlyUsedId()+1);
        repository.add(address);
    }
    public Address getAddress(int id){
        return repository.get(id);
    }
    public ArrayList<Address> getAll(){
        return repository.getAll();
    }
    public void updateAddress(Address address){
        repository.update(address);
    }
    public void removeAddress(int id){
        repository.delete(id);
    }
    public int getLastRecentlyUsedId(){
        return this.lastRecentlyUsedId;
    }
    private void setLastRecentlyUsedId(int id){
        this.lastRecentlyUsedId = id;
    }
}
