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
public class Answer {
    private String examId;
    private String subject;
    private int qno;
    private String chosenAns;
    private String correctAns;

    public Answer(String examId, String subject, int qno, String chosenAns, String correctAns) {
        this.examId = examId;
        this.subject = subject;
        this.qno = qno;
        this.chosenAns = chosenAns;
        this.correctAns = correctAns;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Answer other = (Answer) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.chosenAns, other.chosenAns)) {
            return false;
        }
        if (!Objects.equals(this.correctAns, other.correctAns)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Answer{" + "examId=" + examId + ", subject=" + subject + ", qno=" + qno + ", chosenAns=" + chosenAns + ", correctAns=" + correctAns + '}';
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setChosenAns(String chosenAns) {
        this.chosenAns = chosenAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public String getExamId() {
        return examId;
    }

    public String getSubject() {
        return subject;
    }

    public int getQno() {
        return qno;
    }

    public String getChosenAns() {
        return chosenAns;
    }

    public String getCorrectAns() {
        return correctAns;
    }
}
