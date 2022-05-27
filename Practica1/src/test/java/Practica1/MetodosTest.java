/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Practica1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SI
 */
public class MetodosTest {
    
    public MetodosTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of clasificacion method, of class Metodos.
     */
    @org.junit.jupiter.api.Test
    public void testClasificacion() {
        System.out.println("clasificacion");
        String tipo = "niños";
        Metodos instance = new Metodos();
        String expResult = "E Todo el publico";
        String result = instance.clasificacion(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult))
        fail("The test case is a prototype.");
    }

    /**
     * Test of precioenvio method, of class Metodos.
     */
    @org.junit.jupiter.api.Test
    public void testPrecioenvio() {
        System.out.println("precioenvio");
        double precio = 300.0;
        Metodos instance = new Metodos();
        double expResult = 399.0;
        double result = instance.precioenvio(precio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult)
        fail("The test case is a prototype.");
    }
    
}
