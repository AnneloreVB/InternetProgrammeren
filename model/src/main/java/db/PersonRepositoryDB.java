/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collection;
import javax.persistence.PersistenceUnit;



/**
 *
 * @author Annelore pc
 */
public class PersonRepositoryDB implements PersonRepository{
    @PersistenceUnit
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
    public Collection<Person> getAll() {
       Query query = manager.createQuery("SELECT e FROM Person e");
       return query.getResultList();
    }

    @Override
    public void add(Person object) {
        //try{
            manager.getTransaction().begin();
            manager.persist(object);
            manager.flush();
            manager.clear();
            manager.getTransaction().commit();
        //}
        /*catch(Exception e){
            throw new DBException(e.getMessage());
        }*/
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
