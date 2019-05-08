/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yassir Arafat
 */
public class Factorial {

    public static void main(String[] args) {

        Factorial fact = new Factorial();
        
        System.out.println("Factorial = "+fact.factorial(5));
    }
    
    int factorial(int number){
         if(number == 1){
             return 1;
         }
          return number * factorial(number - 1);
    }
}
