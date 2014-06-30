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
    
    private Pyramid pyramid;
    
    public PyramidScreenPrinter() {
    }
    
    public void setPyramid( Pyramid pyramid ) {
        this.pyramid = pyramid;
    }
    
    public Pyramid getPyramid() {
        return this.pyramid;
    }
    
    @Override
    public void output() {
        
        System.out.print( pyramid.toString() );
        
    }
    
}
