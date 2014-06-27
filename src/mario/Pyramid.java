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
public class Pyramid {
    private String pyramid;
    
    public Pyramid( int rows ) {
        
        StringBuilder builder = new StringBuilder();
        
        for( int i = 0; i < rows; i++ ) {
            for( int j = 0; j < rows - i; j++ )
                builder.append( " " );
            for( int k = 0; k < i + 2; k++ )
                builder.append( "#" );
            builder.append( "\n" );
            }
        
        pyramid = builder.toString();
    }
    
    public String toString() {
        return this.pyramid;
    }
}
