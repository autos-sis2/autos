/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Vista.Formulario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author Fabiola Fernandez
 */
public class testEmpleado {
    Formulario formEmp = new Formulario();
    public testEmpleado() {
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
     boolean res =  formEmp.validarDeCorreo("aloibaf_1607@hotmail.com");
     boolean res1 =  formEmp.validarDeCorreo("alobe..1320.com");
     assertEquals(res,true);
     assertEquals(res1,false);
    }
    
    @Test 
    public void verficarDatosNulos()
    {
      assertEquals(true,formEmp.datosNulos(""));
    }
    
     @Test
    public void validarNUmerosCiFechaSalario()
    {
      boolean res = formEmp.verificarNumeros("9448237"); //ci
      boolean r1 = formEmp.verificarNumeros("12091007"); //fecha de ingreso
      boolean r2 = formEmp.verificarNumeros("30$$"); //salario
      assertEquals(true,res);
      assertEquals(true,r1);
      assertFalse(r2);
    }
   
    
     @Test
     public void validarNombreyApellido()
     {
       boolean nombre =formEmp.verificarLetras("daniela");
       boolean nombre1 = formEmp.verificarLetras("fabi16iola");
       assertEquals(nombre,true);
       assertEquals(nombre1,false);
     }
    
}
