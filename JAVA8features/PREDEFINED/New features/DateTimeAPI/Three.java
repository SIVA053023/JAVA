import java.time.Year;
import java.util.*;                     // here we are checking by .is leap()
class demo{  
    public static void main(String[] args) {
        System.out.println(Year.now().isLeap());         // true
        System.out.println(Year.of(2023).isLeap()); // false
        Year year = Year.of(1982);
        if(year.isLeap()){
            System.out.println("yes its a leap year");
        }
        else{
            System.out.println("no its not a leap year");
        }
    }
}