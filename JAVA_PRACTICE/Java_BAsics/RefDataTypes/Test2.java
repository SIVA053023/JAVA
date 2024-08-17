public class Test2 {
    int a;
    int b;
    static int c=30;
    public static void main(String[] args) {
        Test2 t1=new Test2();
        t1.a=20;
        t1.b=30;
        System.out.println(t1.a+t1.b);   //50
        System.out.println(t1.a+t1.b+c);  //80
        Test2 t2=new Test2();
        t2.a=55; 
        t2.b=65;
        System.out.println(t2.a+t2.b+c);  // 150

        
    }
}
