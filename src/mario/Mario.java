package mario;

import java.util.Scanner;
import java.lang.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mario {
    
    private Pyramid pyramid;
    private PyramidFilePrinter pyramidFilePrinter;
    private PyramidScreenPrinter pyramidScreenPrinter;

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");
        Mario obj = (Mario) context.getBean("mario");
        
        obj.start();
    }

    private Mario() {
    }
    
    public void setPyramidFilePrinter( PyramidFilePrinter pyramidFilePrinter ) {
        this.pyramidFilePrinter = pyramidFilePrinter;
    }
    
    public void setPyramidScreenPrinter( PyramidScreenPrinter pyramidScreenPrinter ) {
        this.pyramidScreenPrinter = pyramidScreenPrinter;
    }
    
    public void setPyramid( Pyramid pyramid ) {
        this.pyramid = pyramid;
    }
    
    public void start() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Scanner in = new Scanner(System.in);
        int n, filen;
        do {
            System.out.println( "How many rows? (1 - 32): ");
            n = in.nextInt();
        }
        while ( n < 1 || n > 32 );
        
        do {
            System.out.println( "0 for screen, 1 for file:" );
            filen = in.nextInt();
        }
        while ( filen < 0 && filen > 1 );
        
        pyramid.setRows(n);
        
        if( filen == 0 ) 
            pyramidScreenPrinter.output( pyramid );
        else 
            pyramidFilePrinter.output( pyramid );
    }
}
