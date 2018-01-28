/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yasi
 */
public class ConnectionToDB {
    private static Connection conn;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1522/orcl2","project","java");
JOptionPane.showMessageDialog(null,"Connected to database","Success",JOptionPane.INFORMATION_MESSAGE);
        }
         catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        if(conn!=null){
        try{
        conn.close();
    }
    catch(SQLException ex){}
    }
    } 
    
}
