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
public class UserLogin {
    private static String username;
    private static String userType;
    
    public static String getUserName(){
        return username;
    }
    public static String getUserType(){
        return userType;
    }
    public static void setUserName(String username){
        UserLogin.username=username;
    }
     public static void setUserType(String userType){
        UserLogin.userType=userType;
    }

}
