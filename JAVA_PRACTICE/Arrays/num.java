// public class num {
    class one{
        public static void main(String[] args) {
            // Step 1: Determine the size of the array
            int count = 0;
            // for (int i = 0; i <= 100; i++) {
            //     if (i % 3 == 0 || i % 5 == 0) {
            //         count++;
            //     }
            // }
        
            // Step 2: Initialize the array with the determined size
            int[] num = new int[count];
            int index = 0;
        
            // Step 3: Store the values into the array
            for (int i = 0; i <= 100; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    num[index++] = i;
                }
            }
        
            // Optional: Print the array to verify
            System.out.println("Numbers that are multiples of 3 or 5:");
            for (int value : num) {
                System.out.print(value + " ");
            }
        }
    }


