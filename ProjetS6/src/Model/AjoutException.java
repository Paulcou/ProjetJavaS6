/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author paulc
 */
public class AjoutException extends Exception {
    
    private Connexion myConnexion;

    /**
     * Creates a new instance of <code>AjoutException</code> without detail
     * message.
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public AjoutException() throws SQLException, ClassNotFoundException {
        myConnexion = new Connexion("edt", "root", "");
    }

    /**
     * Constructs an instance of <code>AjoutException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public AjoutException(String msg) {
        super(msg);
    }
    
    /**
     *
     * @param allProfsId
     * @throws SQLException
     */
    public void profsNonLibres(ArrayList allProfsId) throws SQLException{
        ArrayList allProfs;
        allProfs = new ArrayList(myConnexion.profsById(allProfsId));
        if(allProfs.size()==1){
            JOptionPane.showMessageDialog(null, "Le professeur "+allProfs.get(0)+" est occupé pour ce créneau.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String fString = "Les professeurs suivants ne sont pas libres pour ce créneau :\n";
            for(int i=0;i<allProfs.size();i++){
                fString+=allProfs.get(i)+"\n";
            }
            JOptionPane.showMessageDialog(null, fString, "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     *
     * @param allGroupesId
     * @throws SQLException
     */
    public void groupesNonLibres(ArrayList allGroupesId) throws SQLException{
        ArrayList allGroupes;
        allGroupes = new ArrayList(myConnexion.groupesById(allGroupesId));
        if(allGroupes.size()==1){
            JOptionPane.showMessageDialog(null, "Le groupe "+allGroupes.get(0)+" est occupé pour ce créneau.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String fString = "Les groupes suivants ne sont pas libres pour ce créneau :\n";
            for(int i=0;i<allGroupes.size();i++){
                fString+=allGroupes.get(i)+"\n";
            }
            JOptionPane.showMessageDialog(null, fString, "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     *
     * @param allSallesId
     * @throws SQLException
     */
    public void sallesNonLibres(ArrayList allSallesId) throws SQLException{
        ArrayList allSalles;
        allSalles = new ArrayList(myConnexion.sallesById(allSallesId));
        if(allSalles.size()==1){
            JOptionPane.showMessageDialog(null, "La salle "+allSalles.get(0)+" n'est pas libre pour ce créneau.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String fString = "Les salles suivantes ne sont pas libres pour ce créneau :\n";
            for(int i=0;i<allSalles.size();i++){
                fString+=allSalles.get(i)+"\n";
            }
            JOptionPane.showMessageDialog(null, fString, "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     *
     */
    public void dimanche(){
        JOptionPane.showMessageDialog(null, "Pas de cours le dimanche.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     *
     */
    public void capacite(){
        JOptionPane.showMessageDialog(null, "Capacité insuffisante.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }
}
