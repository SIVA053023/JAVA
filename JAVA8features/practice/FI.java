// what is Functional interface = contains single abstact method
@FunctionalInterface
public interface FI {
    public abstract void login();
    // public abstract void logout(); fi u un comment  it leads to error cause it allows one abstract method

    
}
class exp implements FI{
    public void login(){
        System.out.println("login success");
    }
    public static void main(String[] args) {
    //FI= parent ;exp=child              parent can hold child
        FI e1= new exp();
        e1.login();             // output = login success
    }
}