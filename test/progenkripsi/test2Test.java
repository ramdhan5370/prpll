/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package progenkripsi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramdhan Suseto
 */
public class test2Test {
    
    public test2Test() {
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

    /**
     * Test of enkrip method, of class test2.
     */
    @Test
    public void testEnkrip() {
        System.out.println("enkrip");
        String key = "abc";
        String plaintext = "1234";
        test2 instance = new test2();
        String expResult = "4bcde2345";
        String result = instance.enkrip(key, plaintext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
