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
public class Performance {
    private String userid,examid,language;
    private int right,wrong,unattempted;
    private double per;

    public Performance(String userid, String examid, String language, int right, int wrong, int unattempted, double per) {
        this.userid = userid;
        this.examid = examid;
        this.language = language;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.per = per;
    }

    public Performance() {
    }

    public String getUserid() {
        return userid;
    }

    public String getExamid() {
        return examid;
    }

    public String getLanguage() {
        return language;
    }

    public int getRight() {
        return right;
    }

    public int getWrong() {
        return wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public double getPer() {
        return per;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public void setPer(double per) {
        this.per = per;
    }
    
}
