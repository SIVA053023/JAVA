import java.util.Optional;

public class Optionalclass {
    public static void main(String[] args) {
        
        //String s1="rahul";
        String s1=null;
        Optional opt=Optional.ofNullable(null);
        if(opt.isPresent()){
            System.out.println(opt.get().toString().toUpperCase());
        }
        else{
            System.out.println("employee string value null");
        }
    }
}
