package hw0327;

//Write a function UniqueCharacters which accepts as input a string S. Given the string S return a string S2
// which contains all the distinct characters in S. The input string will only contain lowercase characters.
// The ordering of characters in the output string does not matter. Eg.
//
//        abbcaabcaa --> abc
//        apple --> aple or aepl
//        microsoft --> microsft

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        CharSequence input = scanner.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char iletter = input.charAt(i);


            boolean shouldAppend = true;
            for (int n = 0; n < output.length(); n++){
                char oletter = output.charAt(n);

                if (iletter == oletter){
                    shouldAppend = false;
                    break;
                }

            }
            if (shouldAppend) {
                output += iletter;
            }
        }

        System.out.println(output);
    }
}
