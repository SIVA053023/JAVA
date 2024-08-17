// here we are printing the enames by using the for of

public class Five {
     public static void main(String[] args) {
        String[] enames={"Rahul","Sonia","Priya","Modi","Amith"};
        int[] eids={101,102,103,104,105};
        double[] salaries={9999.9, 19999.9,29999.9,39999.9};

        for(String ename:enames){
            System.out.println(ename);
        }
     }
}
