class Flipkart{
    int price;
    int discount;
   Flipkart(int price, int discount) {
    this.price=price;
    this.discount=discount;
   }

   Demo extends Flipkart{
        String item_name;
        String brand_name
        Demo(String item_name, String brand_name, int price, int discount){
            Super(price,discount);
            this.item_name=ite_name;
            this.brand_name=brand_name;
        }
        public static void main(String[] args){
            Demo d1=new Demo("shirt","denim",1999,599);
            System.out.println(d1.discount);
        }
   }
}