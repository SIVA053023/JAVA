import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class test{
    public static void main(String[] args) {
        BiFunction<String,String,Integer> obj=(fn,ln)->(fn+ln).length(); 
        System.out.println(obj.apply("rahul", "gandhi"));               // here it gives the lenth of the rahulgandi which is 11

        BiFunction<String,String,String> uppercase=(a,b)->(a+b).toUpperCase();
        System.out.println(uppercase.apply("Siva", "Krishna"));               // output= SIVAKRISHNA

        BiPredicate<String,String> one=(a,b)->a.length()==b.length();
        System.out.println(one.test("Siva", "krishna"));                   // output= false
        

    }
}