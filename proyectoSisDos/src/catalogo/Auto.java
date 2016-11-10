package catalogo;
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omar
 */
public class Auto {
    private String tipo;
    private String matricula;
    private String color;
    private String precio;
    private String estado;
    private String modelo;

    private ImageIcon imagen;
    
    public Auto(String tip,String matri , String colo,String preci,String esta,String mode,ImageIcon ima){
        tipo = tip;
        matricula=matri;
        color=colo;
        precio=preci;
        estado=esta;
        modelo=mode;
        imagen=ima;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public String getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
}
