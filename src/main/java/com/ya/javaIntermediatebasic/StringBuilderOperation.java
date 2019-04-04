/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaIntermediatebasic;

/**
 *
 * @author Yassir Arafat
 */
public class StringBuilderOperation {
    public static void main(String[] args) {
        String s = "PDF_test.PDF";
        StringBuilder sb = new StringBuilder(s);
        
        System.out.println("index = "+sb.indexOf(".PDF"));
        System.out.println("index = "+sb.length());
        String fileName = sb.replace(sb.indexOf(".PDF"), sb.length(), ".pdf").toString();
        System.out.println("FileName = "+fileName);
        
    }
}
