import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
public class one{
    public static void main(String[] args) {
         ArrayList<String> enames= new ArrayList<String>();
         enames.add("siva");
         enames.add("rahul");
         enames.add("priyanka");
         ArrayList<Integer> eids=new ArrayList<Integer>();
         eids.add(101);
         eids.add(102);
         eids.add(103);
         eids.add(104);
         Predicate<List> p2=list->list.isEmpty();
        Predicate<List> p= kumar->kumar.isEmpty();
        Function<List,Integer> f=siva->siva.size();
        String str="Sivakrisha053";
        System.out.println(p2.test(eids));           // false
        System.out.println(p.test(enames));         //  false
        System.out.println(f.apply(enames));        // 3
        System.out.println(eids);                  //[101, 102, 103, 104]
        System.out.println(eids.indexOf(102)); // 1
        System.out.println(eids.add(105));     //  true cause 105 addded to the array eids
        System.out.println(eids);               // [101, 102, 103, 104, 105]
        System.out.println(eids.get(1));  // 102
        System.out.println(str.lastIndexOf("i"));
        System.out.println(str.indexOf("i"));

    }
}
