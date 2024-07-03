import java.util.*;
class emp{
    public static void main(String[] args) {
        Map<String,String> users=new HashMap<String,String>();
        users.put("a", "100");
        users.put("b", "101");
        users.put("c", "102");
        users.put("d", "103");
        for(Map.Entry<String,String> user:users.entrySet()){
            System.out.println(user.getKey()+":"); System.out.println(user.getValue());
           
        }
        System.out.println(users.get("a"));
        System.out.println(users);
        System.out.println(users.values());
    }
}