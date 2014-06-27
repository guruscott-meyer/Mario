/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

/**
 *
 * @author admin
 */
public class PrinterFactory {
    
    public static PyramidPrinter PyramidFilePrinter( Pyramid pyramid ) {
        return new PyramidFilePrinter( pyramid );
    }
    
    public static PyramidPrinter PyramidScreenPrinter( Pyramid pyramid ) {
        return new PyramidScreenPrinter( pyramid );
    }
    
}
