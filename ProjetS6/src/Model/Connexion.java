/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author paulc
 */
public class Connexion {
    
    /**
     * Attributs prives : connexion JDBC, statement, ordre requete et resultat
     * requete
     */
    private final Connection conn;
    private final Statement stmt;
    private ResultSet rset;
    private ResultSetMetaData rsetMeta;
    /**
     * ArrayList public pour les tables
     */
    public ArrayList<String> tables = new ArrayList<>();
    /**
     * ArrayList public pour les requêtes de sélection
     */
    public ArrayList<String> requetes = new ArrayList<>();
    /**
     * ArrayList public pour les requêtes de MAJ
     */
    public ArrayList<String> requetesMaj = new ArrayList<>();
    
    /**
     * Constructeur avec 3 paramètres : nom, login et password de la BDD locale
     *
     * @param nameDatabase
     * @param loginDatabase
     * @param passwordDatabase
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public Connexion(String nameDatabase, String loginDatabase, String passwordDatabase) throws SQLException, ClassNotFoundException{
        
         //System.out.println("passe");
         
        // chargement driver "com.mysql.jdbc.Driver"
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
        
        }
        
      
        // url de connexion "jdbc:mysql://localhost:3305/usernameECE"
        String urlDatabase = "";
        try{
            urlDatabase = "jdbc:mysql://localhost:3306/" + nameDatabase;
        }
        catch(Exception e){
            e.printStackTrace();
        }
       // String urlDatabase = "jdbc:mysql://localhost:3308/jps?characterEncoding=latin1";

        //création d'une connexion JDBC à la base 
        conn = DriverManager.getConnection(urlDatabase, loginDatabase, passwordDatabase);

        // création d'un ordre SQL (statement)
        stmt = conn.createStatement();
           
    }
    
    /**
     * Méthode qui affiche toutes les promos
     * 
     * @throws SQLException 
     */
    public void afficherPromo() throws SQLException{
        
        String myQuery = ("Select * from promotion");
        
        rset = stmt.executeQuery(myQuery);
        
        while (rset.next())
        {
            System.out.println(rset.getString("Nom"));
        }
        
    }
    
    /**
     * Méthode qui met un terme à la connexion à la bdd en cours
     * 
     * @throws SQLException 
     */
    public void closeConnexion() throws SQLException{
        
        stmt.close();
        
        conn.close();
    }
    
}
