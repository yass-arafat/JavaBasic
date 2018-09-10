/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvancedBasic.Generics;

import static com.sun.javafx.util.Utils.sum;
import java.util.Arrays;
import java.util.List;

/**
 * Note: You can specify an upper bound for a wildcard, or you can specify a lower bound, but you cannot specify both.
 * @author Yassir Arafat
 */
public class Wildcards {
    
    public static void main(String[] args) {
        
        upperBoundedWildcards();
        
        lowerBoundedWilcards();
        
        unBoundedWildcards();
    }
    
    /**
     * Upper Bounded Wildcards : These wildcards can be used when you want to relax the restrictions on a variable.
     * you want to write a method that works on List < integer >, List < double >, and List < number > , you can do this  
     * using an upper bounded wildcard.
     */
    private static void upperBoundedWildcards() {
        List<Integer> list1= Arrays.asList(4,5,6,7);
         
        //printing the sum of elements in list
        System.out.println("Total sum is:"+sum(list1));
 
        //Double list
        List<Double> list2=Arrays.asList(4.1,5.1,6.1);
         
        //printing the sum of elements in list
        System.out.print("Total sum is:"+sum(list2));
    }
    
    /**
     * Both of them are being passed to method sum which has a wildcard that extends Number. 
     * This means that list being passed can be of any field or subclass of that field. 
     * Here, Integer and Double are subclasses of class Number
     * @param list
     * @return 
     */
    private static double sum(List<? extends Number> list){ // this won't work (List<Number> list) and this is the benefits of using WILCARDS
        double sum = 0.0;
        for (Number i: list)
        {
            sum+=i.doubleValue();
        }
 
        return sum;
    }

    /**
     * It is expressed using the wildcard character (‘?’), 
     * followed by the super keyword, followed by its lower bound: <? super A>.
     */
    private static void lowerBoundedWilcards() {
        //Lower Bounded Integer List
        List<Integer> list1= Arrays.asList(4,5,6,7);
         
        //Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);
 
        //Number list
        List<Number> list2= Arrays.asList(4,5,6,7);
         
        //Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }
    
    /**
     * Here arguments can be Integer or superclass of Integer(which is Number). 
     * The method printOnlyIntegerClassorSuperClass will only take Integer or 
     * its superclass objects. However if we pass list of type Double then 
     * we will get compilation error. It is because only the Integer field or 
     * its superclass can be passed . Double is not the superclass of Integer.
     * @param list 
     */
    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
    {
        System.out.println(list);
    }
    
    /**
     * When the code is using methods in the generic class that don’t depend on the type parameter
     * 
     */
    private static void unBoundedWildcards() {
        //Integer List
        List<Integer> list1= Arrays.asList(1,2,3);
 
        //Double list
        List<Double> list2=Arrays.asList(1.1,2.2,3.3);
 
        printlist(list1);
 
        printlist(list2);
    }
    
    /**
     * This is similar to parameter receive process (List list)
     * @param list 
     */
    private static void printlist(List<?> list){ // it's called taking unknown type parameter
        System.out.println(list);
        
        // here the fact is about generics is that although this (List<?> list) is taking unknown type parameter means you can send any 
        // type as a parameter but but you can't add any strict type value in this list
        // like list.add(1) or something like that. It will give compilation error. 
        // Since we don't know what the element type of `list` stands for, we cannot add objects to it.
        // we are restricting it using generics.
    }
}
