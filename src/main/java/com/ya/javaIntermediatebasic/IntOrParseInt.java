/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaIntermediatebasic;

import java.util.ArrayList;
import java.util.List;

/**
 * Answer is hidden
 * Hint any integer leading 0 is octal number ;)
 * @author yassir
 */
public final class IntOrParseInt
{
    public static void main( String args[] )
    {
        int a = 012; // line n1
        int b = 12;
        int c = Integer.parseInt("012", 10);
        
        // Which one is true
        // 1. a == b
        // 2. b == c
        // 3. a == c
        // 4. Line n1 causes a compilation error
        
        System.out.println(""+(a==b));
        System.out.println(""+(b==c));
        System.out.println(""+(a==c));
        System.out.println(""+a);
        System.out.println(""+b);
        System.out.println(""+c);
        
    }
}