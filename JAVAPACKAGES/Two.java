package pack2;
import pack1.One;
class Siva{
    public void m2(){
        System.out.println("this is a pack 2");
    }

    public static void main(String [] args){
        One a1=new One();
        a1.m1();
        Siva s1=new Siva();
        s1.m2();
    }
}