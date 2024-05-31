/* costructor starts with clss name, and it used to intialize the object arguments*/

 class Account{
    int acc_id;
    String name;
    int bal;
                                             // Constructor can be created by using the class name and it is a special method,
    Account(int id, String name,int bal){   // it executed automatically at the time of object creation, mainly it is for to intialize the object arguments.
        this.acc_id=id;                    // word 'this' is a pointer used to access the class members in aclass
        this.name=name;
        this.bal=bal;

    }

    public static void main (String[] args){
        Account a1=new Account(101,"shiva",5000);
         
        System.out.println(a1.acc_id+a1.name+a1.bal);
        
        
    }



}