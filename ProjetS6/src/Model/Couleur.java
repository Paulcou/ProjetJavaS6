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

    public Couleur() {
        
        couleurs = new ArrayList<>();
        
        couleurs.add("#87CEEB");
        couleurs.add("#B0F2B6");
        couleurs.add("#BEF574");
        couleurs.add("#FF5E4D");
        couleurs.add("#DDA0DD");
        couleurs.add("#E6E6FA");
    }
    
    public String getCouleurs(int i){
        return couleurs.get(i-1);
    }
}
