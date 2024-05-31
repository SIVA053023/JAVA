class Test{
           int a=100;  //it's a instant variable, it mainly sed when the value varies from one object to another
    static int b=200; // it's a static variable , it mainly used when the value is same for the all objects is same/not varied

    public static void main(String[] args){
        int c=300; // it is a local variable, used for with in the function only

      // System.out.println(a); //here 'a' is a instance so if u want to execute the instance variable object is must required, so we get compile time error
        System.out.println(b); // we can execute 'b' because it a static variable so we can execute in static method
        System.out.println(c); // ofcourse we can execute this because it is a local so we can execute with inn funtion
    }
}