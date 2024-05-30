 class parent{
    void m1(){
        System.out.println("this is a parent class");
    }
}
class child extends parent{
    public void m2(){
        System.out.println("this is a child class");
    }

    public static void main(String[] args){

        child c1=new child ();
        c1.m1();
        c1.m2();
        


    }
}
