/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Fajrin_Alamsyah
 */
public class soalTestNo2 {
    
    private static final String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ei;
        
        System.out.print("Masukkan email: ");
        ei = input.next();
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ei);
        
        System.out.println("Email " + ei + " = " + (matcher.matches() ? "valid" : "invalid"));
    }
    
}
