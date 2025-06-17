/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
class Login {
     private String Username;
    private String Password;
    
    public void SetUserName(String username) {
        Username = username;
    }
    
    public String GetUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public boolean checkusername(String username) {
        return username.length() == 5 && username.contains("_");
    }

    public boolean checkpassword(String password) {
        return password.length() >= 8 && 
               password.matches(".*[A-Z].*") && 
               password.matches(".*[a-z].*") && 
               password.matches(".*[0-9].*") && 
               password.matches(".*[!@#$%^&*<>?|}{+_=-].*");
    }
    
    public boolean isValidSouthAfricanNumber(String phoneNumber) {
        return SA_PHONE_PATTERN.matcher(phoneNumber).matches();
    }

    public String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("0")) {
            return "+27" + phoneNumber.substring(1);
        }
        return phoneNumber;
    }
    
    public final Pattern SA_PHONE_PATTERN = 
        Pattern.compile("^(\\+27|0)[678]\\d{8}$");
    
    public boolean LoginUser(String username, String password) {
        return username.equals(this.Username) && password.equals(this.Password);
    }
}