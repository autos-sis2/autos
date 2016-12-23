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
    }
    
    @After
    public void tearDown() {
    }
    
    @Before
    public void setUp() {
          ConnectionDB.getInstance().start();
    }
    
    @Test
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


    @Test
    public void testGetStatusUserStory() {
        UserStory story = new UserStory("Registrar Tarea", "Se guarden los siguientes datos:"
                + "ID_Tarea,Nombre,Descripcion,Historia a la que pertenece", 300, 3);
        String expected = "In Progress";
        int idStory = QueryBuilded.getInstance().getIdStory(story.getTitleStory());
        QueryBuilded.getInstance().updateStatusStory(idStory);
        String actual = QueryBuilded.getInstance().getStatusStory(idStory);
        
        assertEquals(expected, actual);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
