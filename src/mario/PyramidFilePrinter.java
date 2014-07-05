/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class PyramidFilePrinter implements PyramidPrinter {
    
    private String file;
    
    public PyramidFilePrinter() {
    }
    
    public void setFile( String file ) {
        this.file = file;
    }
    
    public String getFile() {
        return this.file;
    }
    
    @Override
    public void output( Pyramid pyramid ) {
       
        FileWriter writer = null;
        
        try {
            writer = new FileWriter( file );
            writer.write( pyramid.toString() );
        } 
        catch( IOException ioe ) {
            System.out.println( "Error printing to file: " + ioe.getMessage() );
        } 
        finally {
            try {
                writer.close();
            } catch( IOException ioe ) {
                System.out.println( "Error closing file: " + ioe.getMessage() );
            }
        }
    }
    
}
