/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;


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
    
    public int checkLogin(String login, String pwd) throws SQLException{
        
        String myQuery;
        myQuery = "Select * from utilisateur where utilisateur.Email = '"+login+"'";
        
        String checkPwd = "";
        
        try{
            rset = stmt.executeQuery(myQuery);
                   
            boolean next = rset.next();
            
            if(!next){
                return 2;
            }
            
            while(next)
            {
                checkPwd = rset.getString("Passwd");
                next = rset.next();
            }
        }
        catch(SQLException e){
            //System.out.println("non login");
            return 2;
        }
        
        if(checkPwd.equals(pwd)){
            //System.out.println("YOUHOU");
            return 1;
        }else{
            //System.out.println("non pwd");
            return 3;
        }
    }
    
    /**
     *
     * @param login
     * @return
     * @throws SQLException
     */
    public ArrayList allSeances(String login) throws SQLException{
        
        ArrayList<Carte> allCartes;
        allCartes = new ArrayList<>();
        
        String myQuery;
        
        myQuery = "Select * from utilisateur where utilisateur.Email = '"+login+"'";
        
        int ID = -1;
        int droit = -1;
        
        rset = stmt.executeQuery(myQuery);
                   
        boolean next = rset.next();

        while(next)
        {
            ID = rset.getInt("ID");
            droit = rset.getInt("Droit");
            next = rset.next();
        }
        
        if(droit==4){
            
            myQuery = "Select * from etudiant where etudiant.ID_Utilisateur = "+ID;
            
            int ID_Groupe = -1;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                ID_Groupe = rset.getInt("ID_Groupe");
            }
            
            //OKOKOKOKSystem.out.println("ID G: "+ID_Groupe);
            
            myQuery = "Select * from seance_groupes where seance_groupes.ID_Groupe = "+ID_Groupe;
            
            ArrayList seancesIDs = new ArrayList();

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                seancesIDs.add(rset.getInt("ID_Seance"));
            }
            
            for(int i = 0 ; i < seancesIDs.size(); i++){
                
                String date = "";
                String heures_d = "";
                String heures_f = "";
                int semaine = -1;
                int coursID = -1;
                int typeID = -1;

                ArrayList sallesIDs = new ArrayList();

                ArrayList groupesIDs = new ArrayList();

                ArrayList profsIDs = new ArrayList();
                
                myQuery = "Select * from seance where seance.ID = "+seancesIDs.get(i);
                
                rset = stmt.executeQuery(myQuery);

                while(rset.next())
                {
                    semaine = rset.getInt("Semaine");
                    date = rset.getString("Date");
                    heures_d = rset.getString("Heure_Debut");
                    heures_f = rset.getString("Heure_Fin");
                    coursID = rset.getInt("ID_Cours");
                    typeID = rset.getInt("ID_Type");
                }
                
                myQuery = "Select * from seance_salles where seance_salles.ID_Seance = "+seancesIDs.get(i);
                
                rset = stmt.executeQuery(myQuery);

                while(rset.next())
                {
                    sallesIDs.add(rset.getInt("ID_Salle"));
                }
                
                myQuery = "Select * from seances_enseignants where seances_enseignants.ID_Seance = "+seancesIDs.get(i);
                
                rset = stmt.executeQuery(myQuery);

                while(rset.next())
                {
                    profsIDs.add(rset.getInt("ID_Enseignant"));
                }
                
                myQuery = "Select * from seance_groupes where seance_groupes.ID_Seance = "+seancesIDs.get(i);
                
                rset = stmt.executeQuery(myQuery);

                while(rset.next())
                {
                    groupesIDs.add(rset.getInt("ID_Groupe"));
                }
                
                ArrayList groupes = new ArrayList();
                
                for(int j = 0 ; j < groupesIDs.size(); j++){

                    myQuery = "Select * from groupe where groupe.ID = "+groupesIDs.get(j);

                    rset = stmt.executeQuery(myQuery);

                    while(rset.next())
                    {
                        groupes.add(rset.getString("Nom"));
                    }

                }
            
                String cours = "";

                myQuery = "Select * from cours where cours.ID = "+coursID;

                rset = stmt.executeQuery(myQuery);

                while(rset.next())
                {
                    cours = rset.getString("Nom");
                }

                String type = "";

                myQuery = "Select * from type_cours where type_cours.ID = "+typeID;

                rset = stmt.executeQuery(myQuery);

                while(rset.next())
                {
                    type = rset.getString("Nom");
                }

                ArrayList salles = new ArrayList();
                ArrayList siteIDs = new ArrayList();

                for(int j = 0 ; j < sallesIDs.size(); j++){

                    myQuery = "Select * from salle where salle.ID = "+sallesIDs.get(j);

                    rset = stmt.executeQuery(myQuery);

                    while(rset.next())
                    {
                        salles.add(rset.getString("Nom"));
                        siteIDs.add(rset.getInt("ID_Site"));
                    }

                }

                ArrayList sites = new ArrayList();

                for(int j = 0 ; j < siteIDs.size(); j++){

                    myQuery = "Select * from site where site.ID = "+siteIDs.get(j);

                    rset = stmt.executeQuery(myQuery);

                    while(rset.next())
                    {
                        sites.add(rset.getString("Nom"));
                    }

                }
                
                ArrayList profs = new ArrayList();
                
                for(int j = 0 ; j < profsIDs.size(); j++){

                    myQuery = "Select * from utilisateur where utilisateur.ID = "+profsIDs.get(j);

                    rset = stmt.executeQuery(myQuery);

                    while(rset.next())
                    {
                        profs.add(rset.getString("Nom"));
                    }

                }
                
                int jour;
                
                Calendar cl = new GregorianCalendar();
                
                String mots[] = date.split("-");
                
                cl.set(Integer.parseInt(mots[0]), Integer.parseInt(mots[1])-1, Integer.parseInt(mots[2]));
                
                jour = cl.get(Calendar.DAY_OF_WEEK);
                
                int h_d = -1, h_f = -1;
                
                switch (heures_d) {
                    case "08:30:00":
                        h_d = 1;
                        break;
                    case "10:15:00":
                        h_d = 2;
                        break;
                    case "12:00:00":
                        h_d = 3;
                        break;
                    case "13:45:00":
                        h_d = 4;
                        break;
                    case "15:30:00":
                        h_d = 5;
                        break;
                    case "17:15:00":
                        h_d = 6;
                        break;
                    default:
                        h_d = 7;
                        break;
                }
                
                switch (heures_f) {
                    case "10:00:00":
                        h_f = 1;
                        break;
                    case "11:45:00":
                        h_f = 2;
                        break;
                    case "13:30:00":
                        h_f = 3;
                        break;
                    case "15:15:00":
                        h_f = 4;
                        break;
                    case "17:00:00":
                        h_f = 5;
                        break;
                    case "18:45:00":
                        h_f = 6;
                        break;
                    default:
                        h_f = 7;
                        break;
                }
                
                allCartes.add(new Carte(cours, type, profs, salles, groupes, sites, semaine, jour, h_d, h_f, coursID));
                
            }  
            
        }
        
        return allCartes;
        
    }
    
    public String searchEmail(String searchString) throws SQLException{
        
        String returnString = "";
        
        String myQuery = ("Select * from utilisateur where utilisateur.Nom like '"+searchString+"'");
        
        rset = stmt.executeQuery(myQuery);
        
        while(rset.next())
        {
            returnString = rset.getString("Email");
        }
        
        return returnString;
    }
    
    public void ajouterSeance(String date, String heure_d, String heure_f, String Etat, String cours, String type, ArrayList<JComboBox> allGroupes, ArrayList<JComboBox> allProfs, ArrayList<JComboBox> allSalles){
        //System.out.println("Date : "+date);
        //System.out.println("Heure_D : "+heure_d);
        
        
        
    }
    
    public boolean checkPourAjout(String date, String heure_d, String heure_f, String Etat, String cours, String type, ArrayList<JComboBox> allGroupes, ArrayList<JComboBox> allProfs, ArrayList<JComboBox> allSalles) throws SQLException{
        
        date = date.replace('/', '-');
        
        heure_d = heure_d + ":00";
        
        heure_f = heure_f + ":00";
        
        String myQuery = ("Select * from seance where seance.Date = '"+date+"'"); //AND (seance.Heure_Debut = '"+heure_d+"' OR seance.Heure_Fin = '"+heure_f+"')");
        
        int hd = Character.getNumericValue(heure_d.charAt(0))*10+Character.getNumericValue(heure_d.charAt(1));
        int hf = Character.getNumericValue(heure_f.charAt(0))*10+Character.getNumericValue(heure_f.charAt(1));
        
        rset = stmt.executeQuery(myQuery);
                   
        boolean next = rset.next();
        
        // pas de séance le jour choisi
        if(!next){
            return true;
        }
        
        
        int hdr;
        int hfr;
        
        ArrayList allId;
        allId = new ArrayList<>();
        
        while(next)
        {
            hdr = Character.getNumericValue(rset.getString("Heure_Debut").charAt(0))*10 + Character.getNumericValue(rset.getString("Heure_Debut").charAt(1));
            hfr = Character.getNumericValue(rset.getString("Heure_Fin").charAt(0))*10 + Character.getNumericValue(rset.getString("Heure_Fin").charAt(1));
            
            if((hd==hdr || hf==hfr)||(hd<hdr && hf>hdr)||(hd<hfr && hf>hfr)||(hd<hdr && hf>hfr)){
                allId.add(rset.getInt("ID"));
            }
            
            next = rset.next();
        }
        
        if(allId.size()==0){
            return true;
        }
        
        
        return true;
    }
    
}
