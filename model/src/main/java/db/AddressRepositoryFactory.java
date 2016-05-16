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
public class AddressRepositoryFactory {
    
    public AddressRepository getRepository(String geheugen){
        if(geheugen.equals("DB")){
            return new AddressRepositoryDB("DomainPU");
        }
        return new AddressRepositoryMap();
    }
}
