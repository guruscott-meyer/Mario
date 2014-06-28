package mario;

import java.util.Scanner;
import java.lang.*;

public class Mario {

    public static void main(String[] args) {
        Mario mario = new Mario( PrinterFactory.getInstance() );
        mario.start();
    }
    
    private PrinterFactory printerFactory;

    private Mario(PrinterFactory instance) {
        this.printerFactory = instance;
    }
    
    public void start() {
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
            printer = printerFactory.PyramidScreenPrinter( pyramid );
        else 
            printer = printerFactory.PyramidFilePrinter( pyramid );
        
        printer.output();
    }
}
