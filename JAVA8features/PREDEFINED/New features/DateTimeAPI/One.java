import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.*;
class test{
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalTime time= LocalTime.now();
        LocalDateTime DT= LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(DT);
        LocalDate d= LocalDate.of(2000, 10, 24);
        System.out.println(d);
        System.out.println(Month.of(10));
        LocalDate ld= LocalDate.of(2000, 10, 24);
        LocalDate nd=LocalDate.now();
        Period p=Period.between(ld, nd);
        System.out.println(p);
        System.out.println("no.of years"+p.getYears()+"no.of months"+p.getMonths()+"no of days"+p.getDays());
                
    }
}