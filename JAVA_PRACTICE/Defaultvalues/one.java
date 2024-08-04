// package Defaultvalues;

// public class one {
//     int eid;
//     public static void main(String[] args) {
//         System.out.println(eid);
//     }
// }
class Test{
	int eid=230;         // it is a instance variable so we cann't access these instance variable directly in main method so we defintly create the object for that
    static int sal=15000;  // this is  static variale so we can access directly in main method

	public static void main(String[] args){
        int b=100;                            // this is a local variable so we can access these directly
        Test t1= new Test();                  // object
		
		System.out.println(t1.eid);       //  accessing using the object
        System.out.println(b);            // accessing directly
        System.out.println(sal);         // accessing directly
	}
}
