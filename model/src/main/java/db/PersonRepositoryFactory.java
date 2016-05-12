/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Annelore pc
 */
public class PersonRepositoryFactory {
    
    public PersonRepository getRepository(TypeDB type){
        if(type.equals(TypeDB.AddressDB) || type.equals(TypeDB.AddressMap)){
            throw new DBException("geef geldige PERSON db in");
        }
        if(type.equals(TypeDB.PersonDB)){
            return new PersonRepositoryDB("DomainPU");
        }
        return new PersonRepositoryMap();
    }
}
