public class One{
    private int salary;

    public void setsalary(int salary){
        this.salary=salary;
    }
    public int getsalary(){
        return salary;
    }
    public static void main(String[] args){
        
        One a1=new One();
        a1.setsalary(20000);
        System.out.println(a1.salary);
    }
}

