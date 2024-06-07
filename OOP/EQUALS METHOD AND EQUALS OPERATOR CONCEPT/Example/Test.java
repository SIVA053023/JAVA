public class Test{
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        String  s1="rahul";
        String  s2="shiva";
        String  s3="rahul";
        int id1=230;
        int id2=560;
        int id3=230;
        System.out.println(a.equals(b));  // output false because both references are different
        System.out.println(a == b);      // here we are using the equal operator  ouput=false
        System.out.println(id1==id2);    // here output is false
        System.out.println(id1==id3);    // here output is true because id1=id2=230
        System.out.println(s1.equals(s2));// output is false
        System.out.println(s1==s3);       // output is true s1=s3=rahul
       //System.out.println(id1.equal(id2));   it is a compile time error because equal() cannot used for primitive 




    }
}