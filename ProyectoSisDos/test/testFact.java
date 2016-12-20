/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;
import org.junit.Test;
import xp.FacturaE;
import org.junit.Ignore;


/**
 *
 * @author Fabiola Fernandez
 */
public class testFact {
    
    public testFact() {
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

    public void conexion()
    {
    }
    @Test
    public void validarCorreo()
    {
     FacturaE fact = new FacturaE();
     boolean res = fact.validarDeCorreo("aloibaf_1607@hotmail.com");
     boolean res1 = fact.validarDeCorreo("alobe..1320.com");
     assertEquals(res,true);
     assertEquals(res1,false);
    }
    
    public void validarTelefono()
    {
    
    }
    
}
