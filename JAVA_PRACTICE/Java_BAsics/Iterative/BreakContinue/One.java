// here we are printing the numbers in between the  here we are SKIPPING NUMBER 4 and Continuing the loop upto reach the number 9 

class one{
    
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i==4){
                continue;
            } 
            if(i==9){
                break;
            }
            System.out.println(i);
           
        }
    }
}
