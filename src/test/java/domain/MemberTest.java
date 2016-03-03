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
public class MemberTest {
    
    Address gedigAdres = new Address("Vlostraat",12,"B",1000,"Brussel");
    Member geldigeMember = new Member("brr","Jansens","Jan",gedigAdres,false);
    public MemberTest() {
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
        assertEquals(false,geldigeMember.heeftBetaald());
    }
    @Test 
    public void test_Betaal_werkt(){
        geldigeMember.betaal();
        assertEquals(true,geldigeMember.heeftBetaald());
    }
    @Test 
    public void test_resetbetaling_werkt(){
        geldigeMember.resetBetaling();
        assertEquals(false,geldigeMember.heeftBetaald());
    }
}
