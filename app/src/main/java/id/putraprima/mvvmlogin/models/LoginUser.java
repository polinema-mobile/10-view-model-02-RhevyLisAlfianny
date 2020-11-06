package id.putraprima.mvvmlogin.models;

import android.text.TextUtils;
import android.util.Patterns;

public class LoginUser {

    String strEmailAddress = "xxx@gmail.com";
    String strPassword = "123456";
    public void setStrEmailAddress(String strEmailAddress) { this.strEmailAddress = strEmailAddress; }
    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }
    public String getStrEmailAddress() {
        return strEmailAddress;
    }
    public String getStrPassword() {
        return strPassword;
    }

    public LoginUser(){

    }

    public LoginUser(String EmailAddress, String Password) {
        strEmailAddress = EmailAddress;
        strPassword = Password;
    }
/*
    public boolean isEmailValid() {
        if(this.strEmailAddress != null && !TextUtils.isEmpty(strEmailAddress) && Patterns.EMAIL_ADDRESS.matcher(getStrEmailAddress()).matches()){
            return true;
        }
        return false;
    }


    public boolean isPasswordValid() {
        if(this.strPassword != null && this.strPassword.length() >= 6){
            return  true;
        }
        return  false;
    }

    public  boolean isValidCrential(){
        if(this.strEmailAddress.equalsIgnoreCase("xx@gmail.com") && this.strPassword.equals("123456")){
            return true;
        }
        return false;
    }*/

}
