import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                // this is for to get the innformation from the user side 
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
         scanner.nextLine();
         String s = scanner.nextLine();

        // Write your code here.
            System.out.println("String: " + s);
           System.out.println("Double: " + d);
           System.out.println("Int: " + i);       
           scanner.close();
    }
}