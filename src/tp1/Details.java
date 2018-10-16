/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import javafx.scene.paint.Color;

/**
 *
 * @author sebastian-andreas.si
 */
public enum Details {
    Grainbeaute ("grain de beauté");
    
    Details(String desc){
        this.description = desc;
    }
    private String description;
    
    public String toString (){
        return description;
    }
    
}
