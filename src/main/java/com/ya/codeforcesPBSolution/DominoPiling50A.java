/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.codeforcesPBSolution;

import static java.lang.Double.max;
import java.util.Scanner;

/**
 *
 * @author Yassir Arafat
 */
public class DominoPiling50A {
    public static void main(String[] args) {
        
        Integer maNumberOfDominos, M, N;
        
        Scanner in = new Scanner(System.in);
        
        M = in.nextInt();
        N = in.nextInt();
        
        maNumberOfDominos = (M/2*N/1) +(M%2 * N/2);
        
        System.out.println(""+maNumberOfDominos);
    }
}
