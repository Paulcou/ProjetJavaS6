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
    
    /**
     *  Default Constructeur
     */
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
    
    /**
     * Constructeur
     * 
     * @param r_cours
     * @param r_type
     * @param r_profs
     * @param r_salles
     * @param r_groupes
     * @param r_sites
     * @param r_semaine
     * @param r_jours
     * @param r_debut
     * @param r_fin
     * @param r_coursID
     * @param r_seanceID
     * @param r_date
     * @param r_etat
     */
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
    
    /**
     * Deuxième constructeur
     * 
     * @param r_semaine
     * @param r_h_d
     * @param r_h_f
     * @param r_jour
     * @param r_sallesID
     * @param r_sitesID
     * @param r_id
     */
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
    
    /**
     * Setter cours
     * 
     * @param c
     */
    public void setCours(String c){
        cours = c;
    }

    /**
     * Setter type
     * 
     * @param c
     */
    public void setType(String c){
        type = c;
    }

    /**
     * Setter sites
     * 
     * @param c
     */
    public void setSite(ArrayList c){
        sites = new ArrayList(c);
    }

    /**
     * Setter salles
     * 
     * @param c
     */
    public void setSalle(ArrayList c){
        salles = new ArrayList(c);
    }

    /**
     * Setter profs
     * 
     * @param c
     */
    public void setProf(ArrayList c){
        profs = new ArrayList(c);
    }

    /**
     * Setter groupes
     * 
     * @param c
     */
    public void setGroupe(ArrayList c){
        groupes = new ArrayList(c);
    }

    /**
     * Setter semaine
     * 
     * @param c
     */
    public void setSemaine(int c){
        semaine = c;
    }
    
    /**
     * Getter cours
     * 
     * @return
     */
    public String getCours(){
        return cours;
    }

    /**
     * Getter type
     * 
     * @return
     */
    public String getType(){
        return type;
    }

    /**
     * Getter String all sites
     * 
     * @return string
     */
    public String getSite(){
        String finalString = "";
        for(int i=0; i<sites.size(); i++){
            finalString += sites.get(i);
            finalString += " ";
        }
        return finalString;
    }

    /**
     * Getter sites
     * 
     * @return
     */
    public ArrayList getSites(){
        return sites;
    }

    /**
     * Getter string all Salles
     * 
     * @return
     */
    public String getSalle(){
        String finalString = "";
        for(int i=0; i<salles.size(); i++){
            finalString += salles.get(i);
            finalString += " ";
        }
        return finalString;
    }

    /**
     *
     * @return
     */
    public ArrayList getSalles(){
        return salles;
    }

    /**
     *
     * @return
     */
    public String getProf(){
        String finalString = "";
        for(int i=0; i<profs.size(); i++){
            finalString += profs.get(i);
            finalString += " ";
        }
        return finalString;
    }

    /**
     *
     * @return
     */
    public ArrayList getProfs(){
        return profs;
    }

    /**
     *
     * @return
     */
    public String getGroupe(){
        String finalString = "";
        for(int i=0; i<groupes.size(); i++){
            finalString += groupes.get(i);
            finalString += " ";
        }
        return finalString;
    }

    /**
     *
     * @return
     */
    public ArrayList getGroupes(){
        return groupes;
    }

    /**
     *
     * @return
     */
    public int getSemaine(){
        return semaine;
    }

    /**
     *
     * @return
     */
    public int getJour(){
        return jour;
    }

    /**
     *
     * @return
     */
    public int getHeureD(){
        return heure_d;
    }

    /**
     *
     * @return
     */
    public int getHeureF(){
        return heure_f;
    }

    /**
     *
     * @return
     */
    public int getCoursID(){
        return coursID;
    }

    /**
     *
     * @return
     */
    public int getSeanceID(){
        return seanceID;
    } 

    /**
     *
     * @return
     */
    public String getDate(){
        return date;
    }

    /**
     *
     * @return
     */
    public int getEtat(){
        return etat;
    }

    /**
     * Comparateur
     */
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
