/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Address;
import domain.Person;
import org.junit.Test;

/**
 *
 * @author xNlor
 */
public class PersonServiceTest {
    
    PersonService service = new PersonService("DB");
    @Test
    public void addPersonWerkt(){
        Address a = new Address("Nollekensstraat",7,3061,"Leefdaal");
        Person p = new Person("r0457024","Van Buekenhout","Annelore",a);
        service.add(p);
    }
}
