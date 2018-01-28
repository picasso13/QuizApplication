/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pojo;

/**
 *
 * @author yasi
 */
public class Exam {
    private String examid;
    private String language;
    private int ques;

    public Exam(String examid, String language, int ques) {
        this.examid = examid;
        this.language = language;
        this.ques = ques;
    }


    public void setExamid(String examid) {
        this.examid = examid;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setQues(int ques) {
        this.ques = ques;
    }

    public String getExamid() {
        return examid;
    }

    public String getLanguage() {
        return language;
    }

    public int getQues() {
        return ques;
    }
}
