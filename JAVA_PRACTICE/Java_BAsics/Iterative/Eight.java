// here we are printing the values which are less than the 500

import java.util.Arrays;

public class Eight {
    public static void main(String[] args) {
        int [] prices={9,99,199,299,399,499,599,699,799};

        for(int price:prices){
            if(price>500){
                   break;
            }
            System.out.println(price);     // output= 9,99,199,299,399,499
        }

    }
}
