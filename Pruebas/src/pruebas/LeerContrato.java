package pruebas;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author CINTHIA FELIPE
 */
public class LeerContrato {
    public static void main(String arg[]){
        String texto="";
        
        try{
            FileReader lector=new FileReader("texto.txt");
            BufferedReader contenido=new BufferedReader(lector);
            while((texto=contenido.readLine())!=null){
                System.out.println(texto);
            }
        }
        catch(Exception e){
            System.out.println("error al leer");
        }
    }
}
