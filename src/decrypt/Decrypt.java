/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decrypt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Decrypt {
	
	private static String conversionTable[][] = {
			{"a", "0"},
			{"b", "1"},
			{"c", "2"},
			{"d", "3"},
			{"e", "4"},
			{"f", "5"},
			{"g", "6"},
			{"h", "7"},
			{"i", "8"},
			{"j", "9"},
	};
   
  
    
	public static double decrypt(String encryptedNumber) {
		///{
		//write your code here
		//start
            for (int i = 0; i < conversionTable.length; i++)
                encryptedNumber = encryptedNumber.replace(conversionTable[i][0],conversionTable[i][1]);
            
            return Double.parseDouble(encryptedNumber);
 

		//end
		///} 		
	}
    
   
	
	public static void main(String arg[]){
	
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the string to decrypt:");
	String input=scanner.next();
	System.out.println("Number after decryption is:"+decrypt(input));
    
  
	}
	

    

}
