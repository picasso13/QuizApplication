/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pojo;

import java.util.ArrayList;

/**
 *
 * @author yasi
 */
public class QuestionStore {
    ArrayList <Question> ques;
    
public QuestionStore(){
       ques=new ArrayList<>();
}
public void addQuestion(Question q){
    ques.add(q);
}
public Question getQuestion(int pos){
    return ques.get(pos);
}
public void removeQues(int pos){
    ques.remove(pos);
}
public void setQuesAt(int pos, Question q){
    ques.add(pos,q);
}
public ArrayList<Question> getAllQuestion(){
    return ques;
}
public int getCount(){
    return ques.size();
}
}
