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
public class LuckyDivision122A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Integer numerator = in.nextInt();
        Integer denominator;
        boolean almostLucky = false;
        
        for(denominator = 2; denominator <= numerator ; denominator++){
            if(checkIsLuckyNumber(denominator)){
                if(numerator % denominator == 0){
                    almostLucky = true;
                    break;
                }
            }
        }
        if(almostLucky)
        System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean checkIsLuckyNumber(Integer number) {
        int len = (int) Math.log10(number) +1;
        
        for(int i = len -1 ; i >= 0; i--){
            int quotion = number / 10;
            int remainder = number % 10;
            
            if(remainder != 4 && remainder != 7){
                return false;
            }
            number = quotion;
        }
        return true;
    }
}
