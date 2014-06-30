package mario;

import java.util.Scanner;
import java.lang.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mario {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");
        Mario obj = (Mario) context.getBean("Mario");
        
        obj.start();
    }

    private Mario() {
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
        
        Pyramid pyramid = (Pyramid) context.getBean("Pyramid");
        pyramid.setRows(n);
        
        PyramidPrinter printer = null;
        
        if( filen == 0 ) 
            printer = (PyramidPrinter) context.getBean( "PyramidScreenPrinter");
        else 
            printer = (PyramidPrinter) context.getBean( "PyramidFilePrinter");
        
        printer.setPyramid( pyramid );
        printer.output();
    }
}
