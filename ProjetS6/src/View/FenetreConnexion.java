/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/*
 * Packages importés
*/
import Model.*;

/*
 * Librairies importées
*/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author paulc
 */
public class FenetreConnexion extends JFrame implements ActionListener, ItemListener{
    
    private final JTextField login, pwd;
    private final JPanel l1, l2, l3;
    private final JButton btnConnexion;
    private final JLabel lblLogin, lblPwd;
    
    public FenetreConnexion(){
        
        super();
        
        //setSize(800, 600); // donne une taille en hauteur et largeur à la fenêtre
        setLayout(new BorderLayout());
        setSize(450,150);
        setTitle("Login");
        //setResizable(false);
        
        
        login = new JTextField();
        pwd = new JTextField();
        
        l1 = new JPanel();
        l2 = new JPanel();
        l3 = new JPanel();
        
        btnConnexion = new JButton("Connexion");
        
        lblLogin = new JLabel();
        lblLogin.setText("Login");
        lblPwd = new JLabel();
        lblPwd.setText("Password");
        
        //btnConnexion.setSize(200, 100);
        
        l1.setLayout(new GridLayout(3,1));
        l2.setLayout(new GridLayout(3,1));
        l3.setLayout(new GridLayout(3,1));
        
        l1.add(lblLogin);
        l1.add(login);
        l1.add(lblPwd);
        l1.add(pwd);
        l1.add(btnConnexion);
        //l2.add(pwd);
        //l3.add(btnConnexion);
        
        add(l1,BorderLayout.CENTER);
        
        //l1.setBackground(Color.MAGENTA);
        
        //add("North", l1);
        //add("West",l2);
        //add("East",l3);
        
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
