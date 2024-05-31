public class Account{
    String acc_Name;
    String acc_Addr;
    Account(String Name,String Address){
        this.acc_Name=Name;
        this.acc_Addr=Address;
    }
}

class SA extends Account{
    int acc_id;
    int acc_bal;
    SA(int id, int bal, String Name,String Address){
        super(Name, Address);
        this.acc_id=id;
        this.acc_bal=bal;
    }

    public static void main(String[] args){
        SA s1=new SA(101,50000,"rahul","chennai");

        System.out.println(s1.acc_Name);
    }
}