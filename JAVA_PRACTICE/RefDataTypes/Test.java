public class Test {
    int a;
    int b;
    static int c=30;
    public static void main(String[] args) {
        Test t1=new Test();
        System.err.println(c);
        System.err.println(t1.c);
        System.err.println(Test.c);
        Test t2=new Test();
        System.out.println(t2.a);
        System.out.println(t2.b);
        System.out.println(t2.c);
    }
}
