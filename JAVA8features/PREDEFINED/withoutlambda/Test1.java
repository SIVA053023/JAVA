
import java.util.*;

/**
 * Test1
 */
@FunctionalInterface
public interface Test1 {

    int num (int a, int b);
}
class Two implements Test1{
    public int num (int a, int b){
        return (a+b);
    }
    public static void main(String[] args) {
        Two b = new Two();
        System.out.println(b.num(25, 30));
    }
}
