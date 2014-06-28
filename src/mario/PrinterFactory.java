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
    
    private PrinterFactory() {}
    
    private static PrinterFactory printerFactory;
    
    public static PrinterFactory getInstance() {
        if( printerFactory == null ){
            printerFactory = new PrinterFactory();
        }
        return printerFactory;
    }
    
    public PyramidPrinter PyramidFilePrinter( Pyramid pyramid ) {
        return new PyramidFilePrinter( pyramid );
    }
    
    public PyramidPrinter PyramidScreenPrinter( Pyramid pyramid ) {
        return new PyramidScreenPrinter( pyramid );
    }
    
}
