/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaAdvancedBasic.UnitTest;

/**
 *
 * @author Yassir Arafat
 */
public class JUnitTestExample {

    static int a, b;

    public JUnitTestExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int add() {
        return a + b;
    }
}
