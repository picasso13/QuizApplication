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
public class Quiz {
    private String uid="";
    private String upass="";
    private String uType="";
    
    public String getUserId(){
        return uid;
    }
    public String getUserPass(){
        return upass;
    }
    public String getUserType(){
        return uType;
    }
    public void setUserId(String uid){
        this.uid=uid;
    }
    public void setUserPass(String upass){
        this.upass=upass;
    }
    public void setUserType(String uType){
        this.uType=uType;
    }
    
}
