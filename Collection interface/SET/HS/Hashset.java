import java.util.*;
class Hashset{
    public static void main(String[] args) {
       Hashset hs1= new Hashset();
       Set hs2= new HashSet(); 
       
    
       Set<Integer> eids= new HashSet<Integer>();
       eids.add(101);
       eids.add(102);
       eids.add(103);
       eids.add(104);
       eids.add(105);
       eids.add(null);
       System.out.println(eids);

       for(Integer eid:eids){
        System.out.println(eid);
       }
    }
}