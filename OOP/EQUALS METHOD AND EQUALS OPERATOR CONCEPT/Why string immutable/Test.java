public class Test{
    public static void main(String[] args){
        String s1=new String("rahul");      // by using the new operator
        String s2="rahul";                 // by using literal 
        String s3="rahul";                // by using literal operator
        String s4=new String ("rahul");  // by using the new operator
        int a =10;
        int b=20;
        int c=10;
        System.out.println(s1.equals(s2));     // true because the content of s1 and s2 is same
        System.out.println(s1==s2);           // false because the ref of s1 and s2 is different
        System.out.println(a==c);            // true because the content in a and c is same
        System.out.println(a==b);           // false because the content in a and b is different
        System.out.println(s1.equals(s4));  // true because the content of both a1 ans s4 new operator objects  are same
        System.out.println(s2.equals(s3));// true because the content in both s2 ad s3 is same(here it is content only its )
       // System.out.println(s2==s3);       //true  here the content is same but the ref is different so ==noperator sees for object ref


    }
}