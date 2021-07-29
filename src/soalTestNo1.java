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

public class soalTestNo1 {
	public static void main(String[] args)
	{
                Scanner input = new Scanner(System.in);
                String konfirmasi;
                
                do
                {
                    System.out.print("Masukkan Bilangan: ");
                    int bilangan = input.nextInt();

                    if((bilangan % 3 == 0) && (bilangan % 5 == 0))
                        System.out.println("Hello World");
                    else if(bilangan % 3 == 0 )
                        System.out.println("Hello");
                    else if(bilangan % 5 == 0)
                        System.out.println("World");
                    else
                        System.out.println("Bilangan bukan kelipatan 3 atau 5");
                    
                    System.out.print("\nApakah ingin lanjut? (y/n)");
                    konfirmasi = input.next();
                    
                }
                while(konfirmasi.equalsIgnoreCase("Y"));
		
                
	}
}
