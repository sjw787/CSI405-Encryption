/* Team 2 
 * 06/24/2015
 * Sam Wylock
 * Andrew Tsui
 * Nicholas Meyers
 * This Program is used to test the Encryption class and its methods. 
 * To use this program, make sure you have the Encryption class, then run this class.
 * Then a prompt will appear, asking you what you would like to do.
 */
import java.util.Scanner;

public class EncryptionTest{
  
  public static void main(String args[]){
    
    /* The piece of code below is used to 
     * declare variables and assign them 
     * values based on user input
    */
    int flag, code;                          
    Scanner input = new Scanner(System.in);
    Encryption encr = new Encryption();
    System.out.println("Enter 1 to encrypt code\nEnter 2 to decrypt some code\nEnter any other number to exit program");
    flag = input.nextInt();
    System.out.println("Please enter your 4 digit code");
    
    /* This chunk of code is used to determine
     * if the user is encrypting or decrypting code
     */
      switch(flag){
        case 1:
          code = input.nextInt();
          System.out.println("The encrypted code is "+ encr.encrypt(code)); 
          break;
        case 2:
          code = input.nextInt();
          System.out.println("The decrypted code is "+ encr.decrypt(code));
          break;
        default:
          System.exit(0); //Program terminates if this case is reached
          break;
      }
  }
}
  
  