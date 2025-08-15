import java.util.Collections;
import java.util.List;
import java.util.Arrays;

/*
*  My goal with challenge for me is improved mys skills with algorithms in Java
* Build a foundation solid in structure of data in java
*
*  This challenge is verify is word is palindrome, I make simple code for verify this.
*  I used list and collections because have methods more import for this verify;
*  I can build this challenge the format more simple with arrays and loops, I prefer used this structure of data;
*
* */

public class StringIsPalindromo {

    public static void isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]", "");

        String[] wordNotReverse= s.split("");
        List<String> wordWithReverse = Arrays.asList(s.split(""));
        Collections.reverse(wordWithReverse);

        if (Arrays.equals(wordNotReverse, wordWithReverse.toArray())) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        isPalindrome("Java");
    }
}
