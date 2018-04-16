/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForcesPB;

import java.util.Scanner;

/**
 *
 * @author yassir
 */
public class WaterMelonCf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        
        if((weight %2) != 0 || weight == 2 )
            System.out.println("NO");
        else 
            System.out.println("YES");
    }
    
}
