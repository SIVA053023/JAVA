@FunctionalInterface
public interface Ex {

    public String login();
}
/**
 s mp
 */
class mp {
    public static void main(String[] args) {
        Ex e= ()->{
            return "logged in successfully";
        };
        System.out.println(e.login());
        
    }

    
}
