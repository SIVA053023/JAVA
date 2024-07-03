import java.util.*;

// what is map inerface= group of entries pairs as one entity
// what is entry= combination of key value    ex1= "id":"101", ex2= "name":"rahul"
class map{
    public static void main(String[] args) {
        HashMap<String,String> emp=new HashMap<String,String>();
        emp.put("id", "101");
        emp.put("name", "Rahul");
        emp.put("sal", "45000");
        emp.put(null, "1000");
        System.out.println(emp);
        System.out.println(emp.get("name"));
        emp.get("id");
        emp.get("name");
        emp.get("sal");
        System.out.println(emp.keySet());
        System.out.println(emp.values());
        System.out.println(emp.entrySet());
    }
}