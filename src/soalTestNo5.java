/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Fajrin_Alamsyah
 */
public class soalTestNo5 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String si;
        
        System.out.print("Masukkan kata: ");
        si = input.next();
        
        System.out.println(isPalindrome(si));
    }
    
    public static boolean isPalindrome(String str){  
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        String rev=sb.toString();  
        if(str.equals(rev))
        {  
            return true;  
        }
        else
        {
            return false;  
        }  
    }  
}
