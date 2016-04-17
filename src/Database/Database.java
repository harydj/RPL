/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThareeqAD
 */
public class Database {
    private Statement statement;
    private Connection connection;
    
    public void connect(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql");
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect() {
        try {
            connection.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String q) {
        int x = -1;
        try {

            x = statement.executeUpdate(q);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (x >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public ResultSet getData(String q){
        try {
            return statement.executeQuery(q);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
