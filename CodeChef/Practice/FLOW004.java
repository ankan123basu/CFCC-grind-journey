package CodeChef.Practice;

// First and Last Digit

// https://www.codechef.com/problems/FLOW004

import java.lang.*;
import java.util.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int N = sc.nextInt(); 
            
            int ld = N % 10;

            int fd = N;
            while (fd >= 10) {
                fd /= 10;
            }

            int sum = fd + ld; 
            System.out.println(sum);
        }
    }
}

/*   or

 String number = sc.next(); // Read number as string

            char firstChar = number.charAt(0); // First digit as character
            char lastChar = number.charAt(number.length() - 1); // Last digit as character

            int firstDigit = Character.getNumericValue(firstChar); // Convert to int
            int lastDigit = Character.getNumericValue(lastChar);   // Convert to int

            int sum = firstDigit + lastDigit;
            System.out.println(sum);
 */

