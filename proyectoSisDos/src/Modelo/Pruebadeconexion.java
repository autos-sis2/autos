
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
       //e.update_rep("1", 1, "50", "rueda", "kaly");
       e.añadir_nuevo_empleado("carola","nuñes", "f", "lla", "jahd", null, "cajero", 20, "hjasd");
    }
}
