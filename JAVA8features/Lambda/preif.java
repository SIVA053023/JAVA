import java.util.*;
import java.util.function.Function;
// @FunctionalInterface
/**
 * preif
 */
/**
 * preif
 */
 class cal {
public static void main(String[] args) {
    Function<Integer,Integer> ci=num->num*num;         // with lambda , predefined interface
    System.out.println(ci.apply(10));    // output=100
}
    
}