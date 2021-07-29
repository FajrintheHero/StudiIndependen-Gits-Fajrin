
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
public class soalTestNo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String si;
        
        System.out.print("Masukkan kata/kalimat: ");
        si = input.nextLine();
        
        System.out.println(reverseString(si));
    }
    
    public static String reverseString(String str) {  
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        return sb.toString();  
    }  
}
