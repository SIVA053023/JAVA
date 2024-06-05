public class Demo{
    public static void main(String[] args){
        PE p1=new PE(101,"rahul","hyderabad",50000);
        p1.settax(10);
        System.out.println(p1.cal_sal());
    }
}
/*public class Demo {
    public static void main(String[] args) {
       PE pe1=new PE(101, "Rahul", "Wayanad", 50000);
        pe1.setTax(10);
        System.out.println(pe1.cal_Sal());

        CE ce1 = new CE(2001, "Modi", "varanasi", 90000);
        ce1.setTax(20);
        System.out.println(ce1.cal_Sal());


        EmployeeService.get_Service(pe1);
        EmployeeService.get_Service(ce1);
    }
}*/