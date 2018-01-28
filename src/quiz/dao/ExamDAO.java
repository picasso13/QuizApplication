/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import quiz.dbutil.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import quiz.pojo.Exam;

/**
 *
 * @author yasi
 */
public class ExamDAO {

    /**
     *
     * @return
     * @throws SQLException
     */
    public static String getExamId() throws SQLException
    {
        Connection conn=ConnectionToDB.getConnection();
        Statement st=conn.createStatement();
        int count=0;
        ResultSet rs=st.executeQuery("Select count(*) as totalrows from exam");
        if(rs.next())
            count=rs.getInt(1);
        String ID= "EX-"+(count+1);
        return ID;
    }
    public static void addExam(Exam newExam) throws SQLException{
        Connection conn=ConnectionToDB.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into exam values(?,?,?)");
        ps.setString(1,newExam.getExamid());
        ps.setString(2, newExam.getLanguage());
        ps.setInt(3,newExam.getQues());
        ps.executeUpdate();
    }
    public static int getQuesCountByExam (String exid) throws SQLException{
        Connection conn=ConnectionToDB.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select totalquestion from exam where examid=?");
        ps.setString(1,exid);
        ResultSet rs=ps.executeQuery();
        rs.next();
        int count=rs.getInt(1);
        System.out.println(count);
        return count;
    }
    public static ArrayList <String> getExamIdBySubject(String subj) throws SQLException{
        Connection conn=ConnectionToDB.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from exam where language=?");
        // System.out.println("Inside getExamIdBySubject");
        ps.setString(1,subj);
        ArrayList <String> examId=new ArrayList<>();
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            String str=rs.getString(1);
        examId.add(str);
        System.out.println(str);
        }
        return examId;
    }
    public static ArrayList <String> getAllLanuage() throws SQLException{
      Connection conn=ConnectionToDB.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select distinct language from exam");
        ArrayList <String> language=new ArrayList<>();
        while(rs.next()){
        String str=rs.getString(1);
        language.add(str);
        //System.out.println(str);
        //System.out.println(str);
        }
        // System.out.println("ArrayList"+language);
        return language;  
    }
    }

