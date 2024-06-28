import java.util.*;
// LL implements list interface and dequeue interface

class One{
    public static void main(String[] args) {
        LinkedList<String> enames=new LinkedList<String>();
        System.out.println(enames);
        enames.add("priyanka");
        enames.add("modi");
        enames.add("Sonia");
        System.out.println(enames.size());
        System.out.println(enames);

        // by for each
        for(int i=0; i<=enames.size()-1;i++){
            System.out.println(enames.get(i));

        }

        // iterator
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        // while loop
        int i=0;
        while(i<=enames.size()-1){
            System.out.println(i);
            i++;
        }

        // do while loop
        do{
            System.out.println(i);
            i++;
        } while(i<=enames.size()-1);

        // collection is a interface and the collections is a class
        Collections.sort(enames);
        Collections.shuffle(enames);
        System.out.println(enames);
        enames.set(0, "nehru");  // set is updating
        System.out.println(enames);
        enames.addFirst("Shiva");           // adding one more name at first
        System.out.println(enames);
        enames.addLast("krishna");
        System.out.println(enames);

        
    }

}