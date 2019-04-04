/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvancedBasic.MethodReference;

import java.util.function.Function;

/**
 *
 * @author Yassir Arafat
 */
public class MethodReference {

    /**
     * Basic stuff : You use lambda expressions to create anonymous methods.
     * Sometimes, however, 'A lambda expression does nothing but call an existing
     * method.' In those cases, it's often clearer to refer to the existing
     * method by name. Method references enable you to do this; they are
     * compact, easy-to-read lambda expressions for methods that already have a
     * name. 
     * SHOJA KOtha ekta method e jodi single body statement thake jetate lamda expression use kora jabe sekhane 
     * Method reference use kora jabe
     */
//    interface IMethodReference{
        static Integer sayHello(Integer i){
            System.out.println("Method reference executed");
            return i + 100;
        };
//    }
    
    public static Integer add(Integer x) {
        return x - 1;
    }

    public static String concat(String x) {
        return x + 1;
    }

    // normal way
    Function<Integer, Integer> add0 = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer x) {
            return x + 1;
        }
    };
    
    
    // Lamda Expression Way
    static Function<Integer, Integer> add1 = x -> x + 1;
    Function<String, String> concat1 = x -> x +1;
    
    
    // With Method reference
    // jehetu add ekta method etake method reference diye dhorar jonno receiver o ekta method hote hobe.
    // ekhane Function ta sei kaj e kore
    
    static Function<Integer, Integer> add2 = MethodReference::add;
    Function<String, String> concat2 =  MethodReference::concat;
    
    public static void main(String[] args) {
        
        print(x -> x +1);
        print(MethodReference :: sayHello);
        
        System.out.println("add1 = "+add2.apply(10));
    }
    
    private static void print(Function<Integer,Integer> sayHelloMethodsReference){
        System.out.println("printing = "+sayHelloMethodsReference.apply(100));
    }
    
}
