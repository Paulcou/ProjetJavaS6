/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jules
 */
public class Couleur {
       
    private ArrayList<String> couleurs;

    /**
     *
     */
    public Couleur() {
        
        couleurs = new ArrayList<>();
        
        couleurs.add("#DFF2FF");
        couleurs.add("#B0F2B6");
        couleurs.add("#98FB98");
        couleurs.add("#FFA07A");
        couleurs.add("#FDBFB7");
        couleurs.add("#E6E6FA");
    }
    
    /**
     *
     * @param i
     * @return
     */
    public String getCouleurs(int i){
        return couleurs.get(i-1);
    }
}
