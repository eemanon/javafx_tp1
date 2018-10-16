/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;


import java.util.Arrays;
import javafx.scene.paint.Color;
/**
 *
 * @author sebastian-andreas.si
 */
public enum Couleur {
    marron (Color.BROWN), bleu (Color.BLUE), rouge (Color.RED);
    private Color col;
    
    Couleur(Color c){
        this.col = c;
    }
    public Color getColor(){
        return col;
    }
    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.toString(e.getEnumConstants()).replaceAll("^.|.$", "").split(", ");
    }
}
