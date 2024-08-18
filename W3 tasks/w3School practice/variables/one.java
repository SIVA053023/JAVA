// here we are printing the lowest age from the ages array

public class one {
    public static void main(String[] args) {
        
        int ages[]={15,45,12,89,53,23,75};
        // int age, sum=0;
        int lowestage=ages[0];

        for(int age:ages){
             if(lowestage>age){
                 lowestage=age;
             }
        }
        System.out.println("lowest age ="+lowestage);
    }
}
