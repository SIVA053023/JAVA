import java.util.*;
class map2{
    public static void main(String[] args) {
        HashMap<String,String> product=new HashMap<String,String>();
        product.put("p_Id", "101");
        product.put("p_Name", "infosys");
        product.put("Price", "7500");
        product.put("colour", "red");
        product.put("avail", "true");
        System.out.println(product);
        System.out.println(product.keySet());
        System.out.println(product.values());

        Set<String> keys=product.keySet();
        for(String key:keys){
            System.out.println(key+":"+product.get(key));
        }

        Collection<String> values=product.values();
        for(String value:values){
            System.out.println(value);
        }

    }
}