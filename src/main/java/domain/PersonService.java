/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import db.PersonRepository;
import db.PersonRepositoryMap;
import java.util.List;


public class PersonService {
    
    PersonRepository repository;
    
    public PersonService(){
        repository = new PersonRepositoryMap();
    }
    
    public void add(Person p){
        repository.add(p);
    }
    public void remove(int id){
        repository.delete(id);
    }
    
    public void edit(Person p){
        repository.update(p);
    }
    public List<Person> getAll(){
        return repository.getAll();
    }
    public void betaal(String naam, String voornaam){
        repository.betaal(naam, voornaam);
    }
    
}
