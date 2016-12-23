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
 * @author Fabiola Fernandez
 */
public class testAuto {
    
    public testAuto() {
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

<<<<<<< HEAD:ProyectoSisDos/test/testFact.java
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
    
    //public void validarTelefono()
    //{
    //}
    
=======
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
>>>>>>> 234d904a047ae244afa97e8705377801540e9873:ProyectoSisDos/test/testAuto.java
}
