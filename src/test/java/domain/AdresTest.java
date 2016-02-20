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
public class AdresTest {
    
    public AdresTest() {
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
    public void test_Constructor_Works_With_straat_Is_NULL(){
        Adres a = new Adres(null,12,"b",1000,"Brussel");
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_huisnr_Is_0(){
        Adres a = new Adres("Vlostraat",0,"B",1000,"Brussel");
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_postcode_Is_0(){
        Adres a = new Adres("Vlostraat",12,"B",0,"Brussel");
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_gemeente_Is_null(){
        Adres a = new Adres("Vlostraat",12,"B",1000,null);
    }
    @Test 
    public void test_Constructor_Works_With_bus_Is_Null(){
        Adres a = new Adres("Vlostraat",12,1000,"Brussel");
    }
    @Test 
    public void test_Constructor_Works_With_normal_input(){
        Adres a = new Adres("Vlostraat",12,"B",1000,"Brussel");
    }
    @Test
    public void test_getter_straat_werkt(){
        Adres a = new Adres("Vlostraat",12,"B",1000,"Brussel");
        assertEquals("Vlostraat",a.getStraat());
    }
    @Test
    public void test_getter_huisnr_werkt(){
        Adres a = new Adres("Vlostraat",12,"B",1000,"Brussel");
        assertEquals(12,a.getHuisnr());
    }
    @Test
    public void test_getter_bus_werkt(){
        Adres a = new Adres("Vlostraat",12,"B",1000,"Brussel");
        assertEquals("B",a.getBus());
    }
    @Test
    public void test_getter_postcode_werkt(){
        Adres a = new Adres("Vlostraat",12,"B",1000,"Brussel");
        assertEquals(1000,a.getPostcode());
    }
    @Test
    public void test_getter_gemeente_werkt(){
        Adres a = new Adres("Vlostraat",12,"B",1000,"Brussel");
        assertEquals("Brussel",a.getGemeente());
    }
}
