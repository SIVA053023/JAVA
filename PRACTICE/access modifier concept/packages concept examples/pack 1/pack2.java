package access modifier concept.packages concept examples.pack 2;

import access modifier concept.packages concept examples.pack 1;
class test{
           
           public static void main(String[]args){
           
                a1.m1(); // we can execute this because it's a "public method " so we can access anywhere

                //*a1.m2(); we can not execute this because it's a "proected method" we can access out side of package but child reference                            required in this we are giving any child reference so it is not executed*//

                a1.m3(); // we cannot access this because it is a "default method" within package only

                a1.m4(); // obvisouly we cannot access this because it's a "private method" within class only
           }
}