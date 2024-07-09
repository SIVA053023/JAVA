import java.util.*;
import java.util.function.Function;
class Test4{
    public static void main(String[] args) {
        Function<String,String> f=name->name.toUpperCase();
        System.out.println(f.apply("rahul"));
    }
}
