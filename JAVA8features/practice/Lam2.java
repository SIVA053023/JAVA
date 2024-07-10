@FunctionalInterface
interface calcI{
    public int add(int a, int b);
}
class calImpl{
    public static void main(String[] args) {
        calcI obj=(a,b)->a+b;                   // lambda expression
        System.out.println(obj.add(10, 20));
    }
}


//   interface calcI{
//   public abstract int add(int a , int b);
//   }
//   class calcImpl implements calcI{

//   public int add(int a, int b){
//   return a+b;
//   }

//   public static void main(String[] args){
//   calcI obj=new calcImpl();
//   System.out.println(obj.add(10,20));
//   }}
 