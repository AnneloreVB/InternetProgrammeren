/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Address;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

/**
 *
 * @author Annelore pc
 */
public class AddressRepositoryDB implements AddressRepository{
    //@PersistenceUnit
    private EntityManagerFactory factory;
    private EntityManager addressmanager;
    
    public AddressRepositoryDB(String name){
        
        factory = Persistence.createEntityManagerFactory(name);
        addressmanager = factory.createEntityManager();
    }
    public void closeConnection(){
        try{
            addressmanager.close();
            factory.close();
        }
        catch(Exception e){
            throw new DBException(e.getMessage());
        }
    }
    @Override
    public Address get(int id) {
       try{
           Address adres = addressmanager.find(Address.class, id);
           return adres;
       }
       catch(Exception e){
           throw new DBException(e.getMessage());
       }
    }

    @Override
    public List<Address> getAll() {
        try{
            Query query = addressmanager.createQuery("select a from Address a");
            return query.getResultList();
        }
        catch(Exception e){
            throw new DBException(e.getMessage());
        }
    }

    @Override
    public void add(Address adres) {
         try{
            addressmanager.getTransaction().begin();
            addressmanager.persist(adres);
            addressmanager.flush();
            addressmanager.getTransaction().commit();
        }
        catch(Exception e){
            throw new DBException(e.getMessage());
        }
    }

    @Override
    public void update(Address adres) {
        addressmanager.getTransaction().begin();
        addressmanager.merge(adres);
        addressmanager.flush();
        addressmanager.getTransaction().commit();
    }

    @Override
    public void delete(int id) {
        addressmanager.getTransaction().begin();
        Address a = this.get(id);
        addressmanager.remove(a);
        addressmanager.flush();
        addressmanager.getTransaction().commit();
    }
    
}
