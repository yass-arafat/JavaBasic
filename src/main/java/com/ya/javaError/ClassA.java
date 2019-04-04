package com.ya.javaError;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yassir Arafat
 */
public class ClassA {
       
        private final static String CLAZZ = ClassA.class.getName();
        // Problem replication switch ON/OFF
        private final static boolean REPLICATE_PROBLEM1 = false; // static variable initializer
        private final static boolean REPLICATE_PROBLEM2 = false; // static block{} initializer
       
        // Static variable executed at Class loading time
        private static String staticVariable = initStaticVariable();
       
        // Static initializer block executed at Class loading time
        static {
              
               // Static block code execution...
               if (REPLICATE_PROBLEM2) throw new IllegalStateException("ClassA.static{}: Internal Error!");
        }
       
        public ClassA() {
               System.out.println("Creating a new instance of "+ClassA.class.getName()+"...");
        }
       
        /**
         *
         * @return
         */
        private static String initStaticVariable() {
              
               String stringData = "";
              
               if (REPLICATE_PROBLEM1) throw new IllegalStateException("ClassA.initStaticVariable(): Internal Error!");
              
               return stringData;
        }
}
