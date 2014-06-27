/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author admin
 */
public class Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, filen;
        do {
            System.out.println( "How many rows? (1 - 32): ");
            n = in.nextInt();
        }
        while ( n < 10 || n > 32 );
        
        do {
            System.out.println( "0 for screen, 1 for file:" );
            filen = in.nextInt();
        }
        while ( filen < 0 && filen > 1 );
        
        Pyramid pyramid = new Pyramid( n );
        PyramidPrinter printer = null;
        
        if( filen == 0 ) 
            printer = PrinterFactory.PyramidScreenPrinter( pyramid );
        else 
            printer = PrinterFactory.PyramidFilePrinter( pyramid );
        
        printer.output();
    }
    
}
