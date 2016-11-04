/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.formulario_empleado.Negocio.Control;

/**
 *
 * @author CINTHIA FELIPE
 */
public class Empleado {//variables
    public String Nombre;
    public String Apellido;
    public String FechaDeNacimiento;
    public String Sexo;
    public String TipoDeDocumento;
    public String NroDocumento;
    public String Direccion;
    public String Departamento;
    public String Provincia;
    public String Direccion2;
    public String NroTelefono;
    public String NroCelular;
    public String Correo;
    public String Nacionalidad;
    public String PeriodoPrueba;
    public String Estado;
    public String FechaIngreso;
    public String Seccion;
    public String Cargo;
    public String Categoria;
    
    public Empleado()
    {
     throw new UnsupportedOperationException("Not supported yet.");
    }
            
    //contructor por parametros         
    public Empleado(String Nombre, String Apellido, String FechaDeNacimiento, String Sexo, 
                    String TipoDeDocumento, String NroDocumento, String Direccion, String Departamento,
                    String Provincia, String Direccion2, String NroTelefono, String NroCelular,
                    String Correo, String Nacionalidad, String PeriodoPrueba, String Estado,
                    String FechaIngreso, String Seccion, String Cargo, String Categoria){
        
        this.Nombre= Nombre;
        this.Apellido= Apellido;
        this.FechaDeNacimiento= FechaDeNacimiento;
        this.Sexo= Sexo;
        this.TipoDeDocumento=TipoDeDocumento;
        this.NroDocumento=NroDocumento;
        this.Direccion=Direccion;
        this.Departamento= Departamento;
        this.Provincia=Provincia;
        this.Direccion2=Direccion2;
        this.NroTelefono=NroTelefono;
        this.NroCelular=NroCelular;
        this.Correo=Correo;
        this.Nacionalidad=Nacionalidad;
        this.PeriodoPrueba=PeriodoPrueba;
        this.Estado=Estado;
        this.FechaIngreso=FechaIngreso;
        this.Seccion=Seccion;
        this.Cargo=Cargo;
        this.Categoria=Categoria;
        
    }
  
    
}
