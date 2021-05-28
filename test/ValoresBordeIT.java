/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fechas.Fechas;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar_Aranda_Nunez
 */
public class ValoresBordeIT {
    
    public ValoresBordeIT() {
    }

    /*
    Valores Borde
    
    Caso 1 --- Fecha: 2021-05-28 respuestaExp: 0
    Caso 2 --- Fecha: 2021-05-27 respuestaExp: -1
    Caso 3 --- Fecha: 2021-05-29  respuestaExp: 1
     */
    @Test
    public void testEsFacturaCorrectaEnFecha2_1() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2021-05-28";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsFacturaCorrectaEnFecha2_2() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2021-05-27";
        Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsFacturaCorrectaEnFecha2_3() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2021-05-29";
        Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
