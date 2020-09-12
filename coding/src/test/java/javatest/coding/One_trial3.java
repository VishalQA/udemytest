package javatest.coding;

public class One_trial3 {
public static void main(String[] args) {
String a = "ank1tr23cbdf456try7890ts";
long sum = 0;
long evenSum = 0;
for (char c : a.replaceAll("\\D", "").toCharArray()) {
    long digit = c - '0';
    sum += digit;
    if (digit % 2 == 0) {
        evenSum += digit;
    }
}
System.out.println(sum);
System.out.println(evenSum);

}
}