// mainluy encapsulation  is for binding data to the private variables by using setters and getters

public class Account{   
   private  int acc_bal;
   private  String name;
   private double salary;

   public void setacc_bal(int acc_bal){
            this.acc_bal=acc_bal;
   }
   public int getAcc_bal(){
           return acc_bal;
   }

   public void setName(String name){
    this.name=name;
   }
   public String getname(){
    return name;
   }

   public void  setsalary(double salary){
    this.salary=salary;
   }
   public double getsalary(){
       return salary;
   }
}