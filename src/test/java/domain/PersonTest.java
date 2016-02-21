/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

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
public class PersonTest {
    
    Adres geldigAdres = new Adres("Vlostraat",12,"B",1000,"Brussel");
    Person geldigeP = new Person("nummer","Jansens","Jan",geldigAdres);
    
    public PersonTest() {
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
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_Rijksregister_Is_NULL(){
        Person p = new Person(null,"Jansens","Jan",geldigAdres);
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_naam_Is_NULL(){
        Person p = new Person("brrr",null,"Jan",geldigAdres);
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_voornaam_Is_NULL(){
        Person p = new Person("brr","Jansens",null,geldigAdres);
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_adres_Is_NULL(){
        Person p = new Person("brr","Jansens","Jan",null);
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_adres_Is_niet_geldig(){
        Person p = new Person("brr","Jansens","Jan",null);
    }
    @Test 
    public void test_Constructor_Works(){
        Person p = new Person("brr","Jansens","Jan",geldigAdres);
    }
    
    @Test 
    public void test_getNaam_werkt(){
        assertEquals("Jansens",geldigeP.getNaam());
    }
    @Test 
    public void test_getVoorNaam_werkt(){
        assertEquals("Jan",geldigeP.getVoornaam());
    }
    @Test 
    public void test_getAdres_werkt(){
        assertEquals(geldigAdres,geldigeP.getAdres());
    }
    
    
}
