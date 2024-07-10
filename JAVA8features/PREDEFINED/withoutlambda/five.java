import java.util.*;
@FunctionalInterface
interface test{
   public abstract String emp(String names);

}
class demo implements test{
    public String emp(String names){
        return names.toUpperCase();
    }
    public static void main(String[] args) {
        test t1= new demo();
        System.out.println(t1.emp("sivakrishna"));
        System.out.println(t1.emp("rahul"));
        System.out.println(t1.emp("vishnuvardhan"));
    }
}