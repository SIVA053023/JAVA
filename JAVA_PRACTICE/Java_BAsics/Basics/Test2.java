public class Test2 {  
    public static void m1(){                           // static methods we call directly
         System.out.println("this is m1 method");   
    }
    public void m2 (){                                   // thi sis non static method, so if we want to implement that we need to create a new object for that
        System.out.println("this is m2 method");
    }
    public static void main(String[] args) {

        Test2 a1=new Test2();         // creating a new for to implement the m2
        a1.m2();
        m1();          // calling static method directly
        System.out.println("hello world");
    }
    
}
