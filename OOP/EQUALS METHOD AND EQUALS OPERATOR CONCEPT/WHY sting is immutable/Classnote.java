/*String object are immutable due to string Constant pool(S C P)  here wwe use the concate, and we mainly use this 
  string objects where there in no need change the data.
 * where as StringBuffer are mutable here we use the "append",  and this stringbuffer used to where the data frequently changes
*/
class Demo{
    public static void main(String[] args) {
        String s1= "Rahul";  // its a literal string object here only one Rahul object created in SCP and pointing to s1
        /*  s1.concat("gandhi");  here we are not pointing
       // System.out.println(s1);// Actually here we think the output would be "Rahulgandhi" but output= "Rahul" only cause */
        s1=s1.concat(   "Gandhi"); // here we are pointing  s1.concat(   "Gandhi") pointing to the s1
        System.out.println(s1);  // here we get the output RahulGandhi

        StringBuffer s2=new StringBuffer("Rahul");
                     s2.append("Gandhi");
        System.out.println(s2);  // here we get the output as "RahulGandhi" cause these are mutable
    

    }
}