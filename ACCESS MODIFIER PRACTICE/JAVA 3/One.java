package rbi;
public class One{
    public void m1(){
        System.out.println("sivakrishna053023");     //public method   this method we access anywhere
    }
    void m2(){}   // this is a default method so we can accesss with in the package only
    protected void m3(){
               System.out.println("let's get uup do something and don't give up");  // this is a protected ,int this case we can access within the package or outside but the child reff is required
 
    }
    private void m4(){}  ;      // this is a private  we can access this method with in the class only
}