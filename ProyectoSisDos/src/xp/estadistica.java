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
public class estadistica {
    String medida;
    int cant;
    String Porcentaje1;
    String CodigoControl;   
    int cant2;
    String Porcentaje2;
    
    public estadistica(String medida, int cant, String Porcentaje1, String CodigoControl, int cant2, String Porcentaje2) {
        this.medida = medida;
        this.cant = cant;
        this.Porcentaje1 = Porcentaje1;
        this.CodigoControl = CodigoControl;
        this.cant2 = cant2;
        this.Porcentaje2 = Porcentaje2;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getPorcentaje1() {
        return Porcentaje1;
    }

    public void setPorcentaje1(String Porcentaje1) {
        this.Porcentaje1 = Porcentaje1;
    }

    public String getCodigoControl() {
        return CodigoControl;
    }

    public void setCodigoControl(String CodigoControl) {
        this.CodigoControl = CodigoControl;
    }

    public int getCant2() {
        return cant2;
    }

    public void setCant2(int cant2) {
        this.cant2 = cant2;
    }

    public String getPorcentaje2() {
        return Porcentaje2;
    }

    public void setPorcentaje2(String Porcentaje2) {
        this.Porcentaje2 = Porcentaje2;
    }

}
