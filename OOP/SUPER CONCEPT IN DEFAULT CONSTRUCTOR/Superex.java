// super is used for invoking the parent class constructor

public class Superex{
    public Superex (){                      // IT IS
        super();                   //  A default  constructer
        System.out.println("one");//
    }
}

     class child extends Superex{
          child (){
            super();
            System.out.println("two");           // due to inheritence the default constructor values automatically accessed in child class
          }
          public static void main(String[] args){
             new child();
          }
    }

