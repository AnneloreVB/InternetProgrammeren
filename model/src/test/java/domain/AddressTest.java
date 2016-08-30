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
public class AddressTest {
    
    public AddressTest() {
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

    
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_straat_Is_NULL(){
        Address a = new Address(null,12,"b",1000,"Brussel");
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_huisnr_Is_0(){
        Address a = new Address("Vlostraat",0,"B",1000,"Brussel");
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_postcode_Is_0(){
        new Address("Vlostraat",12,"B",0,"Brussel");
    }
    @Test (expected = DomainException.class)
    public void test_Constructor_Works_With_gemeente_Is_null(){
        Address a = new Address("Vlostraat",12,"B",1000,null);
    }
    @Test 
    public void test_Constructor_Works_With_bus_Is_Null(){
        Address a = new Address("Vlostraat",12,1000,"Brussel");
    }
    @Test 
    public void test_Constructor_Works_With_normal_input(){
        Address a = new Address("Vlostraat",12,"B",1000,"Brussel");
    }
    @Test
    public void test_getter_straat_werkt(){
        Address a = new Address("Vlostraat",12,"B",1000,"Brussel");
        assertEquals("Vlostraat",a.getStraat());
    }
    @Test
    public void test_getter_huisnr_werkt(){
        Address a = new Address("Vlostraat",12,"B",1000,"Brussel");
        assertEquals(12,a.getHuisnr());
    }
    @Test
    public void test_getter_bus_werkt(){
        Address a = new Address("Vlostraat",12,"B",1000,"Brussel");
        assertEquals("B",a.getBus());
    }
    @Test
    public void test_getter_postcode_werkt(){
        Address a = new Address("Vlostraat",12,"B",1000,"Brussel");
        assertEquals(1000,a.getPostcode());
    }
    @Test
    public void test_getter_gemeente_werkt(){
        Address a = new Address("Vlostraat",12,"B",1000,"Brussel");
        assertEquals("Brussel",a.getGemeente());
    }
    @Test
    public void test_toString_geeft_juiste_output(){
        Address a = new Address("Vlostraat",12,"B",1000,"Brussel");
        assertEquals(a.toString(), "Vlostraat 12 B 1000 Brussel");
    }
}
