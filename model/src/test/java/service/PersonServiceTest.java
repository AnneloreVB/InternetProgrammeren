/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Address;
import domain.Person;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author xNlor
 */
public class PersonServiceTest {
    private PersonService serviceMap = new PersonService("Map");
    private PersonService serviceDB = new PersonService("DB");
    private Address a = new Address("Nollekensstraat",7,3061,"Leefdaal");
    private Person p = new Person("r0457024","Van Buekenhout","Annelore",a);
    
   /* @Test
    public void addPersonToMapWorks(){
        serviceMap.add(p);
        Collection<Person> persons = serviceMap.getAll();
        for(Person pe : persons){
            System.out.println(pe.toString());
        }
        assertEquals(1,persons.size());
        
        
    }
    @Test
    public void addPersonToDBWorks(){
        serviceDB.add(p);
         Collection<Person> persons = serviceDB.getAll();
         for(Person pe : persons){
            System.out.println(pe.toString());
        }
        assertEquals(1,persons.size());
    }*/
}
