/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaIntermediatebasic.inheritence;

/**
 *
 * @author Yassir Arafat
 */
public class Draw implements ICircle, ISquare{
    public static void main(String[] args) {
        ICircle circle = new Draw();
        circle.draw();
        
        ISquare square = new Draw();
        square.draw();
    }

    @Override
    public void draw() {
        System.out.println("///////////");
    }
}
