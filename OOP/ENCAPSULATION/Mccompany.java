public class Mccompany {
    private String org_name;
    private Object turnover;
    private String expences;
    private int profit;
    
    Mccompany(int Contry_code, String country){

    }
    public void setorg_name(String name){
        this.org_name=name;
    }
    public String getorg_name(){
        return org_name;
    }
    public void setturnover(Object turnover){
        this.turnover=turnover;
    }
    public Object getturnover(){
        return turnover;
    }
    public void setexpences(String expences){
        this.expences=expences;
    }
    public String getexpences(){
        return expences;
    }
    public void setprofit(int profit){
        this.profit=profit;
    }
    public int getprofit(){
        return profit;
    }
    public static void main(String[] args) {
        Mccompany m1=new Mccompany(91,"INDIA");
        m1.setorg_name("mcdonalds");
        m1.setturnover("1.6trillion");
        m1.setexpences("300k");
        m1.setprofit(236);
        System.out.println(m1);
        System.out.println("McDonalds   "+m1.getorg_name()+"  "+m1.getturnover()+"  "+m1.getexpences()+"  "+m1.profit);

    }

    
}
