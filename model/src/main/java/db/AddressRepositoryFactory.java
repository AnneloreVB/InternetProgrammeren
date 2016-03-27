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
    
    public AddressRepository getRepository(TypeDB type){
        if(type.equals(TypeDB.PersonDB) || type.equals(TypeDB.PersonMap)){
            throw new DBException("geef geldig ADDRESS type in");
        }
        if(type.equals(TypeDB.AddressDB)){
            //return new AddressRepositoryDB(); -> nog niet geïmplementeerd
        }
        return new AddressRepositoryMap();
    }
}
