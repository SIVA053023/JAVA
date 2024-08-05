// here we are converting to the given array to list and print the result as an array

import java.util.*;

public class Nine {
    public static void main(String[] args) {
        int[] eids={101,102,103,104,105,106,107,108,109};
       List<Integer> prices= new ArrayList<>();
    
        
        for(int eid:eids){
            if(eid>107){
                break;
            }
            prices.add(eid);
        }
        int [] result= prices.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));   // output= [101, 102, 103, 104, 105, 106, 107]
    }
   
}
