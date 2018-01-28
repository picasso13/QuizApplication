/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quiz.dbutil.ConnectionToDB;
import quiz.pojo.Quiz;

/**
 *
 * @author yasi
 */
public class QuizDAO {
 public static boolean checkUser(Quiz q) throws SQLException{
      Connection conn=ConnectionToDB.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from users where userid=?");
        ps.setString(1,q.getUserId());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
          return rs.getString(2).equals(q.getUserPass())&& rs.getString(3).equals(q.getUserType());
}
        return false;
        
}
public static boolean addUser(Quiz q) throws SQLException{
     Connection conn=ConnectionToDB.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select * from users where userid=?");
     ps.setString(1,q.getUserId());
     ResultSet rs=ps.executeQuery();
     if(rs.next()){
     return false;    
     }
     else{
         ps = conn.prepareStatement("Insert into users values(?,?,?)"); //new object
        
        ps.setString(1,q.getUserId());
        ps.setString(2,q.getUserPass());
        ps.setString(3,q.getUserType());
        
        ps.executeUpdate();
}
return true;}

public static boolean updateUser(Quiz q) throws SQLException{
     Connection conn=ConnectionToDB.getConnection();
     
        PreparedStatement ps = conn.prepareStatement("Update users set password=? where userid=?"); 
        
        ps.setString(2,q.getUserId());
        ps.setString(1,q.getUserPass());   
        if(ps.executeUpdate()==1) return true;
return false;
}

}
