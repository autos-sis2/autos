
package Data;

import Clases.Articulos;
import java.util.*;
import Data.DataBase;
import java.sql.*;
import java.text.DecimalFormat;
/**
 *
 * @author CINTHIA FELIPE
 */
public class ArticulosDB {
    public static int nro=0;
    public static ArrayList ListaArt(){
        Connection cn;
    }
    ArrayList lista=new ArrayList();
    try{
    cn= DataBase.GetConnection();
    Statement cmd=cn.createStatement();
    ResultSet rs=cmd.executeQuery(" select art_cod,art_nom,art_pre fromArticulos order by art_cod");
    while(rs.next()){
        Articulos a=new Articulos();
        a.setCoda(rs.getString(1));
        a.setNomar(rs.getString(2));
        a.setPrecio(rs.getDouble(3));
        lista.add(a);
    }
}
    catch(SQLException ex){
    ex.printStackTrace();
    }
    return lista;
    }
public static Articulos LeerArt(int pos){
return (Articulos)ListaArt().get(pos);
}
public static boolean InsertaFactura(String fac,String fec){
boolean sw=false;
Connection cn=null;
PreparedStatement cmd=null;
try{
cn=DataBase.GetConnection();
cmd=cn.prepareStatement("insert into fac_cabe values(?,?,?,?,?)");
cmd.setString(1,fac);
cmd.setString(2,fec);
cmd.setString(3,"c0002");
cmd.setString(4,"S");
cmd.setInt(5,2);
cmd.executeUpdate();
cmd.close();
cn.close();
sw=true;
}
catch(SQLException ex){
sw=false;
}
return sw;
}
public static boolean InsertaDeta(String fac,String coda,int can){
boolean sw=false;
Connection cn=null;
PreparedStatement cmd=null;
try{
cn=DataBase.GetConnection();
cmd=cn.prepareStatement("insert into fac_deta values(?,?,?)");
cmd.setString(1,fac);
cmd.setString(2,coda);
cmd.setInt(3,can);
cmd.executeUpdate();
cmd.close();
cn.close();
sw=true;
}
catch(SQLException ex){
sw=false;
}
return sw;
}
public static String GeneraFac(){
String cod="";
Connection cn=null;
String cad, sql="select max(fac_num) from fac_cabe";
DecimalFormat sd=new DecimalFormat("0000");
int nro;
try{cn=DataBase.GetConnection();
Statement cmd=cn.createStatement();
ResultSet rs=cmd.executeQuery(sql);
if(rs.next()){
cad=rs.getString(1).substring(1).trim();
nro=Integer.parseInt(cad)+1;
cod="F"+sd.format(nro);
}
}
catch(SQLException ex){
ex.printStackTrace();
}
return cod;
}
}
]
