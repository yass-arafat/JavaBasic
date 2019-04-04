/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvancedBasic.MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Yassir Arafat
 */

public class ParticularInstanceMethodReference {
    public static void main(String args[]) {
        final List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final MyComparator myComparator = new MyComparator();

        // Method reference
        Collections.sort(list1, myComparator::compare);
        System.out.println("list = "+list1);
        
        final List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final MyComparator myComparator2 = new MyComparator(){
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        Collections.sort(list1, myComparator::compare);
        System.out.println("list2 = "+list2);
        
        // Lambda expression
        Collections.sort(list1, (a,b) -> myComparator.compare(a,b));
    }
    private static class MyComparator {
        public int compare(final Integer a, final Integer b) {
            return a.compareTo(b);
        }
    }
}
