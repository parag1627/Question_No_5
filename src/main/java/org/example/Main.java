package org.example;

public class Main {
    public static void main(String[] args) {
       String email = "test01*gmail.com";
       String ans =findValidEmail(email);
       System.out.println("Given EmailID is :" + ans);

    }
    public static  String findValidEmail(String email){
        boolean isValid= isValidEmail(email);
        if(isValid){
            return "Valid Email Id";
        }
        return "Invalid Email Id";
    }
    public static boolean isValidEmail(String email){
        String r = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$";
        return email.matches(r);
    }

}
//    Write a program that accepts an email string and validates that email. If email is valid must display success message and If email is not valid must display error message
//        Example:  Input - test01*gmail.com
//        Output - Invalid Email Id
//        Input - student01@gmail.com
//	     Output - Valid Email Id
