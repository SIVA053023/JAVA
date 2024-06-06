class Demo{
    public String toString(){           // it is a "to string syntax "
        return "Sivakrishna";
    }
    public static void main(String[] args){
        Demo d1=new Demo();
        System.out.println(d1);               // now the output will be "Sivakrishna" because now we have a "to string" method so it print this method otherwise it print the default
        System.out.println(d1.toString());    // ouput= Sivakrishna
    }                                         //        Sivakrishna
}