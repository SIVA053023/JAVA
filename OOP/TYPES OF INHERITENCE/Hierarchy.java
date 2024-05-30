class parent{
    public void m1(){
        System.out.println("this is a parent class");
    }
}

class child1 extends parent{

    public void m2(){
        System.out.println("this is a child1 class");
    }
    public static void main(String[] args){
     child1 a1=new child1();  // due to inheritence here we have m1 and m2
     a1.m1();
     a1.m2();
    }
}

class child2 extends parent{
    public void m3(){
        System.out.println("this ia child2 class");
    }
    public static void main(String[] args){
        child2 a2=new child2();              // here due to inheritence we have m1 and m3 methods
        a2.m1();
        a2.m3();
    }

}

