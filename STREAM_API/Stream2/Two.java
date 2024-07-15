import java.util.*;
class ex{
    public static void main(String[] args) {
        List<String> enames =Arrays.asList("Siva","preethi","priyanka","priyamani","rahul","gandhi","amithshah");
         enames.stream().filter(ename->ename.startsWith("p")).map(ename->ename.toUpperCase()).forEach(System.out::println);

         System.out.println(enames);
    }
    
}