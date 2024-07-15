import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class demo{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(75);
        numbers.add(44);
        numbers.add(89);
        numbers.add(37);
        numbers.add(65);
        numbers.add(102);
        //the below code is for stream api
        // System.out.println(numbers);         //output = [75, 44, 89, 37, 65, 102]
        // Stream st= Stream.of(numbers);
        // List evennumbers=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
        // System.out.println(evennumbers);    // output =[44, 102]

        // now we are printing without stream api or normal way
        // for(Integer  num:numbers){          // for each statement
        //      if(num%2==0){
        //         System.out.println(num);        // output = 44,102
        //      }
        // }

        // with single line code                       left                    right  both sides is same "num" so we can use this syntax "System.out::println" instead of "num->System.out.println(num)"
        numbers.stream().filter(num->num%2==0).forEach(num->System.out.println(num));
    }
}