import java.util.*;
@FunctionalInterface
/**
 * Lambda
 */
 interface Ex {
    //   input type=IT            RT
    public abstract int SquareIt(int num);

    
}
class mp{
    public static void main(String[] args) {
        Ex e=num->num*num;                    // with lambda, using USER interface                 
        // Ex e=(num)->{
        //     return" num*num";
        // }
        System.out.println(e.SquareIt(10));
    }
}