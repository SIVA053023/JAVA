abstract class Page{
   public abstract void m1();  /* here we are giving just declaration without definition{} means its a non-static, if any method of a class contain atleast
                       one abstract method then the class should be in abstract only and in abstract class we all know that we can't create an object
                        */
    
    
}

 class Two extends Page{
   public void m1(){
       System.out.println("it is a abstaract example");   // declaration is must if you want to execute the abstact method
   }
    public void m2(){}
    
   public static void main(String[] args){

       Two a1=new Two();  // child reference required to execute the abstract class. here child is responsible
       a1.m1();
       a1.m2();   
      //  System.out.println("it is a abstaract example");
   }   

}