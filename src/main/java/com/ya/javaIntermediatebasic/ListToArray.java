/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaIntermediatebasic;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Yassir Arafat
 */
public class ListToArray {
    
    public static void main(String[] args) {
        List<String> userName = Arrays.asList("yassir", "tazdik", "brishty", "adhri", "sunny");
        
        // 1 way to do it
        String[] userNameArray2 = userName.toArray(new String[userName.size()]);
        
        // another way to do it
        String[] userNameArray1 = userName.toArray(new String[0]);
        
        // which one is better ??????
        // Does the size of the argument make any difference?
        // Ans. = 1) it saves one more array instnatiation
        //        2) Turns out that providing a zero-length array, even creating it and 
        //           throwing it away, is on average faster than allocating an array of the right size. 
        //           For benchmarks and explanation see here: shipilev.net/blog/2016/arrays-wisdom-ancients 
        
        
        // Java 8 approach to do that
        String[] userNameArray3 = userName.stream().toArray(String[]::new);
        
        System.out.println("Approach1 = "+userNameArray1);
        System.out.println("Approach2 = "+userNameArray2);
        System.out.println("Approach3 = "+userNameArray3);
    }
}
