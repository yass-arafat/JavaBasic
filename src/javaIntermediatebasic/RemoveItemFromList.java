/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaIntermediatebasic;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * In First 2 test
 * we are putting list's obj in remove method. and it will return ConcurrentModificationException.
 * An explanation for this exception is that the iterator of the ArrayList is a fail-fast iterator. 
 * For example, it will throw an exception (fail) when it detects that its collection in the runtime has been modified.
 * The solution to this problem is to use the Iterator. That's why Test 3 will work as it uses ITERATOR
 * 
 * In Test 4 we are putting list's index in remove method and it will return IndexOutOfBoundsException
 * because removing some obj the array size will become lower but the iteration will go on which causes IndexOutOfBoundsException.
 * to remove by indexes  we have to iterate with descending order
 * @author yassir
 */
public class RemoveItemFromList {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if ((i % 2) == 0) {
                ls.add("*string");
            } else {
                ls.add("string");
            }
        }

        // Test 1 :
        for (String s : ls) {
            if (s.startsWith("*")) {
                ls.remove(s);
            }
        }

        // Test 2 :
        ls.forEach(s -> {
            if (s.startsWith("*")) {
                ls.remove(s);
            }
        });

        // Test 3 :
        ListIterator<String> lis = ls.listIterator();
        while (lis.hasNext()) {
            if (lis.next().startsWith("*")) {
                lis.remove();
            }
        }

        // Test 4 :
        int last = ls.size();
        for (int idx = 0; idx < last; idx++) {
            if (ls.get(idx).startsWith("*")) {
                ls.remove(idx);
            }
        }
        
        // Test 5 :
        int size = ls.size();
        for (int idx = size - 1; idx >= 0 ; idx--) {
            if (ls.get(idx).startsWith("*")) {
                ls.remove(idx);
            }
        }
        
        
        // Questions :
        
        // Which one is correct
        
        ls.forEach((t) -> { System.out.println("t = "+t); });

    }
}
