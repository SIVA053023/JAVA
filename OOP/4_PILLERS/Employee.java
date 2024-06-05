

public class Employee extends Person {
    private String emp_Name;
    private String emp_Loc;
    public Employee(String name,String loc){
        super();
        this.emp_Name=name;
        this.emp_Loc=loc;
    }

    public int cal_Sal(){
        return 0;
    }
}