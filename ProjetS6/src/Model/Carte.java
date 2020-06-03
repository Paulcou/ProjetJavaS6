/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author jules
 */
public class Carte {
    private String cours, type, date;
    private ArrayList profs, salles, groupes, sites;
    private int semaine, jour, heure_d, heure_f, coursID, seanceID, etat;
    
    public Carte(){
        cours = "";
        type = "";
        sites = new ArrayList();
        salles = new ArrayList();
        profs = new ArrayList();
        groupes = new ArrayList();
        semaine = -1;
        jour = -1;
        heure_d = -1;
        heure_f = -1;
        seanceID = -1;
    }
    
    public Carte(String r_cours, String r_type, ArrayList r_profs, ArrayList r_salles, ArrayList r_groupes, ArrayList r_sites, int r_semaine, int r_jours, int r_debut, int r_fin, int r_coursID, int r_seanceID, String r_date, int r_etat){
        cours = r_cours;
        type = r_type;
        sites = new ArrayList(r_sites);
        salles = new ArrayList(r_salles);
        profs = new ArrayList(r_profs);
        groupes = new ArrayList(r_groupes);
        semaine = r_semaine;
        jour = r_jours;
        heure_d = r_debut;
        heure_f = r_fin;
        coursID = r_coursID;
        seanceID = r_seanceID;
        date = r_date;
        etat = r_etat;
    }
    
    public Carte(int r_semaine, int r_h_d, int r_h_f, int r_jour,ArrayList r_sallesID, ArrayList r_sitesID, int r_id){
        semaine = r_semaine;
        seanceID = r_id;
        heure_d = r_h_d;
        heure_f = r_h_f;
        salles = new ArrayList(r_sallesID);
        sites = new ArrayList(r_sitesID);
        jour = r_jour;
        
        profs = new ArrayList();
        groupes = new ArrayList();
        cours = "";
        type = "";
    }
    
    public void setCours(String c){
        cours = c;
    }
    public void setType(String c){
        type = c;
    }
    public void setSite(ArrayList c){
        sites = new ArrayList(c);
    }
    public void setSalle(ArrayList c){
        salles = new ArrayList(c);
    }
    public void setProf(ArrayList c){
        profs = new ArrayList(c);
    }
    public void setGroupe(ArrayList c){
        groupes = new ArrayList(c);
    }
    public void setSemaine(int c){
        semaine = c;
    }
    
    
    public String getCours(){
        return cours;
    }
    public String getType(){
        return type;
    }
    public String getSite(){
        String finalString = "";
        for(int i=0; i<sites.size(); i++){
            finalString += sites.get(i);
            finalString += " ";
        }
        return finalString;
    }
    public ArrayList getSites(){
        return sites;
    }
    public String getSalle(){
        String finalString = "";
        for(int i=0; i<salles.size(); i++){
            finalString += salles.get(i);
            finalString += " ";
        }
        return finalString;
    }
    public ArrayList getSalles(){
        return salles;
    }
    public String getProf(){
        String finalString = "";
        for(int i=0; i<profs.size(); i++){
            finalString += profs.get(i);
            finalString += " ";
        }
        return finalString;
    }
    public ArrayList getProfs(){
        return profs;
    }
    public String getGroupe(){
        String finalString = "";
        for(int i=0; i<groupes.size(); i++){
            finalString += groupes.get(i);
            finalString += " ";
        }
        return finalString;
    }
    public ArrayList getGroupes(){
        return groupes;
    }
    public int getSemaine(){
        return semaine;
    }
    public int getJour(){
        return jour;
    }
    public int getHeureD(){
        return heure_d;
    }
    public int getHeureF(){
        return heure_f;
    }
    public int getCoursID(){
        return coursID;
    }
    public int getSeanceID(){
        return seanceID;
    } 
    public String getDate(){
        return date;
    }
    public int getEtat(){
        return etat;
    }

    public static Comparator<Carte> carteComparator = (Carte s1, Carte s2) -> {
        if(s1.getSemaine()==s2.getSemaine()){
            if(s1.getJour()==s2.getJour()){
                return s1.getHeureD()-s2.getHeureD();
            }else{
                return s1.getJour() - s2.getJour();
            }
        }else{
            return s1.getSemaine() - s2.getSemaine();
        }
    };
}
