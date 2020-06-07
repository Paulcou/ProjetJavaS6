/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Carte;
import Model.Connexion;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author jules
 */
public class PageModifierSeance extends JFrame{
    
    private int seanceId;
    private JPanel container, containerBtn;
    private GridBagConstraints c;
    private Connexion myConnexion;
    private Carte seanceFull;
    private String emailUser, searchEmail;
    private JDateChooser jD;
    private JComboBox jCB_Groupes_Tmp, jCB_Profs_Tmp, jCB_Salles_Tmp;
    private int groupesSupp, profsSupp, sallesSupp;
    private ArrayList<JComboBox> allGroupBox, allProfBox, allSalleBox;
    private Insets ins;
    private JComboBox<String> jCBHeure_Debut, jCBHeure_Fin, jCB_Etat, jCB_Cours, jCB_Type, jCB_Groupes, jCB_Profs, jCB_Salles;
    private JButton btnGroupe, btnProfs, btnSalles;
    
    /**
     * Constructeur
     * @param id
     * @param email
     * @param email2
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws ParseException
     */
    public PageModifierSeance(int id,String email, String email2) throws SQLException, ClassNotFoundException, ParseException{
        this.seanceId = id;
        this.emailUser = email;
        this.searchEmail = email2;
        
        container = new JPanel();
        
        containerBtn = new JPanel();
        
        c = new GridBagConstraints();
        
        myConnexion = new Connexion("edt", "root", "");
        
        seanceFull = myConnexion.getSeanceById(id);
        
        ins = new Insets(3, 3, 3, 3);
        
        this.setTitle("Modifier la séance");
        this.setSize(1315, 680);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        
        container.setLayout(new GridBagLayout());
        
        containerBtn.setLayout(new GridBagLayout());
        
        afficherComboBox();
        
        this.getContentPane().add(container,"North");
        
        this.getContentPane().add(containerBtn,"South");
        
        this.setVisible(true);
        
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                try {
                    new PageEdt(emailUser, searchEmail);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(PageAjouterSeance.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
                
    }
    
    /**
     *
     * Fonction qui affiche toutes les données actuelles de la séance pour les modifier.
     */
    private void afficherComboBox() throws ParseException{
        
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='margin-top:20px;margin-bottom:5px'>Date</p></html>"),c);
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        Date date = null;
        
        date = dateFormat.parse(seanceFull.getDate());

        jD = new JDateChooser(date);
        
        Dimension prefDimension = new Dimension(106, 24);
        
        jD.setPreferredSize(prefDimension);
        
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(jD,c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='margin-top:20px;margin-bottom:5px'>Heure de début</p></html>"),c);
        
        jCBHeure_Debut = new JComboBox();
        jCBHeure_Debut.addItem("08h30");
        jCBHeure_Debut.addItem("10h15");
        jCBHeure_Debut.addItem("12h00");
        jCBHeure_Debut.addItem("13h45");
        jCBHeure_Debut.addItem("15h30");
        jCBHeure_Debut.addItem("17h15");
        jCBHeure_Debut.addItem("19h00");
        
        jCBHeure_Debut.setSelectedIndex(seanceFull.getHeureD()-1);
        
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(jCBHeure_Debut,c);
        
        
        c.gridx = 2;
        c.gridy = 0;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='margin-top:20px;margin-bottom:5px'>Heure de fin</p></html>"),c);
        
        jCBHeure_Fin = new JComboBox();
        jCBHeure_Fin.addItem("10h00");
        jCBHeure_Fin.addItem("11h45");
        jCBHeure_Fin.addItem("13h30");
        jCBHeure_Fin.addItem("15h15");
        jCBHeure_Fin.addItem("17h00");
        jCBHeure_Fin.addItem("18h45");
        jCBHeure_Fin.addItem("20h30");
        
        jCBHeure_Fin.setSelectedIndex(seanceFull.getHeureF()-1);
        
        c.gridx = 2;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(jCBHeure_Fin,c);
        
        
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='margin-top:20px;margin-bottom:5px'>Etat</p></html>"),c);
        
        jCB_Etat = new JComboBox();
        jCB_Etat.addItem("Confirmé");
        jCB_Etat.addItem("En attente");
        jCB_Etat.addItem("Annulé");
        
        jCB_Etat.setSelectedIndex(seanceFull.getEtat());
        
        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 0.5;
        container.add(jCB_Etat,c);
        
        
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='margin-top:20px;margin-bottom:5px'>Matière</p></html>"),c);
        
        jCB_Cours = new JComboBox();
        jCB_Cours.addItem("Mathématiques");
        jCB_Cours.addItem("Physique");
        jCB_Cours.addItem("Informatique");
        jCB_Cours.addItem("Electronique");
        jCB_Cours.addItem("Anglais");
        jCB_Cours.addItem("Finance");
        
        jCB_Cours.setSelectedItem(seanceFull.getCours());
        
        c.gridx = 1;
        c.gridy = 3;
        c.weightx = 0.5;
        container.add(jCB_Cours,c);
        
        
        c.gridx = 2;
        c.gridy = 2;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='margin-top:20px;margin-bottom:5px'>Type de cours</p></html>"),c);
        
        jCB_Type = new JComboBox();
        jCB_Type.addItem("TD");
        jCB_Type.addItem("TP");
        jCB_Type.addItem("Cours Magistral");
        jCB_Type.addItem("Projet");
        jCB_Type.addItem("Soutien");
        
        jCB_Type.setSelectedItem(seanceFull.getType());
        
        c.gridx = 2;
        c.gridy = 3;
        c.weightx = 0.5;
        container.add(jCB_Type,c);
        
        
        c.gridx = 0;
        c.gridy = 4;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='margin-top:20px;margin-bottom:5px'>Groupe(s)</p></html>"),c);
        
        //.clear()
        groupesSupp = seanceFull.getGroupes().size() - 1;
        
        allGroupBox = new ArrayList();
        
        for(int i=0; i<seanceFull.getGroupes().size(); i++){
            jCB_Groupes = new JComboBox();
            jCB_Groupes.addItem("TD1 ING1");
            jCB_Groupes.addItem("TD2 ING1");
            jCB_Groupes.addItem("TD3 ING1");
            jCB_Groupes.addItem("TD1 ING2");
            jCB_Groupes.addItem("TD2 ING2");
            jCB_Groupes.addItem("TD3 ING2");
            jCB_Groupes.addItem("TD1 ING3");
            jCB_Groupes.addItem("TD2 ING3");
            jCB_Groupes.addItem("TD3 ING3");
            jCB_Groupes.addItem("TD1 ING4");
            jCB_Groupes.addItem("TD2 ING4");
            jCB_Groupes.addItem("TD3 ING4");
            
            jCB_Groupes.setSelectedItem(seanceFull.getGroupes().get(i));

            c.insets = new Insets(0, 0, 3, 0);
            c.gridx = 0;
            c.gridy = 5+i;
            c.weightx = 0.5;
            container.add(jCB_Groupes,c);

            allGroupBox.add(jCB_Groupes);
        }

        btnGroupe = new JButton("+");
        c.insets = ins;
        c.gridx = 0;
        c.gridy = 6+groupesSupp;
        c.weightx = 0.5;
        container.add(btnGroupe,c);
       
        btnGroupe.addActionListener((java.awt.event.ActionEvent evt) -> {
            if(groupesSupp < 11){
                
                groupesSupp += 1;
                
                c.insets = ins;
                c.gridx = 0;
                c.gridy = 6+groupesSupp;
                c.weightx = 0.5;
                
                jCB_Groupes_Tmp = new JComboBox();
                jCB_Groupes_Tmp.addItem("TD1 ING1");
                jCB_Groupes_Tmp.addItem("TD2 ING1");
                jCB_Groupes_Tmp.addItem("TD3 ING1");
                jCB_Groupes_Tmp.addItem("TD1 ING2");
                jCB_Groupes_Tmp.addItem("TD2 ING2");
                jCB_Groupes_Tmp.addItem("TD3 ING2");
                jCB_Groupes_Tmp.addItem("TD1 ING3");
                jCB_Groupes_Tmp.addItem("TD2 ING3");
                jCB_Groupes_Tmp.addItem("TD3 ING3");
                jCB_Groupes_Tmp.addItem("TD1 ING4");
                jCB_Groupes_Tmp.addItem("TD2 ING4");
                jCB_Groupes_Tmp.addItem("TD3 ING4");
                
                allGroupBox.add(jCB_Groupes_Tmp);
                
                container.add(jCB_Groupes_Tmp,c);
                container.revalidate();
                container.repaint();
            }
        });

        c.gridx = 1;
        c.gridy = 4;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='margin-top:20px;margin-bottom:5px'>Professeur(s)</p></html>"),c);
        
        profsSupp = seanceFull.getProfs().size()-1;
        
        allProfBox = new ArrayList<>();
        
        for(int i=0; i<seanceFull.getProfs().size();i++){
            jCB_Profs = new JComboBox();
            jCB_Profs.addItem("SARSESKY");
            jCB_Profs.addItem("PULICI");
            jCB_Profs.addItem("VILLAGE");
            
            jCB_Profs.setSelectedItem(seanceFull.getProfs().get(i));

            c.insets = new Insets(0, 0, 3, 0);
            c.gridx = 1;
            c.gridy = 5+i;
            c.weightx = 0.5;
            container.add(jCB_Profs,c);

            allProfBox.add(jCB_Profs);
        }

        btnProfs = new JButton("+");
        c.insets = ins;
        c.gridx = 1;
        c.gridy = 6+profsSupp;
        c.weightx = 0.5;
        container.add(btnProfs,c);
       
        btnProfs.addActionListener((java.awt.event.ActionEvent evt) -> {
            if(profsSupp < 11){
                
                profsSupp += 1;
                
                c.insets = ins;
                c.gridx = 1;
                c.gridy = 6 + profsSupp;
                c.weightx = 0.5;
                
                jCB_Profs_Tmp = new JComboBox();
                jCB_Profs_Tmp.addItem("SARSESKY");
                jCB_Profs_Tmp.addItem("PULICI");
                jCB_Profs_Tmp.addItem("VILLAGE");
                
                allProfBox.add(jCB_Profs_Tmp);
                
                container.add(jCB_Profs_Tmp,c);
                container.revalidate();
                container.repaint();
            }
        });
        
        c.gridx = 2;
        c.gridy = 4;
        c.weightx = 0.5;
        container.add(new JLabel("<html><p style='margin-top:20px;margin-bottom:5px'>Salle(s)</p></html>"),c);
        
        sallesSupp = seanceFull.getSalles().size() - 1;
        
        allSalleBox = new ArrayList<>();
        
        for(int i=0; i<seanceFull.getSalles().size(); i++){
            jCB_Salles = new JComboBox();
            jCB_Salles.addItem("S1 - E1");
            jCB_Salles.addItem("S2 - E1");
            jCB_Salles.addItem("A1 - E1");
            jCB_Salles.addItem("S3 - E2");
            jCB_Salles.addItem("S4 - E2");
            jCB_Salles.addItem("A2 - E3");
            jCB_Salles.addItem("A3 - E3");
            jCB_Salles.addItem("S5 - E4");
            jCB_Salles.addItem("S6 - E4");
            jCB_Salles.addItem("A4 - E4");
            
            jCB_Salles.setSelectedItem(seanceFull.getSalles().get(i));

            c.insets = new Insets(0, 0, 3, 0);
            c.gridx = 2;
            c.gridy = 5+i;
            c.weightx = 0.5;
            container.add(jCB_Salles,c);

            allSalleBox.add(jCB_Salles);
        }
        
        btnSalles = new JButton("+");
        c.insets = ins;
        c.gridx = 2;
        c.gridy = 6+sallesSupp;
        c.weightx = 0.5;
        container.add(btnSalles,c);
       
        btnSalles.addActionListener((java.awt.event.ActionEvent evt) -> {
            if(sallesSupp < 11){
                
                sallesSupp += 1;
                
                c.insets = ins;
                c.gridx = 2;
                c.gridy = 6 + sallesSupp;
                c.weightx = 0.5;
                
                jCB_Salles_Tmp = new JComboBox();
                jCB_Salles_Tmp.addItem("S1 - E1");
                jCB_Salles_Tmp.addItem("S2 - E1");
                jCB_Salles_Tmp.addItem("A1 - E1");
                jCB_Salles_Tmp.addItem("S3 - E2");
                jCB_Salles_Tmp.addItem("S4 - E2");
                jCB_Salles_Tmp.addItem("A2 - E3");
                jCB_Salles_Tmp.addItem("A3 - E3");
                jCB_Salles_Tmp.addItem("S5 - E4");
                jCB_Salles_Tmp.addItem("S6 - E4");
                jCB_Salles_Tmp.addItem("A4 - E4");
                
                allSalleBox.add(jCB_Salles_Tmp);
                
                container.add(jCB_Salles_Tmp,c);
                container.revalidate();
                container.repaint();
            }
        });
        
        
        JButton btnSend = new JButton("Modifier la séance");
        c.insets = new Insets(3, 0, 3, 0);
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.5;
        containerBtn.add(btnSend,c);
        
        btnSend.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                if(myConnexion.checkPourAjout(dateFormat.format(jD.getDate()), jCBHeure_Debut.getSelectedItem().toString(), jCBHeure_Fin.getSelectedItem().toString(), jCB_Etat.getSelectedItem().toString(),
                        jCB_Cours.getSelectedItem().toString(), jCB_Type.getSelectedItem().toString(),allGroupBox, allProfBox, allSalleBox,seanceId)){
                    this.setVisible(false);
                    new PageEdt(emailUser, searchEmail);
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PageAjouterSeance.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        JButton btnSupp = new JButton("Supprimer la séance");
        c.insets = new Insets(3, 0, 3, 0);
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.5;
        containerBtn.add(btnSupp,c);
        
        btnSupp.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                myConnexion.supprimerSeance(seanceId);
                this.setVisible(false);
                new PageEdt(emailUser, searchEmail);
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PageAjouterSeance.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
    }
}

