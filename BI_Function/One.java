import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

class test{
    public static void main(String[] args) {
        BiFunction<String,String,Integer> obj=(fn,ln)->(fn+ln).length(); 
        System.out.println(obj.apply("rahul", "gandhi"));               // here it gives the lenth of the rahulgandi which is 11

        BiFunction<String,String,String> uppercase=(a,b)->(a+b).toUpperCase();
        System.out.println(uppercase.apply("Siva", "Krishna"));               // output= SIVAKRISHNA

        BiPredicate<String,String> one=(a,b)->a.length()==b.length();
        System.out.println(one.test("Siva", "krishna"));                   // output= false

        Supplier<Integer> two=()->7489;
        System.out.println(two.get());


        Consumer<String> three=(a)->System.out.println("one");
        three.accept("ok");



    }
}