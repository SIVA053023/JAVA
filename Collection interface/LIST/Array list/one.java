import java.util.ArrayList;
import java.util.Collections;

class Test{
    public static void main(String[] args) {
        
        ArrayList<String> enames=new ArrayList<String>();
        System.out.println(enames.size());  // output=0
        System.out.println(enames);         // []
        enames.add("Sonia");
        enames.add("Rahul");
        enames.add("modi");
        enames.add("priyanka");
        System.out.println(enames.size());  
        System.out.println(enames);  
        System.out.println(enames.get(2));  
        System.out.println(enames.get(3)); 
        Collections.sort(enames);
        System.out.println(enames);
        Collections.sort(enames,Collections.reverseOrder());;
        System.out.println(enames);
        
        for(int i=0;i<=enames.size()-1;i++){           // for of 
            System.out.println(enames);
        }
          int i=0;
        while(i<=enames.size()-1){             // while loop
            System.out.println(enames);
            i++;
        }
        do{                                  /* do while loop*/ 
            System.out.println(enames);
            i++;
        } while(i<=enames.size()-1);
        

    }
}