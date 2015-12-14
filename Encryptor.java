/*Team 2
 * Sam Wylock
 * Andrew Tsui
 * Nicholas Meyers
 * */
import java.util.*;

import java.util.Scanner;
public class Encryptor{
  
  public static void main(String args[]){
    String cd="";
    int[] num=new int[4];
    int enc;
    int enc2;
    String digit;
    String encryption="";
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter your 4 digit code");
    int code = input.nextInt();
    System.out.println("The code is "+ code);
    cd=Integer.toString(code);
    for(int i =0; i<cd.length(); i++){
      digit=cd.substring(i,i+1); 
     num[i]=(Integer.parseInt(digit)+7)%10;
     
      System.out.println(num[i]);
    }
    enc=num[0];
    enc2=num[1];
    num[0]=num[2];
    num[1]=num[3];
    num[2]=enc;
    num[3]=enc2;
    
      for(int i =0; i<num.length; i++){
      encryption=encryption+Integer.toString(num[i]);
      }
      
      System.out.println(encryption);
    
  }
  
  
  
  
  
}