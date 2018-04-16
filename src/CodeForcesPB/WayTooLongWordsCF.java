/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForcesPB;

import java.util.*;

/**
 *
 * @author yassir
 */
public class WayTooLongWordsCF {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numberOfWord = in.nextInt();
        
        Integer l;
        
        for (int i = 0; i < numberOfWord; i++) {
            
            String s = in.next();
            
            int length = s.length();
            
            if(length < 11) {
                
                System.out.println(""+s);
                
                continue;
            }
            
            l = length - 2;
            
            System.out.println(""+s.charAt(0) + ""+l.toString() + ""+s.charAt(length - 1));
        }
    }
    
}
