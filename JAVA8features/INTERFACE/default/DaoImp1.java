public class DaoImp1 implements DaoI{
    public void login(){
           
        System.out.println("logged in successfully");
    }
    public void logout(){
        System.out.println("you logged out");
    }
    public static void main(String[] args) {
        DaoImp1 a1=new DaoImp1();
        a1.login();
        a1.logout();
        a1.updateprofile();
        DaoI.username("your name is rahul");

        

    }
    
}
