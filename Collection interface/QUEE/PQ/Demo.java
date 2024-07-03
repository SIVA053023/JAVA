import java.util.*;
class PQ{
    public static void main(String[] args) {
        
      PriorityQueue<String> enames=new PriorityQueue<String>();
      enames.add("rahul");
      enames.add("modi");
      enames.add("priyanka");
      System.out.println(enames);
   
      System.out.println(enames.poll());
      
      System.out.println(enames);
      enames.offer("Shiva");
      System.out.println(enames);
      System.out.println(enames.peek());
      System.out.println(enames.element());
    }
}