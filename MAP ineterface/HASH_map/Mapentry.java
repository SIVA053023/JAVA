import java.util.*;
class map3 {
    public static void main(String[] args) {
        HashMap<String,String> product=new HashMap<String,String>();
        product.put("p_Id", "101");
        product.put("p_Name", "infosys");
        product.put("Price", "7500");
        product.put("colour", "red");
        product.put("avail", "true");
        Set<Map.Entry<String,String>> entries=product.entrySet();
        for(Map.Entry<String,String> entrie:entries){
            System.out.println(entrie.getKey()+":"+entrie.getValue());

        }
    }
    
}
