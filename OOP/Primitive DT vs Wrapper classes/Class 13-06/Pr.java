/*public class Siva {
    int a=100;             // instance variable
    public static void main(String[] args) {
        Unboxing u1=new Unboxing();           // for to execute the instance variable we need create a object in main method with class name
        System.out.println(u1.a);
    }
} */
class Test{
    int acc_id;
    String acc_name;

    Test(int id, String name){
        this.acc_id=id;
        this.acc_name=name;
    }
    public static void main(String[] args) {
        Test u1=new Test(101,"Rahul");
            System.out.println(u1);                     // Doubt about to get total as it is with the object ref
        
      

    }
        
    
}
