package hw0327;

/**
 * Created by c4q-raynaldie on 3/23/15.
 */


import java.util.Scanner;

/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {

    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encode");

        String input = sc.nextLine();
        String encoded = CaesarCipher.encode(input, 2);
        System.out.println(encoded);

        String input2 = sc.nextLine();
        String encoded2 = CaesarCipher.encode(input2, 5);
        System.out.println(encoded2);
       // String decoded = CaesarCipher.decode(encoded, 25);
        //System.out.println(decoded);
        System.out.println(codeBreaker(encoded,encoded2));
    }


    public static boolean codeBreaker(String one, String two){
        String decoded = decode(one, 2);
        String decoded2 = decode(two, 5);
        if (decoded.equalsIgnoreCase(decoded2)){
            return true;

        }
         return false;

        }
    }
