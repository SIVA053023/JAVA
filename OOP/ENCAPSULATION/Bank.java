 public class Bank{


              private int esal;
              
              public void setesal(int esal){
               this.esal=esal;
             }
              public int getesal(){
                return esal;
             }
            
         public static void main (String[] args){

            Bank a1=new Bank();
            
            a1.setesal(50000);
            
         System.out.println("esal="+a1.getesal());
   }
}

            