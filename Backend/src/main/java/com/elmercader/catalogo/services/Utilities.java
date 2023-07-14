package com.elmercader.catalogo.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {

    private static boolean validateRegex(String pattern,String candidate){
        Pattern pattern_obj= Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern_obj.matcher(candidate);
        return matcher.find();
    }

    /**
     * Utiliti validate Email
     * @param email
     * @return True or False
     */
    public static boolean validateEmail(String email){
        String emailPattern = "[a-z][a-z.0-9]*@usa.edu.co";
        return validateRegex(emailPattern,email);
    }
}
