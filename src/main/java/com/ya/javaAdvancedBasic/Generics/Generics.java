/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvancedBasic.Generics;

/**
 * Benefits:
 * 1. Code Reuse: We can write a method/class/interface once and use for any type we want.
 * 2. Type Safety : Generics make errors to appear compile time than at run time (It’s always better to know problems 
 *    in your code at compile time rather than making your code fail at run time). 
 * 3. Individual Type Casting is not needed: If we do not use generics, then every-time 
 *    we retrieve data from ArrayList, we have to typecast it. Typecasting at every retrieval operation is a big headache. 
 *    If we already know that our list only holds string data then we need not to typecast it every time.
 * @author Yassir Arafat
 */
public class Generics {
    /**
     * Some basic keyword stuff to know
     * E, T, K, V = all are called Formal Type
     * Parameter in Generics. Here E = element, T = type, K = Key, V = value.
     */
    public static void main(String[] args) {

//        userDefinedGenericsWithSingleType();
        
//        userDefinedGenericsWithMultipleType();
        
        genericFunction();
    }

    private static void userDefinedGenericsWithSingleType() {
        Test1 <Integer> iObj = new Test1<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        Test1 <String> sObj = new Test1<String>("Generics test Single Type");
        System.out.println(sObj.getObject());
    }

    private static void userDefinedGenericsWithMultipleType() {
        Test2 <String, Integer> obj =
            new Test2<String, Integer>("Generics Test Multiple Type", 15);
 
        obj.print();
    }

    private static void genericFunction() {
        // Calling generic method with Integer argument
        genericDisplay(11);
  
        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");
  
        // Calling generic method with double argument
        genericDisplay(1.0);
    }
    
    static <T> void genericDisplay (T element)
    {
        System.out.println(element.getClass().getName() +
                           " = " + element);
    }
}

class Test1<T> {
    // An object of type T is declared

    T obj;

    Test1(T obj) {
        this.obj = obj;
    }  // constructor

    public T getObject() {
        return this.obj;
    }
}

class Test2<T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U
 
    // constructor
    Test2(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
 
    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
 
