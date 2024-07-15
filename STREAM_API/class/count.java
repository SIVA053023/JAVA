import java.util.*;
class ct{
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(45,7,8,9,35,26,37,23);
        // here i want to count the how many even numbers are there?
        /* Long no_even= numbers.stream().filter(num->num%2==0).count();
        System.out.println(no_even);*/
        int no_of_evennumbers=0;
        for( int i=0;i<=numbers.get(i);i++){
            if(numbers.get(i)%2==0){
                no_of_evennumbers++;
            }
        }
        System.out.println(no_of_evennumbers);
    }
}