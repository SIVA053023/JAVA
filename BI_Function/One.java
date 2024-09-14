import java.util.*;
import java.util.function.BiFunction;

class test{
    public static void main(String[] args) {
        BiFunction<String,String,Integer> obj=(fn,ln)->(fn+ln).length(); 
        System.out.println(obj.apply("rahul", "gandhi"));               // here it gives the lenth of the rahulgandi which is 11
    }
}