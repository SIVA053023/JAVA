import java.util.*;
@FunctionalInterface                 // without using the lambda expresssion
/**
 * CalcI
 */
 interface Cal {

    public abstract int SquareIt(int num);
}
class calimp implements Cal{
    public int SquareIt(int num){
        return num*num;
        
    }
    public static void main(String[] args) {
        Cal ci=new calimp();                      // without lambda expression
        System.out.println(ci.SquareIt(25));
    }
}