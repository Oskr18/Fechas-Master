/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fechas.Fechas;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Oscar_Aranda_Nunez
 */
public class BeforeAfterIT {
    Fechas instance;
    public BeforeAfterIT() {
    }
    @Before
    public void Before(){
        instance = new Fechas();
        System.out.println("Before");
    }
    @After
    public void After(){
        instance = null;
        System.out.println("After");
    }
    
    //Casos de equivalencia
    @Test
    public void testEsFacturaCorrectaEnFecha1_1() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2021-05-28";
        
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsFacturaCorrectaEnFecha1_2() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2021-05-1";
        
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsFacturaCorrectaEnFecha1_3() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2021-06-15";
        
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Valores Borde
    
    @Test
    public void testEsFacturaCorrectaEnFecha2_1() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2021-05-28";
        
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
        
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
