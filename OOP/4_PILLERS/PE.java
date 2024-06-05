
public class PE extends Employee{
    private int eid;
    private int sal;
    private int tax;
   public PE(int id,String name,String loc,int sal){
    super(name,loc);
    this.eid=id;
    this.sal = sal;
   }
        //generate setters and getters
        public int gettax() {
            return tax;
        }
        public void settax(int tax) {
            this.tax = tax;
        }
        public int cal_sal(){
            int gross_Sal = this.sal - this.sal/100*this.gettax();
            return gross_Sal;
        }
    
}