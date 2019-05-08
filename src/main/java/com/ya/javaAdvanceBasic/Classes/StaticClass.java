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
/**
 * This is not allowed in java. You can't make an outer class as static
 */
//public static class StaticClass {
//    
//}


public class StaticClass {
    
    public static void main(String[] args) {
        
        // as class B is declared static you can explicitly instantiate as:
        B b = new B();
        System.out.println(""+b.b_age);
        
        //  if class C isn't declared static to make it stand alone, an instance object call would've looked like this:
        StaticClass instance = new StaticClass();
        C c = instance.new C();
        System.out.println(""+c.c_age);
    }
    
    
    // as we can't make outer class static but we can make inner nested class static
    public static class B {
        private int b_age = 90;
    }
    
    public class C {
        private int c_age = 100;
    }
}
