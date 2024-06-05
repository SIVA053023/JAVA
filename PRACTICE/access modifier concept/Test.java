package pack2;
import pack1.one;
import pack1.two;
class Demo{
           public static void main(String []args){
          
           one a2=new one();
           two b2=new two();
               a2.m1();
               b2.m3();
               // a2.m2(); it is not executable because it is a default method we can only access this with in the package only
            
          
 }
}