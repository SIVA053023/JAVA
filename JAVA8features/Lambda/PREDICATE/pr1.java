package PREDICATE;
import java.util.*;             // without lambda
@FunctionalInterface
/**
 * pr1
 */
public interface pr1 {

    public abstract boolean cal(int num);
}
class one implements pr1{

    public  boolean cal(int num){
        return num%2==0;
    }
    public static void main(String[] args) {
        pr1 p= new one();
        System.out.println(p.cal(31));
    }
}
