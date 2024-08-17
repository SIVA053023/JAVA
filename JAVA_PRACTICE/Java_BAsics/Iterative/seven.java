// here we are going to print the values from 1 to 15 by skipping the 5 multiples

public class seven {
    public static void main(String[] args) {
        int i=1;
        while(i<=15){
            if(i%5==0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
