/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvanceBasic.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Yassir Arafat
 */
public class FilterAndFindAny {
    
    private static List<String> listOfUsers = new ArrayList<String>(Arrays.asList("user1", "user2", "user3", "user4"));
    
    public static void main(String[] args) {
        findAndReturnRequiredElement();
        
    }
    
    /**
     * PB1: In normal Loop we can break/return the result when some conditions met
     * Could we do that with ForEach loop or how could we do that???
     * Sol - we can do that with filter() and findAny()
     */
    private static void findAndReturnRequiredElement() {
        String ans = listOfUsers.stream()
                .filter((u) -> u.equals("user1"))
                .findAny().get();
        
        System.out.println("ans = "+ans);
    }
}
