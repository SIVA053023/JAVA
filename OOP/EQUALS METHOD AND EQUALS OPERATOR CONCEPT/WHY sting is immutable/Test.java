public class Test {
    public static void main(String[] args) {
        
        String s1=new String("Rahul"); // it's a "new operator object" so here one SCP rahulobject + one heap memory object created  in this Rahul object pointing to s1
        String s2=new String("Rahul");//it also a new operator object already SCP rahulobject is so it wont create another rahul SCp object +  one heap memory object created  in this Rahul object pointing to s2
        String s3= "Rahul"; // it's a literal, here only heapmemory Rahul object created pointing to s3
        StringBuffer s4= new StringBuffer("Rahul"); // it's a Stringbuffer heapmemory alloted and pointing to s4(no Scp in this case because it is mutable )
        String s5= "Rahul";
         int a=100;  // its a primitive type we can't apply the equals method
         int b=200;
         int c=100;
         Integer i=100; // its a wraper class and it a method too 
        System.out.println(s1.equals(s4)); // false cause no RELATION AND content is same but for the s4 parent object class is executed so content in object is null so answer is false only
        System.out.println(s4.equals(s1));  // here no relation so object class executed and there is no content in object class so false
        System.out.println(s1.equals(s2));  // True cause content is same
        System.out.println(s1.equals(s3));  // True cause conetent is same
        System.out.println(s3.equals(s5));   // true cause content same
        System.out.println(s1==s5);          // false cause ref is different
        System.out.println(a==c);            // true cause content same
        System.out.println(a==b);           // false cause content is different
        System.out.println(s3==s5);         // true cause content is same and also they both belongs to obeject rahul only
        System.out.println(s1==s2);         // false cause ref id different
      // System.out.println(s1==s4);       //no relation so CE occurs
       System.out.println(a==i);            // doubt..? is about 'a' is a primitive and 'i' is a wraper class, here the thing is both content is same but how it comapre primitive vs object
    }
    
}
