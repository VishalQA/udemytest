package javatest.coding;

public class Three_trial5_correct {


public static void main(String[] args) {

    String input = "I am am trying trying trying to learn java java java java ";
    String[] arr1 = input.split(" ");
    int count = 0;

    for (int i = 0; i < arr1.length; i++) {
        count = 0;

        for (int j = 0; j < arr1.length; j++) {
            String temp = arr1[j];
            String temp1 = arr1[i];

            if (j < i && temp.contentEquals(temp1)) {
                break;

            }
            if (temp.contentEquals(temp1)) {
                count = count + 1;

            }

            if (j == arr1.length - 1) {
                System.out.println(">>" + arr1[i] + "<< is present >>" + count + "<< number of times");

            }

        }

    }

}

}