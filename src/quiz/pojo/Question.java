/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pojo;

import java.util.Objects;

/**
 *
 * @author yasi
 */
public class Question {

    public Question(String examId, int qno, String language, String ans1, String ans2, String ans3, String ans4, String correctAns, String question) {
        this.examId = examId;
        this.qno = qno;
        this.language = language;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.correctAns = correctAns;
        this.question = question;
    }
    private String examId;
    private int qno;
     private String language;
      private String ans1,ans2,ans3,ans4;
          private String correctAns;
          private String question;

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {      
        final Question other = (Question) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (!Objects.equals(this.ans1, other.ans1)) {
            return false;
        }
        if (!Objects.equals(this.ans2, other.ans2)) {
            return false;
        }
        if (!Objects.equals(this.ans3, other.ans3)) {
            return false;
        }
        if (!Objects.equals(this.ans4, other.ans4)) {
            return false;
        }
        if (!Objects.equals(this.correctAns, other.correctAns)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "examId=" + examId + ", qno=" + qno + ", language=" + language + ", ans1=" + ans1 + ", ans2=" + ans2 + ", ans3=" + ans3 + ", ans4=" + ans4 + ", correctAns=" + correctAns + ", question=" + question + '}';
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getExamId() {
        return examId;
    }

    public int getQno() {
        return qno;
    }

    public String getLanguage() {
        return language;
    }

    public String getAns1() {
        return ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public String getQuestion() {
        return question;
    }
             
}
