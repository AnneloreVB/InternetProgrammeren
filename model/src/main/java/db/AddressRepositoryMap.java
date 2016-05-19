/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Annelore pc
 */
public class AddressRepositoryMap implements AddressRepository {
    private static Map<Integer,Address> adresses;
    
            
    public AddressRepositoryMap(){
         adresses = new HashMap<Integer,Address>();
    }
    @Override
    public Address get(int id) {
        if(id == 0 || !adresses.containsKey(id) ){
            throw new DBException("geef geldige id in");
        }
        return adresses.get(id);
    }

    @Override
    public Collection<Address> getAll() {
        return new ArrayList<>( adresses.values());
    }

    @Override
    public void add(Address adres) {
        if(adres == null ){
            throw new DBException("geef geldig adres in");
        }
        adresses.put(adres.getId(), adres);
    }

    @Override
    public void update(Address adres) {
        if(adres == null) {
            throw new DBException("geef geldig adres in");
        } 
        for(Address a : adresses.values()){
            if(a.equals(adres)){
                adresses.replace(a.getId(), adres);
            }
        }
    }
    @Override
    public void delete(int id) {
        if(id == 0 || adresses.containsKey(id)){
            throw new DBException("geef geldige id in");
        }
        adresses.remove(id); 
    }
    
}
