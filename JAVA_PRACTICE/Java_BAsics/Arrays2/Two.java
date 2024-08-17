class Test{
    public static void main(String[] args) {
        String[] enames={"Siva","krishna","Sonia","priyanka","modi"};
        System.out.println(enames[0]);  // Siva
        System.out.println(enames[1]);   // krishna
        System.out.println(enames[2]);  //Sonia
        System.out.println(enames[3]);  // priyanka
        System.out.println(enames[4]);  //modi
        System.out.println(enames[5]);  //error:= Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}