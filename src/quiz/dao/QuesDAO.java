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
import java.util.ArrayList;
import quiz.dbutil.ConnectionToDB;
import quiz.pojo.Question;
import quiz.pojo.QuestionStore;

/**
 *
 * @author yasi
 */
public class QuesDAO {
  public static void addQuestion(QuestionStore qstore)throws SQLException{
      String qry="Insert into questions values(?,?,?,?,?,?,?,?,?)";
      ArrayList <Question> quesList=qstore.getAllQuestion();
      Connection conn=ConnectionToDB.getConnection();
      PreparedStatement ps=conn.prepareStatement(qry);
      for(Question x:quesList){
          ps.setString(1,x.getExamId());
          ps.setInt(2,x.getQno());
          ps.setString(3,x.getQuestion());
          ps.setString(4,x.getAns1());
          ps.setString(5,x.getAns2());
          ps.setString(6,x.getAns3());
          ps.setString(7,x.getAns4());
          ps.setString(8,x.getCorrectAns());
          ps.setString(9,x.getLanguage());
          ps.executeUpdate();          
      }
  }
  
public static void updateQuestion(QuestionStore qstore)throws SQLException{
      String qry="update questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=?,language=? where qno=? and examid=?";
      ArrayList <Question> quesList=qstore.getAllQuestion();
      Connection conn=ConnectionToDB.getConnection();
      PreparedStatement ps=conn.prepareStatement(qry);
      for(Question x:quesList){
          ps.setString(9,x.getExamId());
          ps.setInt(8,x.getQno());
          ps.setString(1,x.getQuestion());
          ps.setString(2,x.getAns1());
          ps.setString(3,x.getAns2());
          ps.setString(4,x.getAns3());
          ps.setString(5,x.getAns4());
          ps.setString(6,x.getCorrectAns());
          ps.setString(7,x.getLanguage());
          ps.executeUpdate();          
      }
  }

public static ArrayList<Question> getQuestionByExamId(String exid) throws SQLException{
    Connection conn=ConnectionToDB.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from questions where examid=? order by qno");
        ps.setString(1, exid);
        ResultSet rs=ps.executeQuery();
        ArrayList<Question> quesList=new ArrayList<>();
        while(rs.next()){
        Question q=new Question(rs.getString(1),rs.getInt(2),rs.getString(9),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(3));
        quesList.add(q);   
        }
        return quesList;
}
}
