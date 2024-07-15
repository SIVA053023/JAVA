import java.util.*;


public class Al2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
            numbers.add(89);
            numbers.add(32);
            numbers.add(34);
            numbers.add(45);
            numbers.add(98);
            numbers.add(58);
            Long odd_num= numbers.stream().filter(num->num%2!=0).count();  // counting no of odd numbers
            System.out.println(odd_num);
    }
    
}
