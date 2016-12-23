package pruebas;

import java.io.File;
import java.io.FileWriter;


/**
 *
 * @author CINTHIA FELIPE
 */
public class Pruebas {
  //permite escribir en un txt  

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    //un texto cualquiera guardado en una variable
    public static void main(String[] args)  {
        String saludo="hola";
       
        try{
       //crear un objeto file se encargara de crear o abrir acceso a un archivo que se especifica en su constructor     
          File archivo=new File("texto.txt");
          FileWriter escribir = new FileWriter(archivo,true);
          escribir.write(saludo);
          escribir.close();
        }
        catch(Exception e){
            System.out.println("Error al escribir");
        }
    }
}
/**
        String sFichero;
        sFichero = "f:\misArchivos\fichero.txt";
        File fichero = new File(sFichero);
        if (fichero.exists())
    System.out.println("El fichero " + sFichero + " existe");
            else
        System.out.println("Pues no existe");
        File[] ficheros = f.listFiles();
        for (int x=0;x<ficheros.length;x++){
        System.out.println(ficheros[x].getName());
        }
    
    BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
    for (int x=0;x<10;x++)
    bw.write("Fila numero " + x + "\n");
    * */
   


    
