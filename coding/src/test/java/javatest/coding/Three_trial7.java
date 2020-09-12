package javatest.coding;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class Three_trial7 {

	// Function to validate the sentence 
    // and remove the duplicate words 
    public static String 
    removeDuplicateWords(String input) 
    { 
  
        // Regex to matching repeated words. 
        String regex 
            = "\\b(\\w+)(?:\\W+\\1\\b)+"; 
        Pattern p 
            = Pattern.compile( 
                regex, 
                Pattern.CASE_INSENSITIVE); 
  
        // Pattern class contains matcher() method 
        // to find matching between given sentence 
        // and regular expression. 
        Matcher m = p.matcher(input); 
  
        // Check for subsequences of input 
        // that match the compiled pattern 
        while (m.find()) { 
            input 
                = input.replaceAll( 
                    m.group(), 
                    m.group(1)); 
        } 
        return input; 
    } 
public static void main(String[] args) {

    String input = "I am am trying trying trying to learn java java java java ";
    String[] arr1 = input.split(" ");
    int count;
   

    for (int i = 0; i < arr1.length; i++) {
        count = 1;

        for (int j = 1+i; j < arr1.length; j++) {
//            String temp = arr1[j];
//            String temp1 = arr1[i];
        	  if(arr1[i].equals(arr1[j])) {  
                  count++;  
                  
                  //Set words[j] to 0 to avoid printing visited word 
	                
                  System.out.println(arr1[j]);
              
              
                  arr1[j] = "0";  
//            if (j < i && temp.contentEquals(temp1)) {
//                break;
//
//            }
//            if (temp.contentEquals(temp1)) {
//                count = count + 1;
//
//            }
//
//            if (j == arr1.length - 1) {
//                System.out.println(">>" + arr1[i] + "<< is present >>" + count + "<< number of times");
//
//            }

        }

    }
        //Displays the duplicate word if count is greater than 1 
        
        if(count > 1 && arr1[i] != "0")  
            System.out.println(arr1[i]);
        System.out.println(">>" + arr1[i] + "<< is present >>" + count + "<< number of times");
    // Test Case: 1 
    

}
    System.out.println( 
            removeDuplicateWords(input)); 
}

}