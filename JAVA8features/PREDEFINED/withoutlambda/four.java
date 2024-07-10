import java.util.*;
@FunctionalInterface
interface demo{
    boolean enames(List list);

}
class test implements demo{
    public boolean enames(List list){
        
        return list.isEmpty();
        
    }
    public static void main(String[] args) {
        List<String> names= new ArrayList<String>();
        names.add("siva");
        names.add("krishna");
        names.add("rahul");
        demo d= new test();
        System.out.println(d.enames(names));
        System.out.println();
        System.out.println(names);
    }
}