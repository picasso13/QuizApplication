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
import java.sql.Statement;
import java.util.ArrayList;
import quiz.dbutil.ConnectionToDB;
import quiz.pojo.Performance;
import quiz.pojo.StudentScore;

/**
 *
 * @author yasi
 */
public class PerformanceDAO {
   public static ArrayList<String> getAllStudent() throws SQLException{
     Connection conn=ConnectionToDB.getConnection();
     Statement st=conn.createStatement();
            ResultSet rs= st.executeQuery("Select distinct userid from performance"); //for unique rows
            ArrayList <String> allStu=new ArrayList<>();
   while(rs.next()){
       String id=rs.getString(1);
        allStu.add(id);
   }
   return allStu;
   }
  public static ArrayList<String> getAllExamId(String str) throws SQLException{
     Connection conn=ConnectionToDB.getConnection();
     System.out.println(str);
     PreparedStatement ps=conn.prepareStatement("Select examid from performance where userid=?");
     ps.setString(1,str);
            ResultSet rs= ps.executeQuery(); //for unique rows
            ArrayList <String> allId=new ArrayList<>();
   while(rs.next()){
       String userId=rs.getString(1);
        allId.add(userId);
   }  
   System.out.println(allId);
  return allId;
  }
  
  public static StudentScore getScore(String stuid,String exmid) throws SQLException{
  Connection conn=ConnectionToDB.getConnection();
     PreparedStatement ps=conn.prepareStatement("Select language,per from performance where userid=? and examid=?");
     ps.setString(1,stuid);
     ps.setString(2,exmid);
     ResultSet rs=ps.executeQuery();
     rs.next();
     StudentScore ss=new StudentScore();
     ss.setLanguage(rs.getString(1));
     ss.setPer(rs.getDouble(2));
    return ss;   
  }
  public static ArrayList<Performance> getAllData() throws SQLException{
      Connection conn=ConnectionToDB.getConnection();
     Statement st=conn.createStatement();
            ResultSet rs= st.executeQuery("Select * from performance"); //for unique rows
            ArrayList <Performance> allData=new ArrayList<>();
   while(rs.next()){
    Performance p=new Performance(rs.getString(1),rs.getString(2),rs.getString(7),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getDouble(6));
  allData.add(p);  
  }
   return allData;
}
  
  public static void addPerformance(Performance p) throws SQLException{
       Connection conn=ConnectionToDB.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into performance values(?,?,?,?,?,?,?)");
     ps.setString(1,p.getUserid());
     ps.setString(2,p.getExamid());
      ps.setInt(3,p.getRight());
       ps.setInt(4,p.getWrong());
       ps.setInt(5,p.getUnattempted());
        ps.setDouble(6,p.getPer());
        ps.setString(7,p.getLanguage());       
       
     ps.executeQuery();
     
  }
}
