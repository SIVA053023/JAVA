import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
class test{
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);
        List evennumbers=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println(evennumbers);

        
    }
}