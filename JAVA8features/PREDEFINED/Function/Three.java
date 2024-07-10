import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
class test{
    public static void main(String[] args) {
        ArrayList<Integer> eids= new ArrayList<Integer>();
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        Function<ArrayList, Integer> fn=list -> list.size()*2; // 8
        System.out.println(fn.apply(eids));
        Predicate<ArrayList> p1=name->name.isEmpty();
        System.out.println(p1.test(eids));                     // false cause eids arraylist is not empty
           
        
    }
}
