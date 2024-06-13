public class Autoboxing {
    public static void main(String[] args) {
        int a=100;              // AUTOBOXING  primitive TO Object 
        Integer i=a;           // Integer i= Integer.valueof(a); here internally this happend but it difficult to type, So we use "Integer i=a" both stsments meaning is same
        System.out.println(a); // 100
        System.out.println(i);  // 100
    }
}
