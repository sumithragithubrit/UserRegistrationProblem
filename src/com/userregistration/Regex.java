package com.userregistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public  void validFirstName() {
         Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("Sumithra");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
        
    }   
    public  void validLastName() {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("buddareddy");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }

}
