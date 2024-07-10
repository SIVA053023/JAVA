import java.util.*;
import java.util.function.Predicate;
class Test{
    public static void main(String[] args) {
        Predicate<String> p= name->name.equals("Siva");
        System.out.println(p.test("Siva"));
    }
}