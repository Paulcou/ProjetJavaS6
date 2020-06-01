/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author paulc
 */
public class PageEdt extends javax.swing.JFrame {
    
    private Connexion myConnexion;
    private JPanel container, weekContainer;
    private String emailUser, searchString, newLogin;
    private JLabel h2,h3,h4,h5,h6,h7,h8,j1,j2,j3,j4,j5,j6,tmp;
    private GridBagConstraints c;
    private boolean display;
    private ArrayList<Carte> allCartes;
    private int weekInt,droit;
    private Insets ins;
    
    
    public PageEdt(String email) throws SQLException, ClassNotFoundException{
        
        emailUser = email;
        
        newLogin = email;
        
        myConnexion = new Connexion("edt", "root", "");
        
        droit = myConnexion.getDroit(emailUser);

        container = new JPanel();
        
        weekContainer = new JPanel();
        
        c = new GridBagConstraints();
        
        display = true;
        
        ins = new Insets(1, 1, 1, 1);

        this.setTitle("Emploi du temps");
        this.setSize(1315, 680);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        afficherMenuBar();
          
        container.setLayout(new GridBagLayout());
        
        weekContainer.setLayout(new GridBagLayout());
        
        afficherSemaines();
        
        afficherTitresEdt();
        
        allCartes = myConnexion.allSeances(emailUser);
        
        Collections.sort(allCartes,Carte.carteComparator);
        
        afficherCours();
        
        afficherComplement();
        
        this.getContentPane().add(container,"North");
        this.getContentPane().add(weekContainer, "South");
        this.setVisible(true);
    }
    
