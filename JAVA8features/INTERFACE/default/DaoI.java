import java.util.*;
public interface DaoI {
 public void login();
 public void logout();
 public static void  username(String ename){
    System.out.println("user name is rahul");
 };
public  default  void updateprofile(){
 System.out.println("user details updated successfully");
};

    
}




/* if you want upadate or enhance your interface without disturbing the implementation classes functionality
 we go 
 with the default  methods inn interface*/ 