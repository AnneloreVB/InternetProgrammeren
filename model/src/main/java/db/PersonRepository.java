/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Person;

import java.util.Collection;

/**
 *
 * @author Annelore pc
 */
public interface PersonRepository {
    
    Person get(String rijksregisternr);

    Collection<Person> getAll();

    void add(Person person);

    void update(Person person);

    void delete(String rijksregisternr);
    
    
    
    
}
