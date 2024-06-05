package example;
class demo extends A {
          
          public static void main (String[]args){
          
                A a1=new A();
          
               a1.m1(); // actually we can access this because it is "public method" 
               a1.m2(); // this also we can access beacuse it is "protected " we can access with in package(both classes in pack1 only)
               a1.m3(); // we can access because it's a "default method" we can access with in package  
             //a4.m4(); we can't access this because it's a "private method" we can only access within class only  
          }
}
            
         