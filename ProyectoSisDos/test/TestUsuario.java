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
public class TestUsuario {
    
    public TestUsuario() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // ConnectionDB.getInstance().start();
    }
    
    @After
    public void tearDown() {
    }
    
/*    @Test
    public void testGetStatusTask() throws ClassNotFoundException, SQLException {
        
        Task task = new Task("Crear Tabla Tarea","Crear la tabla para la base de base");
        String expected = "Done";
        String actual = QueryBuilded.getInstance().getStatusTask(task.getTitle());
        assertEquals(expected, actual);
        
        task = new Task("Relacionar Tarea","Crear la relacion entre una tarea e Historia");
        expected = "In Progress";
        actual = QueryBuilded.getInstance().getStatusTask(task.getTitle());
        assertEquals(expected, actual);
        
    }
*/

}
