import java.util.*;
/**
 * withlam
 */
@FunctionalInterface
public interface withlam {

    public abstract String add(String String);
}
class Two {
    public static void main(String[] args) {
        withlam s= add->add.toUpperCase();
        System.out.println(s.add("rahul"));
    }
}