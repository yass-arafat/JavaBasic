/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaIntermediatebasic;

/**
 * 1. will give compilation error. java compiler thinks it's an int . we have to append 'l' or 'L' after the number
 * ans. long i1 = 1234567890123456789l/L;
 * 
 * 2. first two assignment will work. no compilation error
 * but the last one will give CE because the arithmetic expression on the right-hand side of the assignment operator 
 * evaluates to int by default. Compiler won't implicitly convert int to short. you have to do it explicitly
 * ans. s3 = (short)(s1 + s2);
 * 
 * 3. In Java, when you type a decimal number as 3.6, its interpreted as a double.
 * and again we have to explicit it to float
 * ans. float pi = (float)3.14;
 * 
 * 4. is okay. as short takes 2 byte as 2^16 = 6536
 * 
 * @author yassir
 */
public class Type {
    
    public static void main(String[] args) {
        
        //1.
//        long i1 = 1234567890123456789;
            
        // 2.
//        short s1 = 99, s2 = 100, s3 = (s1 + s2);
        
        //3.
//        float pi = 3.14;

        //4.
        short s = 199;

    }
    
    // Questions.
    // 1 3 are correct but 2 4 gives compilation error
    // and so forth
    
}
