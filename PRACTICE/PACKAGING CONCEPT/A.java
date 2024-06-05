package example;			;
public class A{
               public void m1(){};  // public method we can access anywhere
            protected void m2(){};  // protected method can access within package (+) outside package but child reference is required
                      void m3(){};  //default method can acccess within the package only
              private void m4(){};  // private method can access within the class only
}