package pack2;
import pack1.One;
import pack1.Demo;
class Siva{
    public void m2(){
        System.out.println("this is a pack 2");  // this is a non static method, for this we need to create a object to execute this n main method
    }
    static void  m8(){
        System.out.println("this is a static method");
    };

    public static void main(String [] args){

       
        One a1=new One();
        a1.m1();
        Demo d1=new Demo();
        d1.m3();
        Siva s1=new Siva();
        s1.m2();
        m8();
      
    }
}