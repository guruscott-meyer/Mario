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
public class PyramidScreenPrinter implements PyramidPrinter {
    
    
    public PyramidScreenPrinter() {
    }
    
    @Override
    public void output( Pyramid pyramid ) {
        
        System.out.print( pyramid.toString() );
        
    }
    
}
