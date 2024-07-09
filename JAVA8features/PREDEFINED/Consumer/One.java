import java.util.*;   // her we are using predefined  interface
import java.util.function.Consumer;
class Test{
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("siva");
        enames.add("rahul");
        enames.add("priyanka");
        Consumer<List> c=names->{
            for(Object name : names){
                System.out.println(name);
            }
        };
        c.accept(enames);
    }
}