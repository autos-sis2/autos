/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xp;

/**
 *
 * @author CINTHIA FELIPE
 */
public class Autos {
     private String nroPlaca,
                Recorrido,
                velocidad,
                modelo,
                cantGasolina,
                color,
                nroPasajeros;
     
         private String enVenta,
                   vendido,
                   codControl;
         
         public Autos(String nroPlaca, 
            String Recorrido,
            String velocidad, 
            String modelo,
            String cntGasolina,
            String color,
            String nroPasajeros, 
            String enVenta, 
            String vendido, 
            String codControl){
             
             this.nroPlaca = nroPlaca;
        this.Recorrido = Recorrido;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.cantGasolina = cantGasolina;
        this.nroPasajeros = nroPasajeros;
        this.color=color;
        this.enVenta = enVenta;
        this.vendido = vendido;
        this.codControl = codControl;
         }

    public String getCantGasolina() {
        return cantGasolina;
    }

    public String getCodControl() {
        return codControl;
    }

    public String getColor() {
        return color;
    }

    public String getEnVenta() {
        return enVenta;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNroPasajeros() {
        return nroPasajeros;
    }

    public String getNroPlaca() {
        return nroPlaca;
    }

    public String getRecorrido() {
        return Recorrido;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public String getVendido() {
        return vendido;
    }

    public void setCantGasolina(String cantGasolina) {
        this.cantGasolina = cantGasolina;
    }

    public void setCodControl(String codControl) {
        this.codControl = codControl;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEnVenta(String enVenta) {
        this.enVenta = enVenta;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNroPasajeros(String nroPasajeros) {
        this.nroPasajeros = nroPasajeros;
    }

    public void setNroPlaca(String nroPlaca) {
        this.nroPlaca = nroPlaca;
    }

    public void setRecorrido(String Recorrido) {
        this.Recorrido = Recorrido;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public void setVendido(String vendido) {
        this.vendido = vendido;
    }
         
         
}
