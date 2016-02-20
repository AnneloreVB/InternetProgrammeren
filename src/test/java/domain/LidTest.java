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
public class LidTest {
    
    Adres gedigAdres = new Adres("Vlostraat",12,"B",1000,"Brussel");
    public LidTest() {
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
    public void test_Constructor_Works_With_isBetaald_Is_false(){
        Lid l = new Lid("brr","Jansens","Jan",gedigAdres,false);
        assertEquals(false,l.heeftBetaald());
    }
    @Test 
    public void test_Betaal_werkt(){
        Lid l = new Lid(null,"Jansens","Jan",gedigAdres,false);
        l.betaal();
        assertEquals(true,l.heeftBetaald());
    }
    @Test 
    public void test_resetbetaling_werkt(){
        Lid l = new Lid(null,"Jansens","Jan",gedigAdres,true);
        l.resetBetaling();
        assertEquals(false,l.heeftBetaald());
    }
}
