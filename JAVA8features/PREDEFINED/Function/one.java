import java.util.*;
import java.util.function.Function;

class Test{
    public static void main(String[] args) {

        ArrayList<String> enames= new ArrayList<String>();
        enames.add("Siva");
        enames.add("Rahul");
        enames.add("Suresh");
        enames.add("Raina");
        Function<ArrayList, Integer> f1=name->name.size();
        System.out.println(f1.apply(enames));
    }
}