package PREDICATE;
 // user interface with lambda
import java.util.*;
@FunctionalInterface
/**
 * pr
 */
public interface pr {

    public abstract boolean test(int num);
}
class cal {
    public static void main(String[] args) {
        pr p1=num->num%2==0;
        System.out.println(p1.test(31));   // output = false
    
    }
}
