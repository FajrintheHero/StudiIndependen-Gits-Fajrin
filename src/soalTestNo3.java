/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Fajrin_Alamsyah
 */
public class soalTestNo3
{
  public static void main(String[]args) {      

    Scanner scan = new Scanner(System.in);
    String time = scan.next();

    String tArr[] = time.split(":");
    String AmPm = tArr[2].substring(2,4);
    int hh,mm,ss;

    hh = Integer.parseInt(tArr[0]);
    mm = Integer.parseInt(tArr[1]);
    ss = Integer.parseInt(tArr[2].substring(0,2));
        
    String checkPM = "PM",checkAM ="AM";
       
    if(AmPm.equals(checkAM) && hh==12)
    {
        hh=0;
    }
    else if(AmPm.equals(checkPM)&& hh<12)
    {
        hh+=12;
    }
        
    System.out.printf("%02d:%02d:%02d\n",hh,mm,ss);

  }
}