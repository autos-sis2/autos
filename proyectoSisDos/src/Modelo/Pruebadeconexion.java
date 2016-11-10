
package Modelo;

/**
 *
 * @author Fabiola Fernandez
 */
public class Pruebadeconexion {
    
    public static void main(String []args)
    {
      //ConexionPostgres cn = new  ConexionPostgres(); 
       ManageBD e = new ManageBD(); 
       e.añadir_repuestos(3, 1, "12", "arol", "12ht");
       
    }
}
