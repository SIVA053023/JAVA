class Flipkart{
    int price;
    int discount;
   Flipkart(int price, int discount) {
    this.price=price;
    this.discount=discount;
   }

}

  class Demo extends Flipkart{
        String item_name;
        String brand_name;
        Demo(String item_name, String brand_name, int price, int discount){
            super(price,discount);
            this.item_name=item_name;
            this.brand_name=brand_name;
        }
        public static void main(String[] args){
            // Demo d1=new Demo("shirt","denim",1999,599);
            Demo d1=new Demo("SHIRT", "LEVIS", 78955, 45);
            System.out.println(d1.discount);
            Demo d2= new Demo("one","levis",4323,323);
            System.out.println(d2);

        }
   }