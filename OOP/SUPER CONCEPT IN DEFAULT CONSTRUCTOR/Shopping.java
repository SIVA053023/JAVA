public class Shopping{
    String pr_name;
    int pr_price;

    Shopping(String name, int price){
        super();
        this.pr_name=name;
        this.pr_price=price;
    }

}
class child extends Shopping{
    String pr_brand;
    int pr_size;
    child(String name, String brand, int size, int price){
        super(name,price);
        this.pr_brand=brand;
        this.pr_size=size;
    }
    public static void main(String[] args){
    child c1=new child("shirt","Levis",42,2599);
    System.out.println("product name="+c1.pr_name+",product brand="+c1.pr_brand+",Size="+c1.pr_size+",price="+c1.pr_price);
    }

}          //OUTPUT=  "product name=shirt,product brand=Levis,Size=42,price=2599"