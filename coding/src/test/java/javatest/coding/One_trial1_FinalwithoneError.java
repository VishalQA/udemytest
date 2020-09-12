package javatest.coding;

public class One_trial1_FinalwithoneError {

public static void main(String[] args) {
int sum=0;
String s = "ank1tr23cbdf456try7890ts";
for(int i=0; i<s.length(); i++) {
    char temp = s.charAt(i);

    if (Character.isDigit(temp)) {
    	
        int b = Integer.parseInt(String.valueOf(temp));

      sum=sum+b;
    }
}
System.out.println(sum);
}
}