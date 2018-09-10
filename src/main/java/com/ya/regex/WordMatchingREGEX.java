/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ans.- \b is for only word not substring 
 * @author Yassir Arafat
 */
public class WordMatchingREGEX {
    public static void main(String[] args){
        
        String expression = "The cat scattered his food all over the room.";
        String REGEX = "\\bcat\\b";
        
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(expression);
        
        while(matcher.find()){
            System.out.println("Found it = "+matcher.group());
        }
//        Q. - Why it will not count 'cat' from 'scattered' 
    }
}