    private void afficherMenuBar(){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        
        Calendar cl = new GregorianCalendar();
        
        Date date = new Date();

        String mots[] = dateFormat.format(date).split("/");

        cl.set(Integer.parseInt(mots[0]), Integer.parseInt(mots[1])-1, Integer.parseInt(mots[2]));

        weekInt = cl.get(Calendar.WEEK_OF_YEAR);
        
        JMenuBar bar = new JMenuBar();
        
        JMenu edt = new JMenu("Affichage");
        
        JMenuItem classique = new JMenuItem("Grille");
        JMenuItem grille = new JMenuItem("Ligne");
        
        classique.addActionListener((java.awt.event.ActionEvent evt) -> {
            display = true;
            clsBtnActionPerformed(evt);
        });
        
        grille.addActionListener((java.awt.event.ActionEvent evt) -> {
            display = false;
            griBtnActionPerformed(evt);
        });
        
        edt.add(classique);
        edt.add(grille);
        
        JMenu spaceBetween = new JMenu("   ");
        spaceBetween.setEnabled(false);
        JMenu spaceBetween2 = new JMenu("   ");
        spaceBetween2.setEnabled(false);
        JMenu spaceBetween3 = new JMenu("   ");
        spaceBetween3.setEnabled(false);
        JMenu spaceBetween4 = new JMenu("   ");
        spaceBetween4.setEnabled(false);
        JMenu spaceBetween5 = new JMenu("   ");
        spaceBetween5.setEnabled(false);
        JMenu spaceBetween6 = new JMenu("   ");
        spaceBetween6.setEnabled(false);
        JMenu spaceBetween7 = new JMenu("   ");
        spaceBetween7.setEnabled(false);
        
        bar.add(spaceBetween);
        
        bar.add(edt);
        
        bar.add(spaceBetween2);
        
        if(droit == 1 || droit == 2){
            JTextField search = new JTextField(20);
            search.setMaximumSize(search.getPreferredSize());
            JButton sBtn = new JButton("Rechercher");

            sBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
                searchString = search.getText();
                try {
                    sBtnActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(PageEdt.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

            bar.add(search);
            bar.add(spaceBetween3);
            bar.add(sBtn);
            bar.add(spaceBetween4);
        }

        JButton statBtn = new JButton("Statistiques");
        bar.add(statBtn);
        bar.add(spaceBetween5);
        
        if(droit == 1){
            JButton addBtn = new JButton("Ajouter une séance");
            bar.add(addBtn);

            addBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
                try {
                    this.setVisible(false);
                    new PageAjouterSeance(newLogin);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(PageEdt.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        
            bar.add(spaceBetween6);
        }
        
        
        bar.add(new JLabel("Semaine "+weekInt));
        
        bar.add(spaceBetween7);
        bar.add(new JLabel(emailUser));
        
        this.setJMenuBar(bar);
    }
    
    private void sBtnActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        
        // On va chercher l'email de la personne recherchée.
        
        newLogin = myConnexion.searchEmail(searchString);
       
        if(!"".equals(newLogin)){
            container.removeAll();
            afficherTitresEdt();
            allCartes = myConnexion.allSeances(newLogin);
            afficherCours();
            afficherComplement();
            container.revalidate();
            container.repaint();
        }else{
            JOptionPane.showMessageDialog(null, "Nom non reconnu", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void clsBtnActionPerformed(java.awt.event.ActionEvent evt){
        switchAffichage();
    }
    
    private void griBtnActionPerformed(java.awt.event.ActionEvent evt){
        switchAffichage();
    }
    
    private void afficherTitresEdt(){
        
        j1 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-left:2px solid black; border-top:2px solid black; height:40px; width:206;'>"
                + "<p></>"
                + "<p style='text-align:center'>Lundi</p>"
                + "</div></html>");
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(j1, c);
        
        j2 = new JLabel("<html><div style='padding:2px;background-color:#CCCCCC;border-left:2px solid black; border-top:2px solid black;height:40px; width:206;'>"
                + "<p></>"
                + "<p style='text-align:center'>Mardi</p>"
                + "</div></html>");
        c.gridx = 2;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(j2, c);
        
        j3 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-left:2px solid black; border-top:2px solid black;height:40px; width:206;'>"
                + "<p></>"
                + "<p style='text-align:center'>Mercredi</p>"
                + "</div></html>");
        c.gridx = 3;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(j3, c);
        
        j4 = new JLabel("<html><div style='padding:2px;background-color:#CCCCCC;border-left:2px solid black; border-top:2px solid black;height:40px; width:206;'>"
                + "<p></>"
                + "<p style='text-align:center'>Jeudi</p>"
                + "</div></html>");
        c.gridx = 4;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(j4, c);
        
        j5 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-left:2px solid black; border-top:2px solid black;height:40px; width:206;'>"
                + "<p></>"
                + "<p style='text-align:center'>Vendredi</p>"
                + "</div></html>");
        c.gridx = 5;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(j5, c);
        
        j6 = new JLabel("<html><div style='padding:2px;background-color:#CCCCCC;border-left:2px solid black; border-right:2px solid black; border-top:2px solid black; height:40px; width:206;'>"
                + "<p></>"
                + "<p style='text-align:center'>Samedi</p>"
                + "</div></html>");
        c.gridx = 6;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(j6, c);
        
        h2 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-bottom:2px solid black;border-left:2px solid black;border-top:2px solid black; width:44px;'>"
                + "<p style='text-align:center'>8h30</p>"
                + "<p style='text-align:center'>-</p>"
                + "<p style='text-align:center'>10h00</p>"
                + "</div></html>");    
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.5;
        container.add(h2, c);
        
        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='text-align:center; padding:2px;border-left:2px solid black; background-color:#F08080;width:44px;'>Pause</p></html>"), c);
        
        h3 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-bottom:2px solid black;border-left:2px solid black;border-top:2px solid black;width:44px;'>"
                + "<p style='text-align:center'>10h15</p>"
                + "<p style='text-align:center'>-</p>"
                + "<p style='text-align:center'>11h45</p>"
                + "</div></html>");
        c.gridx = 0;
        c.gridy = 4;
        c.weightx = 0.5;
        container.add(h3, c);
        
        c.gridx = 0;
        c.gridy = 5;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='text-align:center; padding:2px;border-left:2px solid black; background-color:#F08080;width:44px;'>Pause</p></html>"), c);
        
        h4 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-bottom:2px solid black;border-left:2px solid black;border-top:2px solid black;width:44px;'>"
                + "<p style='text-align:center'>12h00</p>"
                + "<p style='text-align:center'>-</p>"
                + "<p style='text-align:center'>13h30</p>"
                + "</div></html>");
        c.gridx = 0;
        c.gridy = 6;
        c.weightx = 0.5;
        container.add(h4, c);
        
        c.gridx = 0;
        c.gridy = 7;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='text-align:center; padding:2px;border-left:2px solid black; background-color:#F08080;width:44px;'>Pause</p></html>"), c);
        
        h5 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-bottom:2px solid black;border-left:2px solid black;border-top:2px solid black;width:44px;'>"
                + "<p style='text-align:center'>13h45</p>"
                + "<p style='text-align:center'>-</p>"
                + "<p style='text-align:center'>15h15</p>"
                + "</div></html>");
        c.gridx = 0;
        c.gridy = 8;
        c.weightx = 0.5;
        container.add(h5, c);
        
