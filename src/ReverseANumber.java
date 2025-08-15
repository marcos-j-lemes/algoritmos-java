
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

/* This challenge is very simple for me, I used of structure for make all in challenge
 *  But, I can implement to resolute used same structure with loops and array, but I chose use
 *  structure more complex.
 *
 *  This challenge I give an integer, and I have inverted this number.
 */

public class ReverseANumber {

    public static int reverseANumber( int x){
        String numberForString = x + "";
        List<String> numberWithReversed = Arrays.asList(numberForString.split(""));
        Collections.reverse(numberWithReversed);

        String number = "";
        for(String s : numberWithReversed){
            number +=  s;
        }
        System.out.println("Number: " + x);
        return Integer.parseInt(number);
    }

    public static void main(String[] args) {
    System.out.println("Reversed number: " + reverseANumber(1211));
    }
}
