package service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import db.DBException;
import domain.Address;
import domain.DomainException;
import domain.Person;
import service.Club;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Annelore pc
 */
public class ClubTest {
    
    Club club = new Club();
    Address geldigAdres = new Address("Vlostraat",12,"B",1000,"Brussel");
    Address geldigAdres2 = new Address("Vlostraat",8,"B",1000,"Brussel");
    Person geldigeP = new Person("nummer","Jansens","Jan",geldigAdres);
    Person personMetAnderAdres = new Person("nummer","Jansens","Jan",geldigAdres2);
    
    public ClubTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test_addPerson_Voegt_person_toe(){
        club.addPerson(geldigeP);
        assertFalse(club.getPerson("nummer") == null);
    }
    @Test (expected = DomainException.class)
    public void test_addPerson_gooit_exception_bij_persoon_null(){
        club.addPerson(null);
    }
    @Test
    public void test_removePerson_verwijdert_persoon(){
        club.removePerson("nummer");
        assertTrue(club.getPerson("nummer")== null);
    }
    @Test (expected = DomainException.class)
    public void test_removePerson_geeft_exception_als_id_null(){
        club.removePerson(null);
    }
    @Test (expected = DomainException.class)
    public void test_editPerson_geeft_exception_als_person_null(){
        club.addPerson(geldigeP);
        club.editPerson(null);
    }
    public void test_editPerson_vervangt_Adres(){
        club.editPerson(personMetAnderAdres);
        assertEquals(personMetAnderAdres,club.getPerson("nummer"));
    }
    @Test
    public void addAddress_voegt_address_toe_aan_DB(){
        club.addAddress(geldigAdres);
        assertTrue(club.getAllAddresses().contains(geldigAdres));
    }
    @Test (expected = DBException.class)
    public void getAddress_geeft_Exception_als_id_is_nul(){
        club.getAddressWithId(0);
    }
    @Test (expected = DBException.class)
    public void getAddress_geeft_Exception_als_address_met_id_niet_bestaat(){
        club.getAddressWithId(5);
    }
    public void getAddress_geeft_address_terug(){
        assertEquals(club.getAddressWithId(geldigAdres.getId()),geldigAdres);
    }
    @Test (expected = DBException.class)
    public void removeAddress_geeft_Exception_als_id_is_nul(){
        club.removeAddress(0);
    }
    
    public void removeAddress_verwijdert_het_address(){
        club.removeAddress(geldigAdres.getId());
        assertFalse(club.getAllAddresses().contains(geldigAdres));
    }
    public void updateAddress_update_het_address(){
        club.addAddress(geldigAdres);
        club.updateAddress(geldigAdres2);
        assertEquals(club.getAddressWithId(geldigAdres.getId()), geldigAdres2);
    }
}
