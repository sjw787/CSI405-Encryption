/*Team 2 
 * 06/24/2015
 * Sam Wylock
 * Andrew Tsui
 * Nicholas Meyers
 * This Program is used to encrypt and decrypt a given
 * 4 digit integer that is given by the user.
 */
public class Encryption{ 
  
    String cd="";         //Variable declarations
    int[] num=new int[4];
    int enc, enc2, dec, dec2;
    String digit;
    String encryption="";
    String decryption="";
  
  public String encrypt(int code){   
    cd=Integer.toString(code);             //This chunk of code 
    for(int i =0; i<cd.length(); i++){     //will encrypt the numbers
      digit=cd.substring(i,i+1);           //that were given
     num[i]=(Integer.parseInt(digit)+7)%10;
    }
    
    enc=num[0];      //This chunk of code reorders
    enc2=num[1];     //the numbers
    num[0]=num[2];
    num[1]=num[3];
    num[2]=enc;
    num[3]=enc2;
    
    for(int i =0; i<num.length; i++){      // This turns the returned number into a string
      encryption=encryption+Integer.toString(num[i]); 
    }
      
      return encryption;
  }
  
  public String decrypt(int code){ // This method will decrypt the given code
    
    cd=Integer.toString(code);
    for(int i =0; i < cd.length(); i++){   // This chunk of code decrypts the numbers
      digit=cd.substring(i,i+1);          // that were given
     num[i]=(Integer.parseInt(digit)); 
    }
    //This chunk of code puts the decrypted
    //numbers back in the right order
    dec=num[0];
    dec2=num[1];
    num[0]=num[2];
    num[1]=num[3];
    num[2]=dec;
    num[3]=dec2;
    
    for(int i =0; i< (num.length); i++){    // This chunk of code will 
     num[i]=(num[i]+10)-7;                  //turn the code into a String for returning
      decryption=decryption+Integer.toString(num[i]);
    }
    decryption = decryption.substring(0, Math.min(decryption.length(), 4));
    return decryption;
  }
    
}
