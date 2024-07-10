
import java.util.*;            // here we are using the without lambda 
/**
 * Test
 */
@FunctionalInterface
public interface Test {
String enames(String names);
    
}
class One implements Test{
    public  String enames(String names){
        return names.toUpperCase();
    }
    public static void main(String[] args) {
        Test a=new One();
        System.out.println(a.enames("sivakrishna"));
    }
}
