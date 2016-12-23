
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import xp.FacturaE;
import xp.TipoPago;


/**
 *
 * @author CINTHIA FELIPE
 */
public class testTipoPago {
     @Test
    public void txtAño()
    {
     TipoPago pago = new TipoPago();
     for(int i=2000; i<=2020;i++){
     assertEquals(pago,true);
     assertEquals(pago,false);   
     }
     //boolean res1 = pago.validarDeCorreo("alobe..1320.com");
     
    }
}
