/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.junittest2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author StudioOne
 */
public class OperacionesAritIT {
    
    public OperacionesAritIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class OperacionesArit.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 6;
        int b = 8;
        OperacionesArit instance = new OperacionesArit();
        int expResult = 14;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class OperacionesArit.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 5;
        int b = 3;
        OperacionesArit instance = new OperacionesArit();
        int expResult = 2;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class OperacionesArit.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 6;
        int b = 5;
        OperacionesArit instance = new OperacionesArit();
        int expResult = 30;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class OperacionesArit.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 10;
        int b = 10;
        OperacionesArit instance = new OperacionesArit();
        int expResult = 1;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
