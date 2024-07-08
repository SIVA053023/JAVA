package PREDICATE;
import java.util.*;
import java.util.function.Predicate;

class pred{
    public static void main(String[] args) {
       Predicate<Integer> p1=num->num%2==0;
       System.out.println(p1.test(31)); 
    }
}
