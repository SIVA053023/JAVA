import java.util.*;
class PQ{
    public static void main(String[] args) {
        PriorityQueue<String> user=new PriorityQueue<String>();
        user.add("shiva");
        user.add("krishna");
        user.add("Sonia");
        System.out.println(user);
        System.out.println(user.poll());
        System.out.println(user);
        System.out.println(user.poll());
        System.out.println(user);
        System.out.println(user.poll());
        System.out.println(user);
        System.out.println(user.poll());
        
    }
}