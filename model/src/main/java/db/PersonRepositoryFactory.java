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
    
    public PersonRepository getRepository(String geheugen){
        if(geheugen.equals("DB")){
            return new PersonRepositoryDB("DomainPU");
        }
        return new PersonRepositoryMap();
    }
}
