public class Govt{
    private String sector_name;
    private String sector_services;

    public void setsector_name(String sector_name){
        this.sector_name=sector_name;
    }
    public String getsector_name(){
        return sector_name;
    }

    public void setsector_services(String sector_services){
        this.sector_services=sector_services;
    }
    public String getsector_services(){
        return sector_services;
    }
    public static void main(String[] args){
        Govt a1=new Govt();
        a1.setsector_name("RESERVE BANK OF INDIA");
        a1.setsector_services("PROVIDING FINANCIAL SERVICES");
        
        System.out.println("GOVT="+a1.getsector_name());
        System.out.println(a1.getsector_services());
    }
}