class Test{

    public static void main(String[] args){  // by default it has already 11 object class methods 
        Test t1=new Test();                  // it a object for test class.
        System.out.println(t1);             // here we get the output as (classname +"@"+hexadecimal) because there is no user "to string method" so automatically it prints the default "to string syntax"
        System.out.println(t1.toString());   //                               Test     @  ...........  final output after executing=Test@372f7a8d

    }

}


// Actually every java class parent class is object class and by default it have 11 methods