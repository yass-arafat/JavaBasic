/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.codeforcesPBSolution;

import java.util.Scanner;

/**
 *
 * @author Yassir Arafat
 */
public class StringTask118A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String ans = new String();
        
        char[] ans = new char[10000];

        String str = input.next();

        str = str.toLowerCase();
        
        int i = 0;
        
        for (Character c : str.toCharArray()) {
            
            if (!c.equals("a") || !c.equals("e") || !c.equals("i") || !c.equals("o") || !c.equals("u")) {
                ans[i++] = '.';
                ans[i++] = c;
            }
        }
        ans[i] = '\0';
        
        System.out.println(ans);

    }
}
