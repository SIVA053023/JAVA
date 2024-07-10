// Lambda = no method name, no return type, no access modifier
@FunctionalInterface
/**
 * Lambda
 */
public interface Lambda {

    public int   add(int a,int b);
}
class ss  {
    public static void main(String[] args) {
        // Lambda l1=()->{System.out.println(login())}
        
        Lambda l1=(a,b)->a+b;
System.out.println(l1.add(2030, 235));
        
    }
}
