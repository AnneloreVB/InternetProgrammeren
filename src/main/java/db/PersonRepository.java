/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Person;
import java.util.List;

/**
 *
 * @author Annelore pc
 */
public interface PersonRepository {
    
    Person get(int id);

    List<Person> getAll();

    void add(Person person);

    void update(Person person);

    void delete(int id);
    
    int getLastUsedId();
    int generateNewId();
    
    void betaal(String s, String s1);
}
