package xp;
/**
 *
 * @author omar
 */
public class Auto {

    public Auto(String codigo, String marca, String estado, String tipo, String matricula, String color, String precio, String year, String modelo, String imagen) {
        this.codigo = codigo;
        this.marca = marca;
        this.estado = estado;
        this.tipo = tipo;
        this.matricula = matricula;
        this.color = color;
        this.precio = precio;
        this.year = year;
        this.modelo = modelo;
        this.imagen = imagen;
    }

    Auto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getEstado() {
        return estado;
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

    public String getYear() {
        return year;
    }

    public String getModelo() {
        return modelo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public void setYear(String year) {
        this.year = year;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    private String codigo;
    private String marca;
    private String estado;
    private String tipo;
    private String matricula;
    private String color;
    private String precio;
    private String year;
    private String modelo;
    private String imagen;
    

    char[] getNroPlaca() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    char[] getRecorrido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    char[] getvelocidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    char[] getmodelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    char[] getcolor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    char[] getCantGasolina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    char[] getNroPasajeros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    char[] getOrigen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    char[] getDestino() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    char[] getCodControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
    
}
