/*                                                TASK
 * Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
Explanation

Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
 */

import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("======================================");

        while(s1.hasNext()){
            String s=s1.next();
            int i=s1.nextInt();

            System.out.printf("%-15s%03d%n",s,i);
            
        }
        s1.close();
    
        System.out.println("======================================");
    }
    
}
