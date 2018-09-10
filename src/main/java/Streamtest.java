
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yassir Arafat
 */
public class Streamtest {
    public static void main(String[] args) {
        String s = "askasdjbka";
        char[] c = s.toCharArray();
        for(int i = s.length() - 1; i >=0 ; i-- ){
            System.out.println(""+c[i]);
        }
        
        StringBuilder input = new StringBuilder();
        input.append(s);
        input = input.reverse();
        System.out.println(""+input);
        
        boolean[] char_set = new boolean[256];
        
        for(int i = 0; i < s.length(); i++){
            int val = s.charAt(i);
            if(char_set[val] == false)
            char_set[val] = true;
            else{
                System.out.println("Mismatch");
                break;
            }
        }
        
        int checker = 0;
        for (int i = 0; i < s.length(); ++i) {
            int val = s.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                System.out.println("Mismatch");
                break;
            }
            checker |= (1 << val);
        }
    
    }
}
