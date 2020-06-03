/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Comparator;

/**
 *
 * @author paulc
 */
public class Recap {
    
    private String matiere, groupe;
    private double nbHeures;
    
    public Recap(String r_matiere, String r_groupe, double r_nb){
        matiere = r_matiere;
        groupe = r_groupe;
        nbHeures = r_nb;
    }
    
    public void setNBH(double plus){
        nbHeures += plus;
    }
    
    public String getMatiere(){
        return matiere;
    }
    
    public String getGroupe(){
        return groupe;
    }
    
    public double getNBH(){
        return nbHeures;
    }
    
    public static Comparator<Recap> recapComparator = (Recap s1, Recap s2) -> {
        return Integer.parseInt(s1.getMatiere()) - Integer.parseInt(s2.getMatiere());
    };
}