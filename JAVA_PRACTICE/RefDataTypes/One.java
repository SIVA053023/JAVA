import java.lang.reflect.Array;
import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[] ram_size={48,56,12,32};
        String[] enames={"rahul","priyanka","sonia"};
        System.out.println(enames);                      // output:- we get the hexa decimal value
      System.out.println(ram_size[0]);                   // output:- 48
      System.out.println(Arrays.toString(ram_size));     // output:- [48, 56, 12, 32]
        // System.out.println(ram_size);
        for(String name:enames){
            System.out.println(name);                  // output:- rahul priyanka  sonia
            
        }
    }
}
