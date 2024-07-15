import java.util.*;
import java.util.function.Supplier;
class test{
    public static void main(String[] args) {
        Supplier<Double> a1=()->Math.sin(10);
        System.out.println(a1.get());
    }
}