/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Yassir Arafat
 */
public class TwoCapitalLetters {
    public static void main(String[] args) {
        
        String REGEX = "[A-Z].*[A-Z]"; // This will work also (?=(?:.*[A-Z].*){2})
        String expression = "PassWord@2016";
        
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(expression);
        
        if(matcher.find()){
            System.out.println("Matched = "+matcher.group());
        }else{
            System.out.println("Not Matches");
        }
    }
}
