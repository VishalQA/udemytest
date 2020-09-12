package completed;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Three_RemoveDuplicateWords {    
	

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
        String string = "I am am trying trying trying to learn java java java java ";    
        int count;    
            
        //Converts the string into lowercase    
        string = string.toLowerCase();    
            
        //Split the string into words using built-in function    
        String words[] = string.split(" ");    
            
        System.out.println("Duplicate words in a given string : ");   
        
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            
            for(int j = i+1; j < words.length; j++) {    
            	
                if(words[i].equals(words[j])) {    
                	 
                    count++;    
                   
                    //Set words[j] to 0 to avoid printing visited word   
                    
                    words[j] = "0";    
                  
                }    
             
            }    
            
            //Displays the duplicate word if count is greater than 1  
            
            if(count > 1 && words[i] != "0")  
            	System.out.println(">>" + words[i] + "<< is present >>" + count + "<< number of times");
//                System.out.println(words[i]);    
//           
        }    
        System.out.println( 
                removeDuplicateWords(string)); 
    }    
} 