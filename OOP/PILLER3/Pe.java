public class Pe extends Employee {
    private int e_id;
    private int e_sal;
    private int tax;
    private int e_al;
    Pe(int id,String name,String loc,int sal,int allowances){
        super(name,loc);
        this.e_id=id;
        this.e_sal=sal;
        this.e_al=allowances;
    }
    public void settax(int tax){
        this.tax=tax;
    }
    public int gettax(){
        return tax;
    }
    public int cal_value (){
        int gross_sal=((this.e_sal-this.e_al)*this.gettax()/100);
        return gross_sal;
    }

    
}
