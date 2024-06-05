public class PE extends Employee{
    private int id;
    private int sal;
    private int tax;
    public PE(int id,String name, String loc, int tax){
        super(name,loc);
        this.id=id;
        this.sal=sal;
        this.tax=tax;
    }
}