        c.gridx = 0;
        c.gridy = 9;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='text-align:center; padding:2px;border-left:2px solid black; background-color:#F08080;width:44px;'>Pause</p></html>"), c);
        
        h6 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-bottom:2px solid black;border-left:2px solid black;border-top:2px solid black;width:44px;'>"
                + "<p style='text-align:center'>15h30</p>"
                + "<p style='text-align:center'>-</p>"
                + "<p style='text-align:center'>17h00</p>"
                + "</div></html>");
        c.gridx = 0;
        c.gridy = 10;
        c.weightx = 0.5;
        container.add(h6, c);
        
        c.gridx = 0;
        c.gridy = 11;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='text-align:center; padding:2px;border-left:2px solid black; background-color:#F08080;width:44px;'>Pause</p></html>"), c);
        
        h7 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-bottom:2px solid black;border-left:2px solid black;border-top:2px solid black;width:44px;'>"
                + "<p style='text-align:center'>17h15</p>"
                + "<p style='text-align:center'>-</p>"
                + "<p style='text-align:center'>18h45</p>"
                + "</div></html>");
        c.gridx = 0;
        c.gridy = 12;
        c.weightx = 0.5;
        container.add(h7, c);
        
        c.gridx = 0;
        c.gridy = 13;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='text-align:center; padding:2px;border-left:2px solid black; background-color:#F08080;width:44px;'>Pause</p></html>"), c);
        
        h8 = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-bottom:2px solid black;border-left:2px solid black;border-top:2px solid black;width:44px;'>"
                + "<p style='text-align:center'>19h00</p>"
                + "<p style='text-align:center'>-</p>"
                + "<p style='text-align:center'>20h30</p>"
                + "</div></html>");
        c.gridx = 0;
        c.gridy = 14;
        c.weightx = 0.5;
        container.add(h8, c);
    }
    
    private void afficherCours(){
        
        int nbrDisplay = 0;
        Couleur color = new Couleur();
        
        for(int i=0;i<allCartes.size();i++){
            if(allCartes.get(i).getSemaine()==weekInt){
                nbrDisplay = 0;
                if(allCartes.get(i).getHeureD()==allCartes.get(i).getHeureF()){
                    c.gridx = allCartes.get(i).getJour()-1;
                    c.gridy = allCartes.get(i).getHeureD()*2;
                    c.weightx = 0.5;
                    container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border-left:2px solid black;border-top:2px solid black;border-bottom:2px solid black;'>"
                                    + "<p style='text-align:center'>"+allCartes.get(i).getCours()+" - "+allCartes.get(i).getType()+"</p>"
                                    + "<p style='text-align:center'>"+allCartes.get(i).getSalle()+"</p>"
                                    + "<p style='text-align:center'>"+allCartes.get(i).getProf()+" - "+allCartes.get(i).getGroupe()+"</p>"
                                    + "</div></html>"), c);
                }else{
                    for(int j=allCartes.get(i).getHeureD();j<=allCartes.get(i).getHeureF()+(allCartes.get(i).getHeureF()-allCartes.get(i).getHeureD());j++){
                        if((allCartes.get(i).getHeureF()-allCartes.get(i).getHeureD())%2==0){
                            if(j==(allCartes.get(i).getHeureD()+allCartes.get(i).getHeureF()+(allCartes.get(i).getHeureF()-allCartes.get(i).getHeureD()))/2){
                                //tout écrire
                                c.gridx = allCartes.get(i).getJour()-1;
                                c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                c.weightx = 0.5;
                                container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-left:2px solid black;'>"
                                                + "<p style='text-align:center'>"+allCartes.get(i).getCours()+" - "+allCartes.get(i).getType()+"</p>"
                                                + "<p style='text-align:center'>"+allCartes.get(i).getSalle()+"</p>"
                                                + "<p style='text-align:center'>"+allCartes.get(i).getProf()+" - "+allCartes.get(i).getGroupe()+"</p>"
                                                + "</div></html>"), c);
                                
                            }else{
                                if(allCartes.get(i).getHeureD()%2==1){
                                    if(j%2==1){
                                        //grosse case
                                        if(j==allCartes.get(i).getHeureD()){
                                            c.gridx = allCartes.get(i).getJour()-1;
                                            c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                            c.weightx = 0.5;
                                            container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-top:2px solid black;border-left:2px solid black;'>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "</div></html>"), c);
                                        }else if(j==allCartes.get(i).getHeureF()+(allCartes.get(i).getHeureF()-allCartes.get(i).getHeureD())){
                                            c.gridx = allCartes.get(i).getJour()-1;
                                            c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                            c.weightx = 0.5;
                                            container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-bottom:2px solid black;border-left:2px solid black;'>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "</div></html>"), c);
                                        }else{
                                            c.gridx = allCartes.get(i).getJour()-1;
                                            c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                            c.weightx = 0.5;
                                            container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-left:2px solid black;'>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "</div></html>"), c);
                                        }
                                        
                                    }else{
                                        //petite case
                                        c.gridx = allCartes.get(i).getJour()-1;
                                        c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                        c.weightx = 0.5;
                                        container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border-left:2px solid black;'>"
                                                + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                + "</div></html>"), c);
                                    }
                                }
                            }
                            nbrDisplay+=1;
                        }else{
                            if(j==(2*allCartes.get(i).getHeureF()- 2*allCartes.get(i).getHeureD())/2){
                                if(j==allCartes.get(i).getHeureD()){
                                    c.gridx = allCartes.get(i).getJour()-1;
                                    c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                    c.weightx = 0.5;
                                    container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-top:2px solid black;border-left:2px solid black;'>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center'>"+allCartes.get(i).getCours()+" - "+allCartes.get(i).getType()+"</p>"
                                                    + "</div></html>"), c);
                                }else{
                                    c.gridx = allCartes.get(i).getJour()-1;
                                    c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                    c.weightx = 0.5;
                                    container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-left:2px solid black;'>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center'>"+allCartes.get(i).getCours()+" - "+allCartes.get(i).getType()+"</p>"
                                                    + "</div></html>"), c);
                                }
                                
                            
                            }else if(j==(2*allCartes.get(i).getHeureF()- 2*allCartes.get(i).getHeureD())/2 +1){
                                c.gridx = allCartes.get(i).getJour()-1;
                                c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                c.weightx = 0.5;
                                container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border-left:2px solid black;'>"                                               
                                                + "<p style='text-align:center'>"+allCartes.get(i).getSalle()+"</p>"                                               
                                                + "</div></html>"), c);
                                
                            }else if(j==(2*allCartes.get(i).getHeureF()- 2*allCartes.get(i).getHeureD())/2 +2){
                                if(j==2*allCartes.get(i).getHeureF()- allCartes.get(i).getHeureD()){
                                    c.gridx = allCartes.get(i).getJour()-1;
                                    c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                    c.weightx = 0.5;
                                    container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-bottom:2px solid black;border-left:2px solid black;'>"
                                                    + "<p style='text-align:center'>"+allCartes.get(i).getProf()+" - "+allCartes.get(i).getGroupe()+"</p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "</div></html>"), c);                                    
                                }else{
                                    c.gridx = allCartes.get(i).getJour()-1;
                                    c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                    c.weightx = 0.5;
                                    container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-left:2px solid black;'>"
                                                    + "<p style='text-align:center'>"+allCartes.get(i).getProf()+" - "+allCartes.get(i).getGroupe()+"</p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "</div></html>"), c);                                
                                }                           
                            }else{
                                if(allCartes.get(i).getHeureD()%2==1){
                                    if(j%2==1){
                                        //grosse case
                                        if(j==allCartes.get(i).getHeureD()){
                                            c.gridx = allCartes.get(i).getJour()-1;
                                            c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                            c.weightx = 0.5;
                                            container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-top:2px solid black;border-left:2px solid black;'>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "</div></html>"), c);
                                        }else if(j==2*allCartes.get(i).getHeureF()- allCartes.get(i).getHeureD()){
                                            c.gridx = allCartes.get(i).getJour()-1;
                                            c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                            c.weightx = 0.5;
                                            container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-left:2px solid black;border-bottom:2px solid black;'>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "</div></html>"), c);
                                        }else{
                                            c.gridx = allCartes.get(i).getJour()-1;
                                            c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                            c.weightx = 0.5;
                                            container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border:2px solid "+color.getCouleurs(allCartes.get(i).getCoursID())+";border-left:2px solid black;'>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                    + "</div></html>"), c);
                                        }
                                        
                                    }else{
                                        //petite case
                                        c.gridx = allCartes.get(i).getJour()-1;
                                        c.gridy = allCartes.get(i).getHeureD()*2+nbrDisplay;
                                        c.weightx = 0.5;
                                        container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:159px;border-left:2px solid black;'>"
                                                + "<p style='text-align:center;color:"+color.getCouleurs(allCartes.get(i).getCoursID())+"'> - </p>"
                                                + "</div></html>"), c);
                                    }
                                }
                            }
                            nbrDisplay+=1;
                        }
                    }
                }
            }
        }
    }
    
    private void afficherComplement(){
        for(int i=2;i<15;i++){
            for(int j=1;j<7;j++){
                c.gridx = j;
                c.gridy = i;
                c.weightx = 0.5;
                if(i%2==1){
                    if(j==6){
                        container.add(new JLabel("<html><p style='text-align:center; background-color:#F08080; color:#F08080; border-left:2px solid black;border-right:2px solid black;padding:2px; width:159px;'>~~~</p></html>"), c);
                    }else{
                        container.add(new JLabel("<html><p style='text-align:center; background-color:#F08080; color:#F08080; border-left:2px solid black;padding:2px; width:159px;'>~~~</p></html>"), c);
                    }
                }else{
                    if(j==6){
                        container.add(new JLabel("<html><div style='background-color:#CCCCCC;padding:2px;width:159px;border:2px solid black;'>"
                                + "<p style='text-align:center;color:#CCCCCC'>-</p>"
                                + "<p style='text-align:center;color:#CCCCCC'>-</p>"
                                + "<p style='text-align:center;color:#CCCCCC'>-</p>"
                                + "</div></html>"), c);
                    }else if(j==4 || j==2){
                        container.add(new JLabel("<html><div style='background-color:#CCCCCC;padding:2px;width:159px;border-left:2px solid black;border-top:2px solid black;border-bottom:2px solid black;'>"
                                + "<p style='text-align:center;color:#CCCCCC'>-</p>"
                                + "<p style='text-align:center;color:#CCCCCC'>-</p>"
                                + "<p style='text-align:center;color:#CCCCCC'>-</p>"
                                + "</div></html>"), c);
                    }else{
                        container.add(new JLabel("<html><div style='background-color:#EEEEEE;padding:2px;width:159px;border-left:2px solid black;border-top:2px solid black;border-bottom:2px solid black;'>"
                                + "<p style='text-align:center;color:#EEEEEE'>-</p>"
                                + "<p style='text-align:center;color:#EEEEEE'>-</p>"
                                + "<p style='text-align:center;color:#EEEEEE'>-</p>"
                                + "</div></html>"), c);
                    }
                }
            }
        }
    }
    
    private void switchAffichage(){
        
        container.removeAll();
        
        if(display){
            afficherTitresEdt();
            afficherCours();
            afficherComplement();
            container.revalidate();
            container.repaint();
        }else{
            afficherCoursLigne();
            container.revalidate();
            container.repaint();
        }
        
    }
    
    private void afficherCoursLigne(){
        Couleur color = new Couleur();
        ArrayList<String> jours;
        jours = new ArrayList<>();
        jours.add("Lundi");
        jours.add("Mardi");
        jours.add("Mercredi");
        jours.add("Jeudi");
        jours.add("Vendredi");
        jours.add("Samedi");
        
        ArrayList<String> heureD;
        heureD = new ArrayList<>();
        heureD.add("8h30");
        heureD.add("10h15");
        heureD.add("12h00");
        heureD.add("13h45");
        heureD.add("15h30");
        heureD.add("17h15");
        heureD.add("19h00");
        
        ArrayList<String> heureF;
        heureF = new ArrayList<>();
        heureF.add("10h00");
        heureF.add("11h45");
        heureF.add("13h30");
        heureF.add("15h15");
        heureF.add("17h00");
        heureF.add("18h45");
        heureF.add("20h30");
        
        JButton tmpButton, tmpInfo;
        
        for(int i=0; i<allCartes.size();i++){
            if(allCartes.get(i).getSemaine()==weekInt){
                //c.insets = ins;
                c.gridx = 0;
                c.gridy = i;

                //if(i==allCartes.size()-1){
                    container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:1px;width:800px;border:solid black;border-width:thin;'>"
                                        + "<p style='text-align:left'>Semaine "+allCartes.get(i).getSemaine()+" | "
                                        +jours.get(allCartes.get(i).getJour()-2)+" | "
                                        +heureD.get(allCartes.get(i).getHeureD()-1)+" - "
                                        +heureF.get(allCartes.get(i).getHeureF()-1)+" | "
                                        +allCartes.get(i).getCours()+" | "+allCartes.get(i).getType()
                                        +" | "+allCartes.get(i).getSalle()
                                        +" | "+allCartes.get(i).getProf()+" | "+allCartes.get(i).getGroupe()+"</p>"
                                        + "</div></html>"), c);
                //}else{
                    /*container.add(new JLabel("<html><div style='background-color:"+color.getCouleurs(allCartes.get(i).getCoursID())+";padding:2px;width:800px;height:20px;border-left:2px solid black;border-top:2px solid black;border-right:2px solid black;'>"
                                        + "<p style='text-align:left'>Semaine "+allCartes.get(i).getSemaine()+" | "
                                        +jours.get(allCartes.get(i).getJour()-2)+" | "
                                        +heureD.get(allCartes.get(i).getHeureD()-1)+" - "
                                        +heureF.get(allCartes.get(i).getHeureF()-1)+" | "
                                        +allCartes.get(i).getCours()+" | "+allCartes.get(i).getType()
                                        +" | "+allCartes.get(i).getSalle()
                                        +" | "+allCartes.get(i).getProf()+" | "+allCartes.get(i).getGroupe()+"</p>"
                                        + "</div></html>"), c);*/
                //}
                //c.insets = ins;
                c.gridx = 1;
                c.gridy = i;
                
                tmpButton = new JButton("<html><p id="+allCartes.get(i).getSeanceID()+">Modifier</p></html>");
                
                tmpButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                    String res = evt.toString();
                    int start = res.indexOf("id")+3;
                    int end = res.indexOf(">Modifier");
                    String seanceID = "";
                    for(int j=start;j<end;j++){
                        seanceID+=res.charAt(j);
                    }
                    try {
                        this.setVisible(false);
                        new PageModifierSeance(Integer.parseInt(seanceID),newLogin);
                    } catch (SQLException | ClassNotFoundException | ParseException ex) {
                        Logger.getLogger(PageEdt.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                });
                
                container.add(tmpButton,c);
                
            }
        }
    }
    
    private void afficherSemaines(){
        int x = 0;
        for(int i=1;i<53;i++){
            
            c.gridx = x;
            c.gridy = 0;
            
            if(i==weekInt){
                if(i==52){
                    tmp = new JLabel("<html><div style='padding:2px;background-color:#FDBFB7;border:2px solid black;width:19px;'>"
                        + "<p style='text-align:center'>"+i+"</p>"
                        + "</div></html>");
                    weekContainer.add(tmp,c);
                }else{
                    tmp = new JLabel("<html><div style='padding:2px;background-color:#FDBFB7;border-bottom:2px solid black;border-left:2px solid black;border-top:2px solid black;width:19px;'>"
                        + "<p style='text-align:center'>"+i+"</p>"
                        + "</div></html>");
                    weekContainer.add(tmp,c);
                }
            }else{
                if(i==52){
                    tmp = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border:2px solid black;width:19px;'>"
                        + "<p style='text-align:center'>"+i+"</p>"
                        + "</div></html>");
                    weekContainer.add(tmp,c);
                }else{
                    tmp = new JLabel("<html><div style='padding:2px;background-color:#EEEEEE;border-bottom:2px solid black;border-left:2px solid black;border-top:2px solid black;width:19px;'>"
                        + "<p style='text-align:center'>"+i+"</p>"
                        + "</div></html>");
                    weekContainer.add(tmp,c);
                }
            }
            
            tmp.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    String res = e.toString();
                    int start = res.indexOf("text-align:center")+19;
                    int end = res.indexOf("</p>");
                    String newWeek = "";
                    for(int j=start;j<end;j++){
                        newWeek+=res.charAt(j);
                    }
                    weekInt = Integer.parseInt(newWeek);
                    
                    weekContainer.removeAll();
                    afficherSemaines();
                    weekContainer.revalidate();
                    weekContainer.repaint();
                    
                    container.removeAll();
                    if(display){
                        afficherTitresEdt();
                        afficherCours();
                        afficherComplement();
                    }else{
                        afficherCoursLigne(); 
                    }   
                    container.revalidate();
                    container.repaint();
                }
            });
            
            x += 1;
        }
    }
}
