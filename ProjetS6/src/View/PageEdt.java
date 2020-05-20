/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author paulc
 */
public class PageEdt extends javax.swing.JFrame {
    
    private Connexion myConnexion;
    private JPanel container;
    private String emailUser;
    private JLabel h2,h3,h4,h5,h6,h7,h8,j1,j2,j3,j4,j5,j6,tmp,t;
    private JButton b1;
    
    public PageEdt(String email) throws SQLException, ClassNotFoundException{
        
        emailUser = email;
        
        myConnexion = new Connexion("edt", "root", "");
        
        container = new JPanel();
        
        //Border blackline = BorderFactory.createLineBorder(Color.black);
        
        this.setTitle("Emploi du temps");
        this.setSize(1315, 720);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        container.setLayout(new GridBagLayout());
        container.setBackground(Color.WHITE);
        
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.5;
        container.add(new JLabel(emailUser), c);
        
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
        
        for(int i=2;i<15;i++){
            for(int j=1;j<7;j++){
                c.gridx = j;
                c.gridy = i;
                c.weightx = 0.5;
                if(i%2==1){
                    if(j==6){
                        container.add(new JLabel("<html><p style='text-align:center; background-color:#F08080; border-left:2px solid black;border-right:2px solid black;padding:2px; width:159px;'>~~~</p></html>"), c);
                    }else{
                        container.add(new JLabel("<html><p style='text-align:center; background-color:#F08080; border-left:2px solid black;padding:2px; width:159px;'>~~~</p></html>"), c);
                    }
                }else{
                    if(j==6){
                        container.add(new JLabel("<html><div style='background-color:#CCCCCC;padding:2px;width:159px;border:2px solid black;'>"
                                + "<p style='text-align:center'>-</p>"
                                + "<p style='text-align:center'>-</p>"
                                + "<p style='text-align:center'>-</p>"
                                + "</div></html>"), c);
                    }else if(j==4 || j==2){
                        container.add(new JLabel("<html><div style='background-color:#CCCCCC;padding:2px;width:159px;border-left:2px solid black;border-top:2px solid black;border-bottom:2px solid black;'>"
                                + "<p style='text-align:center'>-</p>"
                                + "<p style='text-align:center'>-</p>"
                                + "<p style='text-align:center'>-</p>"
                                + "</div></html>"), c);
                    }else{
                        container.add(new JLabel("<html><div style='background-color:#EEEEEE;padding:2px;width:159px;border-left:2px solid black;border-top:2px solid black;border-bottom:2px solid black;'>"
                                + "<p style='text-align:center'>-</p>"
                                + "<p style='text-align:center'>-</p>"
                                + "<p style='text-align:center'>-</p>"
                                + "</div></html>"), c);
                    }
                }
            }
        }
        
        this.setContentPane(container);
        this.setVisible(true);
    }
}
