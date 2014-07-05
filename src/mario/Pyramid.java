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
    
    private int rows;
    
    public Pyramid() {
    }
    
    public void setRows( int rows ) {
        this.rows = rows;
    }
    
    public int getRows() {
        return this.rows;
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        for( int i = 0; i < this.rows; i++ ) {
            for( int j = 0; j < this.rows - i; j++ )
                builder.append( " " );
            for( int k = 0; k < i + 2; k++ )
                builder.append( "#" );
            builder.append( "\n" );
            }
        
        return builder.toString();
    }
}
