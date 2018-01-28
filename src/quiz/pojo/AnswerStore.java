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
public class AnswerStore {
    ArrayList<Answer> ansList;

    public AnswerStore() {
        ansList=new ArrayList<>();
    }
    public void addAnswer(Answer ans){
        ansList.add(ans);
    }
    public Answer getAnswer(int pos){
        return ansList.get(pos);
    }
    public void removeAnswer(int pos){
        ansList.remove(pos);
    }
    public void setAnswerAt(int pos,Answer obj){
        ansList.add(pos,obj);
        }
    public ArrayList<Answer> getAllAnswer(){
        return ansList;
    }
    
    public int getCount(){
        return ansList.size();
    }
    public Answer getAnswerByQno(int qno){
        for(Answer ans:ansList){
            if(ans.getQno()==qno){
                return ans;
            }
        }return null;
    }
    public int removeAnswer(Answer answer){
       int pos=ansList.indexOf(answer); //equals of Answer called to comapare with each ArrayList object and returns postition if true
       ansList.remove(pos);
       return pos;
    } 
    
}
