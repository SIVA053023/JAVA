// Lambda = no method name, no return type, no access modifier
@FunctionalInterface
/**
 * Lambda
 */
public interface Lambda {

    public abstract void login();
}
class ss {
    public static void main(String[] args) {
        Lambda l1=()->{System.out.println(login())}
    }
}
