/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvanceBasic.Classes;

/**
 *
 * @author Yassir Arafat
 */
public class AnonymousClass {
    
    public static void main(String[] args) {
        
        IAnonymous anonymous = (int a, int b) -> {
            return a > b;
        };

        System.out.println("A is greater than b ? "+isGreaterThen(15, 10, anonymous));
    }
    
    private static boolean isGreaterThen(int a, int b, IAnonymous anonymous){
        return anonymous.compareNumber(a, b);
    }

    private interface IAnonymous {

        public boolean compareNumber(int a, int b);
    }
}
