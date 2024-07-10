
import java.util.*;
interface test{
    String emp(String name);
}
class one implements test{
    public String emp (String name){
        return name.toUpperCase();
    }
    public static void main(String[] args) {
        test t= new one();
        System.out.println(t.emp("Sivakrishna"));
    }
}