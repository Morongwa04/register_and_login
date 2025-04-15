/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register_and_login;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class Register_and_login {

    // Define this as a class constant
    private static final Pattern SA_PHONE_PATTERN = Pattern.compile("^(\\+27|0)[6-8][0-9]{8}$");

    // Method to validate South African phone numbers
    public static boolean isValidSouthAfricanNumber(String cellPhoneNumber) {
        return SA_PHONE_PATTERN.matcher(cellPhoneNumber).matches();
    }

    public static void main(String[] args) {
        // Creating an instance to create a class
        Login objLogin = new Login();
        Scanner input = new Scanner(System.in);

        boolean isValidUsername = false;
        
        objLogin.setUsername(objLogin.getUsername());

        // Prompting user to enter username
        while (!isValidUsername) {
            System.out.print("Please enter your username: ");
            
            objLogin.setUsername(input.nextLine());

            //  Using if else statemments to check username
          if(objLogin.checkUsername(objLogin.getUsername()) == true ){
                System.out.println("Thank you for the username!");
                isValidUsername = true;
            } else {
                System.out.println("The username is incorrectly formatted.");
            }
        }

        boolean isValidCellPhoneNumber = false;
        String cellPhoneNumber;

        // Prompting the user to enter the cell phone number
        while (!isValidCellPhoneNumber) {
            System.out.print("Enter your cell phone number: ");
            cellPhoneNumber = input.nextLine();

            if (isValidSouthAfricanNumber(cellPhoneNumber)) {
                System.out.println("Cell phone number successfully captured!");
                isValidCellPhoneNumber = true;
            } else {
                System.out.println("Invalid South African phone number. Try again.");
            }
        }

        boolean validPassword = false;
         
        // While loop to keep asking for password until it's valid
        while (!validPassword) {
        //Prompting the user to enter a password
        System.out.println("Enter a password");
        
        objLogin.setPassword(input.nextLine());
        
        //Using if else statements to check the password
        if (objLogin.checkPassword (objLogin.getPassword()) == true) {
         
             //Results
             System.out.println("Password successfully captured");
         validPassword = true;  // Exit the loop
        }else{
            //Results
            System.out.println("The password is incorrectly formated, try again\n");}
        }   
      
         // User information
            System.out.print("Enter your first name: ");
            String firstName = input.nextLine();
            System.out.print("Enter your last name: ");
            String lastName = input.nextLine();
        
            // Login section
            System.out.println("\n== Login ===");
            boolean loggedIn = false;
            
            while(!loggedIn ) {
            System.out.println("Enter your username:");
            String loginUsername = input.nextLine();
            objLogin.setVerifyUsername(loginUsername);
            
            System.out.println("Enter your password:");
            String loginPassword = input.nextLine();

            if (loginUsername.equals(objLogin.getUsername()) &&  objLogin.loginUser(objLogin.getUsername(), objLogin.getPassword(), loginUsername, loginPassword)) {
                System.out.println("Login successful! Welcome, " + firstName + " " + lastName);
                loggedIn = true;
            } else {
                System.out.println("Login failed. Please check your username and password.");
            }    
            
        }
   
        input.close();
    }
}