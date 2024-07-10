import java.util.*;
@FunctionalInterface
interface demo{
    int add(int id);
}
class test{
    public static void main(String[] args) {
        demo d1=id->(id*2);
        System.out.println(d1.add(105));
    }
}

