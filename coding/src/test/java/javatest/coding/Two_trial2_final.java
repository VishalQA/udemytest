package javatest.coding;

import java.util.*;
public class  Two_trial2_final {

  public static void main(String args[])
  {
    String input = "aaabaccaa";      
    if (input.length() <= 1) 
    {
        System.out.println("Not Palindrome Found.");
    }
    else
    {   
        int length = input.length();            
        Set<String> set = new HashSet<String>();
        for (int i = 0; i <length; i++)
        {
            //if(i==0)
            for (int j=i+1;j<length+1;j++) 
            {
                String s = input.substring(i, j);                   
                StringBuffer sb = new StringBuffer(s);
                sb.reverse();

                if(s.equals(sb.toString()) && s.length()>1)
                {                       
                    set.add(s);
                }
            }
        }           
        System.out.println(set);
    }
  }
}