package Vista.formulario_empleado.Negocio.Modelo;
import Negocio.Control.Empleado;
import java.util.Vector;
import javax.swing.JOptionPane;
/**
 *
 * @author CINTHIA FELIPE
 */
public class Control {
    
    public Control()
    {
    
    }
    Vector vector= new Vector();
    Empleado empleado= new Empleado();
    
    public void GuardarEmpleado(Empleado empleado){
        if(vector.add(empleado)){
            JOptionPane.showMessageDialog(null, "se ha agregado correctamente al empleado");
        }
    }
    
    public String MostrarControl(){
        String Linea="",Linea2;
        
            for(int i=0;i<vector.size(); i++){
                empleado=(Empleado)vector.get(i);
                Linea2= empleado.Nombre+" - "+empleado.Apellido+" - "+empleado.Sexo;
                
                Linea=Linea+Linea2+"\n";
            }
        return Linea;
    }
}
