public class DaoImp2 implements DaoI {
    public void login (){

 System.out.println("Welcome jio team ");
    }
    public void logout(){
               System.out.println("you are out from the ");
    }
    public static void main(String[] args) {
        DaoImp2 d= new DaoImp2();
        d.login();
        d.logout();
        d.updateprofile();
        DaoI.username("user name is shiva");
        DaoI.username("your name is rahul");

    }
}
