/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Person;
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
public class PersonRepositoryDB implements PersonRepository{
//    @PersistenceUnit
    private EntityManagerFactory factory;
    private EntityManager manager;
    
    public PersonRepositoryDB(String name){
        factory = Persistence.createEntityManagerFactory(name);
        manager = factory.createEntityManager();
    }
    public void closeConnection(){
        try{
            manager.close();
            factory.close();
        }
        catch(Exception e){
            throw new DBException(e.getMessage());
        }
    }
    @Override
    public Person get(String rijksregisternr) {
        try{
            Person p = manager.find(Person.class, rijksregisternr);
            return p;
        }
        catch(Exception e){
            throw new DBException(e.getMessage());
        }
    }

    @Override
    public List<Person> getAll() {
        try{
            Query query = manager.createQuery("select p from Person p");
            return query.getResultList();
        }
        catch(Exception e){
            throw new DBException(e.getMessage());
        }
    }

    @Override
    public void add(Person person) {
        try{
            manager.getTransaction().begin();
            manager.merge(person);
            manager.flush();
            manager.getTransaction().commit();
        }
        catch(Exception e){
            throw new DBException(e.getMessage());
        }
    }

    @Override
    public void update(Person person) {
        manager.getTransaction().begin();
        manager.merge(person);
        manager.flush();
        manager.getTransaction().commit();
    }

    @Override
    public void delete(String rijksregisternr) {
        manager.getTransaction().begin();
        Person p = this.get(rijksregisternr);
        manager.remove(p);
        manager.flush();
        manager.getTransaction().commit();
    }
    
    
}
