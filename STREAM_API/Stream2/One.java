import java.util.*;
import java.util.stream.Collectors;

class test{
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("Siva","Krishna","Harish","priya","Swathi","rahul");

        // printing the list that all stirngs  converted to uppercase

        List<String> upper=enames.stream().sorted().map(names->names.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);

     List<String> new_enames=new ArrayList<String>();
     for(String ename:enames){
        new_enames.add(ename.toUpperCase());
     }
     System.out.println(new_enames);

     // print the enames count in that names starts with letter "p"
// with Stream
     Long no_p=enames.stream().filter(ename->ename.startsWith("p")).count();
     System.out.println(no_p);
     // without Stream
     
    //  for(int ename:enames){
    //   if(enames.fir){}

    // }

     // by using the iterator
   
    int no_of_emp=0;  // intialization
    Iterator itr =enames.iterator();
    while(itr.hasNext()){
        if(itr.next().toString().startsWith("p")){
            no_of_emp ++;
        }
       
    }
    System.out.println(no_of_emp);
    // we need to print the

} 
}