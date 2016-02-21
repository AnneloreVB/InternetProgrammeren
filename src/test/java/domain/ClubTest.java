package domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    Adres geldigAdres = new Adres("Vlostraat",12,"B",1000,"Brussel");
    Person geldigeP = new Person("nummer","Jansens","Jan",geldigAdres);
    Person p2 = new Person("Meu","Jansens","Jan",geldigAdres);
    
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
        assertFalse(club.getPerson(1) == null);
    }
    @Test (expected = DomainException.class)
    public void test_addPerson_gooit_exception_bij_persoon_null(){
        club.addPerson(null);
    }
    @Test
    public void test_removePerson_verwijdert_persoon(){
        club.removePerson(1);
        assertTrue(club.getPerson(1)== null);
    }
    @Test (expected = DomainException.class)
    public void test_removePerson_geeft_exception_als_id_null(){
        club.removePerson(0);
    }
    @Test (expected = DomainException.class)
    public void test_editPerson_geeft_exception_als_persoon_null(){
        club.addPerson(geldigeP);
        club.editPerson(null);
    }
    
}
