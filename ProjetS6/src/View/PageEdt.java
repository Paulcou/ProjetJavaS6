/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author paulc
 */
public class PageEdt extends javax.swing.JFrame {
    
    private JPanel container;
    private String emailUser;
    private JLabel h1,h2,h3,h4,h5,h6,h7,h8;
    private JTextArea t1;
    
    public PageEdt(String email){
        
        emailUser = email;
        
        container = new JPanel();
        
        Border blackline = BorderFactory.createLineBorder(Color.black);
        
        this.setTitle("Emploi du temps");
        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        container.setLayout(new GridBagLayout());
        container.setBackground(Color.GREEN);
        
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.5;
        container.add(new JLabel(emailUser), c);
        
        h1 = new JLabel("#");
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.5;
        container.add(h1, c);
        
        /*t1 = new JTextArea();
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.10;
        c.gridheight = 7;
        container.add(t1, c);*/
        
        h2 = new JLabel("8h30 - 10h00");    
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.5;
        container.add(h2, c);
        
        h3 = new JLabel("10h15 - 11h45");
        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 0.5;
        container.add(h3, c);
        
        h4 = new JLabel("12h00 - 13h30");
        c.gridx = 0;
        c.gridy = 4;
        c.weightx = 0.5;
        container.add(h4, c);
        
        h5 = new JLabel("\n13h45 - 15h15\n");
        c.gridx = 0;
        c.gridy = 5;
        c.weightx = 0.5;
        container.add(h5, c);
        
        h6 = new JLabel("15h30 - 17h00");
        c.gridx = 0;
        c.gridy = 6;
        c.weightx = 0.5;
        container.add(h6, c);
        
        h7 = new JLabel("17h15 - 18h45");
        c.gridx = 0;
        c.gridy = 7;
        c.weightx = 0.5;
        container.add(h7, c);
        
        h8 = new JLabel("19h00 - 20h30");
        c.gridx = 0;
        c.gridy = 8;
        c.weightx = 0.5;
        container.add(h8, c);
        
        /**c.gridx = 1;
        c.gridy = 0;
        container.add(new JButton("de"), c);
        c.gridx = 2;
        c.gridy = 0;
        container.add(new JButton("la"), c);**/
        
        this.setContentPane(container);
        this.setVisible(true);
    }
}
