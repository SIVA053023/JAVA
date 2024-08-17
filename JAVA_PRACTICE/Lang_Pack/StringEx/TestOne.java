class Test{
    public static void main(String[] args) {
    String s1=new String("Rahul");
    String s2="Rahul";
    String s3="Rahul";

    System.out.println(s1.equals(s2));//true   because the String is wrapper class and it a inbuilt  object  so here the equals() is applicable
    System.out.println(s1.equals(s3)); //true
    System.out.println(s1 == s2); //false      because S1 ref is different from the S2
    System.out.println(s2 == s3); //true
    }
}

// here we are usingt the  equals and the == operators for the ref and the content comparison

/*
                 EQUALS ()
 * It is only applicable for the only OBJECTS
 * Object equals() -->  reference comparison
 * String,String buffer,String Builder    equals() for the content comparison
 */

 /*
                  EQUALS OPERATOR 
     * It is applicable for the both PRIMITIVE and the OBJECTS     
     * 1.--->  in case of PRIMITIVE it is for the content comparison  
     * 2.--->  in case of the OBJECTs   REF-comparison        NOTE:relation is required      
  */