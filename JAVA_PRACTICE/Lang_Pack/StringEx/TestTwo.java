class Parent{}
class Child extends Parent{}
class Test {
    public static void main(String[] args) {
       Parent p1=new Parent();
       Child c1=new Child();
       String  a=new String("rahul");
       String b=new String("rahul");
       int c=10;
       String s1=new String("Rahul");
       String s2="Rahul";
       String s3="Rahul";
       String s4=new String("Rahul");
       System.out.println(a.equals(b));           // here String is as a Object, so here equals method compare the content so OUTPUT:- TRUE
       System.out.println(p1.equals(c1));        //  
       System.out.println(p1 ==c1);             //   
    }
}
