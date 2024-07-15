import java.util.*;
class test{
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(89,42,56,23,78,25,43,19,55,22,26,96);
        Long even_num = numbers.stream().filter(num->num%2==0).count();
        System.out.println(even_num);
    }
}