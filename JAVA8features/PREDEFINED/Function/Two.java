import java.util.*;
import java.util.function.Function;

class Test{
    public static void main(String[] args) {

    Function<String ,String> fn= str->str.toUpperCase();
    System.out.println(fn.apply("The main reason for the brilliance of diamond"));
    System.out.println(fn.apply("NOTE: updating skills is mandatory in software industry"));
    }
}