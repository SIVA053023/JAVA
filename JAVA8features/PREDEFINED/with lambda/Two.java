import java.util.*;
/**
 * Two
 */
@FunctionalInterface
public interface Two {

    Integer emp(List list);
}
class test{
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("Sonia");
        enames.add("Priyanka");

        Two t1=list->list.size();
        System.out.println(t1.emp(enames));

        List<Integer> eids=new ArrayList<Integer>();
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);

        Two t2=list->list.size();
        System.out.println(t2.emp(eids));
        
    }
}