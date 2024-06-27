public class Myaccount {
    public int acc_id;
    private String acc_name;
    private double acc_bal;
    public void setacc_id(int id){
        this.acc_id=id;
    }
    public int getacc_id(){
        return acc_id;
    }
    public void setacc_name(String name){
        this.acc_name=name;
    }
    public String getacc_name(){
        return acc_name;
    }
    public void setacc_bal(double bal){
        this.acc_bal=bal;
    }
    public double getaccbal(){
        return acc_bal;
    }
    
     public static void main(String[] args) {
        Myaccount m1=new Myaccount();
        m1.setacc_id(101);
        m1.setacc_name("Siva");
        m1.setacc_bal(5000.00);
        System.out.println(m1.acc_id+m1.acc_name+m1.acc_bal);
        
     }

}
