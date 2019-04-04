/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvanceBasic.Classes;

import java.util.function.Function;

/**
 * the process/pattern is used here is known as Command Pattern
 * @author Yassir Arafat
 */
public class AnonymousClass {
    
    private interface IAnonymous {

        public boolean compareNumber(int a, int b);
    }
    
    public static void main(String[] args) {
        
        // Anyonymas class without lamda implementation
        IAnonymous anonymousWithoutLamda = new IAnonymous() {
            @Override
            public boolean compareNumber(int a, int b) {
                return a > b;
            }
        };
        System.out.println("A is greater than b ? "+anonymousWithoutLamda.compareNumber(10, 12));
        
        // Anyonymas class with lamda implementation
        IAnonymous anonymous = (int a, int b) -> {
            return a > b;
        };
        System.out.println("A is greater than b ? "+isGreaterThen(15, 10, anonymous));
        
        // Anonymas class with JAVA 8 Functional way
        
        
    }
    
    private static boolean isGreaterThen(int a, int b, IAnonymous anonymous){
        return anonymous.compareNumber(a, b);
    }
    
//    private static final Function<Function<Integer, Integer>,Boolean> checkIsGreaterThan = new Function<Function<Integer, Integer>, Boolean>() {
//        @Override
//        public Boolean apply(Function<Integer, Integer> t) {
//            return t.
//        }
//    };
}
