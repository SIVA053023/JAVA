import java.util.*;
/**
 * withoutlam
 */
@FunctionalInterface

public interface withoutlam {

    String add(String String);
}
 class One implements withoutlam{
  
    public String add(String String){
          return String.toUpperCase();
    }
    public static void main(String[] args) {
        withoutlam s=new One();
        System.out.println(s.add("rahul")); 
    }
}
