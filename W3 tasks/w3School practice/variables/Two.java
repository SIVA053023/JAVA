package variables;

public class Two {
    String employee_loc;    //  this is a Instance variable so we have to create a object to intialize this in main method
    
    Two(String employee_loc){             // this is a Constructor to intialize the object values
        super();
        this.employee_loc=employee_loc;
    }
    public String toString(){
        return employee_loc;            // here toString() is for to print the String value from from the instance variable
    }
    public static void main(String[] args) {
        
        String ename="Siva";                          
        System.out.println(ename+" "+"Krishna");

       Two  e1= new Two("Siva");           
        System.out.println(e1+"krishna");                  // this is a LOcal variable we call it directly  otherwise it gives a output as a heaxa decimal value =Two@7adf9f5fkrishna
    }
}
