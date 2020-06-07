/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
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
         
        // chargement driver "com.mysql.jdbc.Driver"
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
        
        }
      
        String urlDatabase = "";
        try{
            urlDatabase = "jdbc:mysql://localhost:3306/" + nameDatabase;
        }
        catch(Exception e){
            e.printStackTrace();
        }

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
    
    /**
     *
     * @param login
     * @param pwd
     * @return
     * @throws SQLException
     */
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
     * @param email
     * @return
     * @throws SQLException
     */
    public int getDroit(String email) throws SQLException{
        
        String myQuery;
        myQuery = "Select * from utilisateur where utilisateur.Email = '"+email+"'";
        
        int droit = 0;
        
        rset = stmt.executeQuery(myQuery);
        
        while(rset.next())
        {
            droit = rset.getInt("Droit");
        }
        
        return droit;
    }
    
    /**
     *
     * @param email
     * @return
     * @throws SQLException
     */
    public String getName(String email) throws SQLException{
        
        String myQuery;
        myQuery = "Select * from utilisateur where utilisateur.Email = '"+email+"'";
        
        String name = "";
        
        rset = stmt.executeQuery(myQuery);
        
        while(rset.next())
        {
            name = rset.getString("Nom");
        }
        
        return name;
        
    }
    
    /**
     *
     * @param email
     * @return
     * @throws SQLException
     */
    public String getGroupe(String email) throws SQLException{
        
        String myQuery;
        myQuery = "Select * from utilisateur where utilisateur.Email = '"+email+"'";
        
        int id = -1;
        String name = "";
        
        rset = stmt.executeQuery(myQuery);
        
        while(rset.next())
        {
            id = rset.getInt("ID");
        }
        
        myQuery = "Select * from etudiant where etudiant.ID_Utilisateur = '"+id+"'";
        
        rset = stmt.executeQuery(myQuery);
        
        while(rset.next())
        {
            id = rset.getInt("ID_Groupe");
        }
        
        myQuery = "Select * from groupe where groupe.ID = '"+id+"'";
        
        rset = stmt.executeQuery(myQuery);
        
        while(rset.next())
        {
            name += rset.getString("Nom");
            name += " ING";
            name += rset.getInt("ID_Promotion");
        }
        return name;
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
        
        ArrayList seancesIDs = new ArrayList();
        
        if(droit==4){
            
            myQuery = "Select * from etudiant where etudiant.ID_Utilisateur = "+ID;
            
            int ID_Groupe = -1;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                ID_Groupe = rset.getInt("ID_Groupe");
            }
            
            myQuery = "Select * from seance_groupes where seance_groupes.ID_Groupe = "+ID_Groupe;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                seancesIDs.add(rset.getInt("ID_Seance"));
            }
            
        }else if(droit==3){
            myQuery = "Select * from seances_enseignants where seances_enseignants.ID_Enseignant = "+ID;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                seancesIDs.add(rset.getInt("ID_Seance"));
            }
        }
            
        for(int i = 0 ; i < seancesIDs.size(); i++){
            
            allCartes.add(getSeanceById((int)seancesIDs.get(i)));
            
        }          
        return allCartes;
    }
    
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Carte getSeanceById(int id) throws SQLException{
                
        String date = "";
        String heures_d = "";
        String heures_f = "";
        int semaine = -1;
        int coursID = -1;
        int typeID = -1;
        int etat = -1;

        ArrayList sallesIDs = new ArrayList();

        ArrayList groupesIDs = new ArrayList();

        ArrayList profsIDs = new ArrayList();

        String myQuery = "Select * from seance where seance.ID = "+id;

        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            semaine = rset.getInt("Semaine");
            date = rset.getString("Date");
            heures_d = rset.getString("Heure_Debut");
            heures_f = rset.getString("Heure_Fin");
            etat = rset.getInt("Etat");
            coursID = rset.getInt("ID_Cours");
            typeID = rset.getInt("ID_Type");
        }

        myQuery = "Select * from seance_salles where seance_salles.ID_Seance = "+id;

        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            sallesIDs.add(rset.getInt("ID_Salle"));
        }

        myQuery = "Select * from seances_enseignants where seances_enseignants.ID_Seance = "+id;

        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            profsIDs.add(rset.getInt("ID_Enseignant"));
        }

        myQuery = "Select * from seance_groupes where seance_groupes.ID_Seance = "+id;

        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            groupesIDs.add(rset.getInt("ID_Groupe"));
        }

        ArrayList groupes = new ArrayList();

        for(int j = 0 ; j < groupesIDs.size(); j++){

            myQuery = "Select * from groupe where groupe.ID = "+groupesIDs.get(j);

            rset = stmt.executeQuery(myQuery);
            
            String name = "";

            while(rset.next())
            {
                name += rset.getString("Nom");
                name += " ING";
                name += rset.getInt("ID_Promotion");
            }
            groupes.add(name);
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
            
            String name ="";
            int siteId;
            while(rset.next())
            {
                name += rset.getString("Nom");
                name += " - E";
                siteId = rset.getInt("ID_Site");
                name += siteId;
                siteIDs.add(siteId);
            }
            salles.add(name);
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

        return new Carte(cours, type, profs, salles, groupes, sites, semaine, jour, h_d, h_f, coursID, id,date,etat);
    }
    
    /**
     *
     * @param searchString
     * @return
     * @throws SQLException
     */
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
    
    /**
     *
     * @param date
     * @param heure_d
     * @param heure_f
     * @param Etat
     * @param cours
     * @param type
     * @param allGroupes
     * @param allProfs
     * @param allSalles
     * @throws java.sql.SQLException
     */
    public void ajouterSeance(String date, String heure_d, String heure_f, String Etat, String cours, String type, ArrayList allGroupes, ArrayList allProfs, ArrayList allSalles) throws SQLException{
        
        int semaine;
                
        Calendar cl = new GregorianCalendar();

        String mots[] = date.split("-");

        cl.set(Integer.parseInt(mots[0]), Integer.parseInt(mots[1])-1, Integer.parseInt(mots[2]));

        semaine = cl.get(Calendar.WEEK_OF_YEAR);
        
        int id_cours;
        
        if("Physique".equals(cours)){
            id_cours = 2;
        }else if("Informatique".equals(cours)){
            id_cours = 3;
        }else if("Electronique".equals(cours)){
            id_cours = 4;
        }else if("Anglais".equals(cours)){
            id_cours = 5;
        }else if("Finance".equals(cours)){
            id_cours = 6;
        }else{
            id_cours = 1;
        }
        
        int id_type;
        
        if("TD".equals(type)){
            id_type = 1;
        }else if("TP".equals(type)){
            id_type = 2;
        }else if("Cours Magistral".equals(type)){
            id_type = 3;
        }else if("Projet".equals(type)){
            id_type = 4;
        }else{
            id_type = 5;
        }
        
        int etat;
        
        if("Confirmé".equals(Etat)){
            etat = 0;
        }else if("En attente".equals(Etat)){
            etat = 1;
        }else{
            etat = 2;
        }
        
        int seanceId =0;
        
        PreparedStatement ps=conn.prepareStatement("insert into seance (Semaine,Date,Heure_Debut,Heure_Fin,Etat,ID_Cours,ID_Type) values(?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        
        ps.setString(1,Integer.toString(semaine));
        
        ps.setString(2,date);
        
        ps.setString(3,heure_d);
        
        ps.setString(4,heure_f);
        
        ps.setString(5,Integer.toString(etat));
        
        ps.setString(6,Integer.toString(id_cours));
        
        ps.setString(7,Integer.toString(id_type));
        
        ps.executeUpdate();
        
        ResultSet rs=ps.getGeneratedKeys();
        
        if(rs.next()){
            seanceId=rs.getInt(1);
        }
        
        for(int i=0; i<allGroupes.size();i++){
            
            boolean check = true;
            
            for(int j=0; j<i; j++){
                if(allGroupes.get(j)==allGroupes.get(i)){
                    check = false;
                }
            }
            
            if(check){
                PreparedStatement ps2=conn.prepareStatement("insert into seance_groupes (ID_Seance,ID_Groupe) values('"+seanceId+"','"+allGroupes.get(i)+"')");
            
                ps2.executeUpdate();
            }
        }
        
        for(int i=0; i<allProfs.size();i++){
            
            boolean check = true;
            
            for(int j=0; j<i; j++){
                if(allProfs.get(j)==allProfs.get(i)){
                    check = false;
                }
            }
            
            if(check){        
                PreparedStatement ps3=conn.prepareStatement("insert into seances_enseignants (ID_Seance,ID_Enseignant) values('"+seanceId+"','"+allProfs.get(i)+"')");

                ps3.executeUpdate();
            }
            
        }
        
        for(int i=0; i<allSalles.size();i++){
            
            boolean check = true;
            
            for(int j=0; j<i; j++){
                if(allSalles.get(j)==allSalles.get(i)){
                    check = false;
                }
            }
            
            if(check){  
                PreparedStatement ps4=conn.prepareStatement("insert into seance_salles (ID_Seance,ID_Salle) values('"+seanceId+"','"+allSalles.get(i)+"')");

                ps4.executeUpdate();
            }
            
        }        
    }
    
    /**
     *
     * @param date
     * @param heure_d
     * @param heure_f
     * @param Etat
     * @param cours
     * @param type
     * @param allGroupes
     * @param allProfs
     * @param allSalles
     * @param r_id
     * @return 
     * @throws SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public boolean checkPourAjout(String date, String heure_d, String heure_f, String Etat, String cours, String type, ArrayList<JComboBox> allGroupes, ArrayList<JComboBox> allProfs, ArrayList<JComboBox> allSalles, int r_id) throws SQLException, ClassNotFoundException{
        
        AjoutException except;
        
        except = new AjoutException();
        
        date = date.replace('/', '-');
        
        heure_d = heure_d + ":00";
        
        heure_d = heure_d.replace('h', ':');
        
        heure_f = heure_f + ":00";
        
        heure_f = heure_f.replace('h', ':');
        
        Calendar cl = new GregorianCalendar();

        String mots[] = date.split("-");

        cl.set(Integer.parseInt(mots[0]), Integer.parseInt(mots[1])-1, Integer.parseInt(mots[2]));
        
        boolean finalInt = true;
        
        ArrayList allGroupesById;
        allGroupesById = new ArrayList();
        
        for(int i=0; i<allGroupes.size();i++){
            if("TD1 ING1".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(7);
            }else if("TD2 ING1".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(8);
            }else if("TD3 ING1".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(9);
            }else if("TD1 ING2".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(4);
            }else if("TD2 ING2".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(5);
            }else if("TD3 ING2".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(6);
            }else if("TD1 ING3".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(1);
            }else if("TD2 ING3".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(2);
            }else if("TD3 ING3".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(3);
            }else if("TD1 ING4".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(10);
            }else if("TD2 ING4".equals(allGroupes.get(i).getSelectedItem().toString())){
                allGroupesById.add(11);
            }else{
                allGroupesById.add(12);
            }
        }
        
        int capaciteDemandee = 0;
        
        for(int i = 0; i<allGroupesById.size(); i++){
            
            boolean check = true;
            
            for(int j=0; j<i; j++){
                if(allGroupesById.get(j)==allGroupesById.get(i)){
                    check = false;
                }
            }
            
            if(check){ 
                String myQuery = ("Select * from etudiant where etudiant.ID_Groupe = '"+(int)allGroupesById.get(i)+"'");
                
                rset = stmt.executeQuery(myQuery);
                
                while(rset.next())
                {
                    capaciteDemandee++;
                } 
            }
        }
        
        ArrayList allProfsById;
        allProfsById = new ArrayList();
        
        for(int i=0; i<allProfs.size();i++){
            if("SARSESKY".equals(allProfs.get(i).getSelectedItem().toString())){
                allProfsById.add(7);
            }else if("PULICI".equals(allProfs.get(i).getSelectedItem().toString())){
                allProfsById.add(8);
            }else{
                allProfsById.add(9);
            }
        }
        
        ArrayList allSallesById;
        allSallesById = new ArrayList();
        
        for(int i=0; i<allSalles.size(); i++){
            if("S1 - E1".equals(allSalles.get(i).getSelectedItem().toString())){
                allSallesById.add(1);
            }else if("S2 - E1".equals(allSalles.get(i).getSelectedItem().toString())){
                allSallesById.add(2);
            }else if("A1 - E1".equals(allSalles.get(i).getSelectedItem().toString())){
                allSallesById.add(3);
            }else if("S3 - E2".equals(allSalles.get(i).getSelectedItem().toString())){
                allSallesById.add(4);
            }else if("S4 - E2".equals(allSalles.get(i).getSelectedItem().toString())){
                allSallesById.add(5);
            }else if("A2 - E3".equals(allSalles.get(i).getSelectedItem().toString())){
                allSallesById.add(6);
            }else if("A3 - E3".equals(allSalles.get(i).getSelectedItem().toString())){
                allSallesById.add(7);
            }else if("S5 - E4".equals(allSalles.get(i).getSelectedItem().toString())){
                allSallesById.add(8);
            }else if("S6 - E4".equals(allSalles.get(i).getSelectedItem().toString())){
                allSallesById.add(9);
            }else{
                allSallesById.add(10);
            } 
        }
        
        int capaciteDonne = 0;
        
        for(int i = 0; i<allSallesById.size(); i++){
            
            boolean check = true;
            
            for(int j=0; j<i; j++){
                if(allSallesById.get(j)==allSallesById.get(i)){
                    check = false;
                }
            }
            
            if(check){ 
                String myQuery = ("Select * from salle where salle.ID = '"+(int)allSallesById.get(i)+"'");
                
                rset = stmt.executeQuery(myQuery);
                
                while(rset.next())
                {
                    capaciteDonne += rset.getInt("Capacite");
                } 
            }
        }
        
        String myQuery = ("Select * from seance where seance.Date = '"+date+"'"); //AND (seance.Heure_Debut = '"+heure_d+"' OR seance.Heure_Fin = '"+heure_f+"')");
        
        int hd = Character.getNumericValue(heure_d.charAt(0))*10+Character.getNumericValue(heure_d.charAt(1));
        int hf = Character.getNumericValue(heure_f.charAt(0))*10+Character.getNumericValue(heure_f.charAt(1));
        
        rset = stmt.executeQuery(myQuery);
                   
        int hdr;
        int hfr;
        
        ArrayList allId;
        allId = new ArrayList<>();
        
        while(rset.next())
        {
            hdr = Character.getNumericValue(rset.getString("Heure_Debut").charAt(0))*10 + Character.getNumericValue(rset.getString("Heure_Debut").charAt(1));
            hfr = Character.getNumericValue(rset.getString("Heure_Fin").charAt(0))*10 + Character.getNumericValue(rset.getString("Heure_Fin").charAt(1));
            
            if((hd==hdr || hf==hfr)||(hd<hdr && hf>hdr)||(hd<hfr && hf>hfr)||(hd<hdr && hf>hfr)){
                allId.add(rset.getInt("ID"));
            }
        }
        
        ArrayList allGroupesId;
        allGroupesId = new ArrayList();
        
        ArrayList allProfsId;
        allProfsId = new ArrayList();
        
        ArrayList allSallesId;
        allSallesId = new ArrayList();
        
        for(int i=0; i<allId.size(); i++){
            
            if((int)allId.get(i)!=r_id){
            
                myQuery = ("Select * from seance_groupes where seance_groupes.ID_Seance = '"+allId.get(i)+"'");

                rset = stmt.executeQuery(myQuery);

                int idGtmp;

                while(rset.next()){

                    idGtmp = rset.getInt("ID_Groupe");

                    if(allGroupesById.contains(idGtmp)){
                        allGroupesId.add(idGtmp);
                    }
                }

                myQuery = ("Select * from seances_enseignants where seances_enseignants.ID_Seance = '"+allId.get(i)+"'");

                rset = stmt.executeQuery(myQuery);

                int idPtmp;

                while(rset.next()){

                    idPtmp = rset.getInt("ID_Enseignant");

                    if(allProfsById.contains(idPtmp)){
                        allProfsId.add(idPtmp);
                    }
                }

                myQuery = ("Select * from seance_salles where seance_salles.ID_Seance = '"+allId.get(i)+"'");

                rset = stmt.executeQuery(myQuery);

                int idStmp;

                while(rset.next()){

                    idStmp = rset.getInt("ID_Salle");

                    if(allSallesById.contains(idStmp)){
                        allSallesId.add(idStmp);
                    }
                }
            }
        }
        
        if(cl.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
            except.dimanche();
            finalInt = false;
        }
        
        if(!allGroupesId.isEmpty()){
            except.groupesNonLibres(allGroupesId);
            finalInt = false;
        }
        
        if(!allProfsId.isEmpty()){
            except.profsNonLibres(allProfsId);
            finalInt = false;
        }
        
        if(!allSallesId.isEmpty()){
            except.sallesNonLibres(allSallesId);
            finalInt = false;
        }
        
        if(capaciteDemandee>capaciteDonne){
            except.capacite();
            finalInt = false;
        }
        
        if(finalInt){
            //call ajouter seance
            if(r_id==-1){
                ajouterSeance(date,heure_d,heure_f,Etat,cours,type,allGroupesById,allProfsById,allSallesById);
            }else{
                //modif
                supprimerSeance(r_id);
                ajouterSeance(date,heure_d,heure_f,Etat,cours,type,allGroupesById,allProfsById,allSallesById);
            }    
        }
        
        return finalInt;
    }
    
    /**
     *
     * @param ids
     * @return
     * @throws SQLException
     */
    public ArrayList groupesById(ArrayList ids) throws SQLException{
        ArrayList names;
        names = new ArrayList();
        
        for(int i=0; i<ids.size(); i++){
            
            String myQuery = ("Select * from groupe where groupe.ID = '"+ids.get(i)+"'");
            
            rset = stmt.executeQuery(myQuery);
            
            String send = "";
            
            while(rset.next()){
                
                send += rset.getString("Nom");
                
                send += " - ";
                
                send += "ING";
                
                send += rset.getInt("ID_Promotion");
                
                names.add(send);
            } 
        }
        return names;
    }
    
    /**
     *
     * @param ids
     * @return
     * @throws SQLException
     */
    public ArrayList profsById(ArrayList ids) throws SQLException{
        ArrayList names;
        names = new ArrayList();
        
        for(int i=0; i<ids.size(); i++){
            
            String myQuery = ("Select * from utilisateur where utilisateur.ID = '"+ids.get(i)+"'");
            
            rset = stmt.executeQuery(myQuery);
            
            while(rset.next()){
                names.add(rset.getString("Nom"));
            } 
        }
        return names;
    }
    
    /**
     *
     * @param ids
     * @return
     * @throws SQLException
     */
    public ArrayList sallesById(ArrayList ids) throws SQLException{
        ArrayList names;
        names = new ArrayList();
        
        for(int i=0; i<ids.size(); i++){
            
            String myQuery = ("Select * from salle where salle.ID = '"+ids.get(i)+"'");
            
            rset = stmt.executeQuery(myQuery);
            
            String send = "";
            
            while(rset.next()){
                
                send += rset.getString("Nom");
                
                send += " - ";
                
                send += "E";
                
                send += rset.getInt("ID_Site");
                
                names.add(send);
            } 
        }
        return names;
    }

    /**
     *
     * @param id
     * @throws java.sql.SQLException
     */
    public void supprimerSeance(int id) throws SQLException{ 
        
        PreparedStatement ps=conn.prepareStatement("DELETE FROM seances_enseignants WHERE seances_enseignants.ID_Seance='"+id+"'");
        
        ps.executeUpdate();
        
        ps=conn.prepareStatement("DELETE FROM seance_groupes WHERE seance_groupes.ID_Seance='"+id+"'");
        
        ps.executeUpdate();
        
        ps=conn.prepareStatement("DELETE FROM seance_salles WHERE seance_salles.ID_Seance='"+id+"'");
        
        ps.executeUpdate();
        
        ps=conn.prepareStatement("DELETE FROM seance WHERE seance.ID='"+id+"'");
            
        ps.executeUpdate();
        
    }
    
    /**
     *
     * @param week
     * @return
     * @throws SQLException
     */
    public ArrayList<Carte>[][] sallesLibres(int week) throws SQLException{
        ArrayList all = new ArrayList();
        ArrayList seanceIds = new ArrayList();
        ArrayList<Carte> allSeance = new ArrayList();
        ArrayList<Carte>[][] tableau;
        ArrayList salles = new ArrayList();
        
        salles.add("S1 - E1");
        salles.add("S2 - E1");
        salles.add("A1 - E1");
        salles.add("S3 - E2");
        salles.add("S4 - E2");
        salles.add("A2 - E3");
        salles.add("A3 - E3");
        salles.add("S5 - E4");
        salles.add("S6 - E4");
        salles.add("A4 - E4");
        
        String myQuery = ("Select * from seance where seance.Semaine = '"+week+"'");

        rset = stmt.executeQuery(myQuery);

        while(rset.next()){
            seanceIds.add(rset.getInt("ID"));
        }
        
        for(int i=0; i<seanceIds.size();i++){
            allSeance.add(getSeanceById((int)seanceIds.get(i)));
        }
        
        //tableau de arraylist 7*6 pour tous les horaires possibles et check si salle déjà prise dans allseance, sinon, ajouter dans le tableau qu'on returnera
        tableau = new ArrayList[7][6];
        
        for(int i=0; i<7; i++){
            for(int j=0;j<6; j++){
                tableau[i][j] = new ArrayList<>(salles);
            }
        }
        
        int start,end,jour;
        for(int i=0; i<allSeance.size();i++){
            
            start = allSeance.get(i).getHeureD()-1;
            end = allSeance.get(i).getHeureF()-1;
            
            jour = allSeance.get(i).getJour()-2;
            
            if(start==end){
                for (Object salle : allSeance.get(i).getSalles()) {
                    if(allSeance.get(i).getEtat()==0){
                        tableau[start][jour].remove(salle);
                    }
                }  
            }else{
                for(int j=start; j<=end; j++){
                    for (Object salle : allSeance.get(i).getSalles()) {
                        if(allSeance.get(i).getEtat()==0){
                            tableau[j][jour].remove(salle);
                        }
                    }  
                }
            }
        }
        return tableau;
    }
    
    /**
     *
     * @param dates
     * @param email
     * @return
     * @throws SQLException
     */
    public ArrayList<Recap> getRecap(ArrayList dates, String email) throws SQLException{
        
        String myQuery;
        
        myQuery = "Select * from utilisateur where utilisateur.Email = '"+email+"'";
        
        int ID = -1;
        
        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            ID = rset.getInt("ID");
        }
        
        ArrayList seanceIds = new ArrayList();
        
        myQuery = "Select * from seances_enseignants where seances_enseignants.ID_Enseignant = '"+ID+"'";
        
        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            seanceIds.add(rset.getInt("ID_Seance"));
        }
        
        ArrayList<Carte> allSeances = new ArrayList<>();
        ArrayList newSeanceIds = new ArrayList();
        
        for(int i=0; i<seanceIds.size(); i++){
            
            myQuery = "Select * from seance where seance.ID = '"+seanceIds.get(i)+"'";

            rset = stmt.executeQuery(myQuery);
            
            String date;

            while(rset.next())
            {
                date = rset.getString("Date");
                if(dates.contains(date)){
                   newSeanceIds.add(rset.getInt("ID"));
                }
            }  
        }
        
        Carte tmpCarte = new Carte();
        
        for(int i=0; i<newSeanceIds.size(); i++){
            tmpCarte = getSeanceById((int)newSeanceIds.get(i));
            if(tmpCarte.getEtat()==0){
                allSeances.add(tmpCarte);
            } 
        }
        
        ArrayList<Recap> allRecap = new ArrayList<>();       
        Recap tmpRecap;
        for(Carte allSeance : allSeances) {
            for (Object groupe : allSeance.getGroupes()) {
                
                double nbr = (allSeance.getHeureF()-allSeance.getHeureD()+1)*1.5;
                tmpRecap = new Recap(allSeance.getCours(), (String)groupe, nbr);
                
                boolean ok = true;
                
                for (Recap allRecap1 : allRecap) {
                    if(allRecap1.getMatiere().equals(tmpRecap.getMatiere())&&allRecap1.getGroupe().equals(tmpRecap.getGroupe())){
                        allRecap1.setNBH(tmpRecap.getNBH());
                        ok = false;
                    }
                }
                
                if(ok){
                    allRecap.add(tmpRecap);
                }
                
            }
        }
        
        return allRecap;
    }
    
    /**
     *
     * @param email
     * @return
     * @throws SQLException
     */
    public ArrayList<Recap> statsMatieresHeures(String email) throws SQLException{
        String myQuery;
        
        myQuery = "Select * from utilisateur where utilisateur.Email = '"+email+"'";
        
        int ID = -1;
        int droit = -1;
        
        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            ID = rset.getInt("ID");
            droit = rset.getInt("Droit");
        }
        
        ArrayList seanceIds = new ArrayList();
        
        if(droit==4){
            
            myQuery = "Select * from etudiant where etudiant.ID_Utilisateur = "+ID;
            
            int ID_Groupe = -1;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                ID_Groupe = rset.getInt("ID_Groupe");
            }
            
            myQuery = "Select * from seance_groupes where seance_groupes.ID_Groupe = "+ID_Groupe;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                seanceIds.add(rset.getInt("ID_Seance"));
            }
            
        }else if(droit==3){
            myQuery = "Select * from seances_enseignants where seances_enseignants.ID_Enseignant = "+ID;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                seanceIds.add(rset.getInt("ID_Seance"));
            }
        }
        
        ArrayList<Carte> allSeances = new ArrayList();
        
        Carte tmpCarte = new Carte();
        
        for(int i=0; i<seanceIds.size(); i++){
            tmpCarte = getSeanceById((int)seanceIds.get(i));
            if(tmpCarte.getEtat()==0){
                allSeances.add(tmpCarte);
            } 
        }
        
        ArrayList<Recap> allRecap = new ArrayList<>();       
        Recap tmpRecap;
        
        for(Carte allSeance : allSeances) {
            double nbr = (allSeance.getHeureF()-allSeance.getHeureD()+1)*1.5;
            tmpRecap = new Recap(allSeance.getCours(), "ok", nbr);
            
            boolean ok = true;
                
            for (Recap allRecap1 : allRecap) {
                if(allRecap1.getMatiere().equals(tmpRecap.getMatiere())){
                    allRecap1.setNBH(tmpRecap.getNBH());
                    ok = false;
                }
            }
            if(ok){
                allRecap.add(tmpRecap);
            }    
        } 
        return allRecap;
    }
    
    /**
     *
     * @param email
     * @return
     * @throws SQLException
     */
    public ArrayList<Recap> statsHeuresGroupesOuType(String email) throws SQLException{
        String myQuery;
        
        myQuery = "Select * from utilisateur where utilisateur.Email = '"+email+"'";
        
        int ID = -1;
        int droit = -1;
        
        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            ID = rset.getInt("ID");
            droit = rset.getInt("Droit");
        }
        
        ArrayList seanceIds = new ArrayList();
        
        if(droit==4){
            
            myQuery = "Select * from etudiant where etudiant.ID_Utilisateur = "+ID;
            
            int ID_Groupe = -1;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                ID_Groupe = rset.getInt("ID_Groupe");
            }
            
            myQuery = "Select * from seance_groupes where seance_groupes.ID_Groupe = "+ID_Groupe;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                seanceIds.add(rset.getInt("ID_Seance"));
            }
            
        }else if(droit==3){
            myQuery = "Select * from seances_enseignants where seances_enseignants.ID_Enseignant = "+ID;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                seanceIds.add(rset.getInt("ID_Seance"));
            }
        }
        
        ArrayList<Carte> allSeances = new ArrayList();
        
        Carte tmpCarte = new Carte();
        
        for(int i=0; i<seanceIds.size(); i++){
            tmpCarte = getSeanceById((int)seanceIds.get(i));
            if(tmpCarte.getEtat()==0){
                allSeances.add(tmpCarte);
            } 
        }
        
        ArrayList<Recap> allRecap = new ArrayList<>();       
        Recap tmpRecap;
        
        if(droit==3){
            for(Carte allSeance : allSeances) {
                for (Object groupe : allSeance.getGroupes()) {

                    double nbr = (allSeance.getHeureF()-allSeance.getHeureD()+1)*1.5;
                    tmpRecap = new Recap("ok", (String)groupe, nbr);

                    boolean ok = true;

                    for (Recap allRecap1 : allRecap) {
                        if(allRecap1.getGroupe().equals(tmpRecap.getGroupe())){
                            allRecap1.setNBH(tmpRecap.getNBH());
                            ok = false;
                        }
                    }

                    if(ok){
                        allRecap.add(tmpRecap);
                    }

                }
            }
        }
        
        if(droit==4){
            for(Carte allSeance : allSeances) {
                
                double nbr = (allSeance.getHeureF()-allSeance.getHeureD()+1)*1.5;
                tmpRecap = new Recap(allSeance.getType(), "ok", nbr);

                boolean ok = true;

                for (Recap allRecap1 : allRecap) {
                    if(allRecap1.getMatiere().equals(tmpRecap.getMatiere())){
                        allRecap1.setNBH(tmpRecap.getNBH());
                        ok = false;
                    }
                }

                if(ok){
                    allRecap.add(tmpRecap);
                }
            }
        }
        
        return allRecap;
    }
    
    /**
     *
     * @param email
     * @return
     * @throws SQLException
     */
    public ArrayList<Recap> statsNbrHeuresCours(String email) throws SQLException{
        String myQuery;
        
        myQuery = "Select * from utilisateur where utilisateur.Email = '"+email+"'";
        
        int ID = -1;
        int droit = -1;
        
        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            ID = rset.getInt("ID");
            droit = rset.getInt("Droit");
        }
        
        ArrayList seanceIds = new ArrayList();
        
        if(droit==4){
            
            myQuery = "Select * from etudiant where etudiant.ID_Utilisateur = "+ID;
            
            int ID_Groupe = -1;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                ID_Groupe = rset.getInt("ID_Groupe");
            }
            
            myQuery = "Select * from seance_groupes where seance_groupes.ID_Groupe = "+ID_Groupe;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                seanceIds.add(rset.getInt("ID_Seance"));
            }
            
        }else if(droit==3){
            myQuery = "Select * from seances_enseignants where seances_enseignants.ID_Enseignant = "+ID;

            rset = stmt.executeQuery(myQuery);

            while(rset.next())
            {
                seanceIds.add(rset.getInt("ID_Seance"));
            }
        }
        
        ArrayList<Carte> allSeances = new ArrayList();
        
        Carte tmpCarte = new Carte();
        
        for(int i=0; i<seanceIds.size(); i++){
            tmpCarte = getSeanceById((int)seanceIds.get(i));
            if(tmpCarte.getEtat()==0){
                allSeances.add(tmpCarte);
            } 
        }
        
        ArrayList<Recap> allRecap = new ArrayList<>();       
        Recap tmpRecap;
        
        //System.out.println("taille allSeance : "+allSeances.size());
        
        for(Carte allSeance : allSeances) {
                
            double nbr = (allSeance.getHeureF()-allSeance.getHeureD()+1)*1.5;
            tmpRecap = new Recap(Integer.toString(allSeance.getSemaine()), "ok", nbr);

            boolean ok = true;

            for (Recap allRecap1 : allRecap) {
                if(allRecap1.getMatiere().equals(tmpRecap.getMatiere())){
                    allRecap1.setNBH(tmpRecap.getNBH());
                    ok = false;
                }
            }

            if(ok){
                allRecap.add(tmpRecap);
            }
        }
        
        int min = 1000000;
        int max = -1;
        for(Recap allR : allRecap){
            if(Integer.parseInt(allR.getMatiere())<min){
                min = Integer.parseInt(allR.getMatiere());
            }
            if(Integer.parseInt(allR.getMatiere())>max){
                max = Integer.parseInt(allR.getMatiere());
            }
        }
        
        boolean ok = true;
        
        for(int i=min+1; i<max;i++){
            tmpRecap = new Recap(Integer.toString(i), "ok", 0);
            for (Recap allRecap1 : allRecap) {
                if(allRecap1.getMatiere().equals(tmpRecap.getMatiere())){
                    ok = false;
                }
            }

            if(ok){
                allRecap.add(tmpRecap);
            }
        }
        
        return allRecap;
    }
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<Recap> tauxOccupation() throws SQLException{
        
        String myQuery;
        
        myQuery = "Select * from seance"; // where utilisateur.Email = '"+email+"'";
        
        ArrayList allSeanceIds = new ArrayList();
        
        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            allSeanceIds.add(rset.getInt("ID")); 
        }
        
        ArrayList<Carte> allSeance = new ArrayList<>();
        
        for(int i=0; i<allSeanceIds.size();i++){
            allSeance.add(getSeanceById((int)allSeanceIds.get(i)));
        }
        
        ArrayList<Recap> allRecap = new ArrayList<>();  
        Recap tmpRecap;
        
        for(Carte seance : allSeance){
            
            //String tmpString;
            //String tmpSalle;
            //double capacite = 0;
            
            double duree = seance.getHeureF()-seance.getHeureD()+1;
            
            /*for (Object salle : seance.getSalles()) {
                
                tmpString = (String) salle;
                String mots[] = tmpString.split(" ");
                tmpSalle = mots[0];
                
                myQuery = "Select * from salle where salle.Nom = '"+tmpSalle+"'";

                rset = stmt.executeQuery(myQuery);

                while(rset.next())
                {
                    capacite += rset.getInt("Capacite"); 
                }
            }*/
            
            tmpRecap = new Recap(Integer.toString(seance.getSemaine()), "ok", duree*seance.getSalles().size());
            
            boolean ok = true;

            for (Recap allRecap1 : allRecap) {
                if(allRecap1.getMatiere().equals(tmpRecap.getMatiere())){
                    allRecap1.setNBH(tmpRecap.getNBH());
                    ok = false;
                }
            }

            if(ok){
                allRecap.add(tmpRecap);
            }
            
        }
        
        int min = 1000000;
        int max = -1;
        for(Recap allR : allRecap){
            if(Integer.parseInt(allR.getMatiere())<min){
                min = Integer.parseInt(allR.getMatiere());
            }
            if(Integer.parseInt(allR.getMatiere())>max){
                max = Integer.parseInt(allR.getMatiere());
            }
        }
        
        boolean ok = true;
        
        for(int i=min+1; i<max;i++){
            tmpRecap = new Recap(Integer.toString(i), "ok", 0);
            for (Recap allRecap1 : allRecap) {
                if(allRecap1.getMatiere().equals(tmpRecap.getMatiere())){
                    ok = false;
                }
            }

            if(ok){
                allRecap.add(tmpRecap);
            }
        }
        return allRecap;
    }
    
    /**
     *
     * @param salle
     * @return
     * @throws SQLException
     */
    public ArrayList<Carte> allSeancesBySalle(String salle) throws SQLException{
        String mots[] = salle.split(" ");
        String name = mots[0];
        
        String myQuery = "Select * from salle where salle.Nom = '"+name+"'";
        
        int id = -1;

        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            id = rset.getInt("ID"); 
        }
        
        ArrayList seanceIds = new ArrayList();
        
        myQuery = "Select * from seance_salles where seance_salles.ID_Salle = '"+id+"'";
        
        rset = stmt.executeQuery(myQuery);

        while(rset.next())
        {
            seanceIds.add(rset.getInt("ID_Seance")); 
        }
        
        ArrayList<Carte> allSeance = new ArrayList<>();
        
        for(Object sId : seanceIds){
            int newId = (int) sId;
            allSeance.add(getSeanceById(newId));
        }
        return allSeance;
    }
}