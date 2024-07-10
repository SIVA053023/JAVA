import java.time.Year;
import java.util.*;             // checking wheather year is leap year or not
class test2{
    public static void main(String[] args) {
        
       // int year=Year.now().getValue();
        int year=Year.of(2023).getValue();
        if(year%4==4){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
    }
}