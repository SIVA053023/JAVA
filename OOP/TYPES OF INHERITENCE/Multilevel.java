class Gp{
    public void m1(){
        System.out.println("this is a grand parent class");
    }
}

class parent extends Gp{
    public void m2(){
        System.out.println("this is aparent class"); // here by inheritence we have m1 and m2 methods
    }
}

class child extends parent{
    void m3(){
        System.out.println("this is a child class");
    }

    public static void main(String[] args){
        child a1=new child();
        a1.m1();
        a1.m2();
        a1.m3();
    }
}