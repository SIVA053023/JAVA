public class Airforce{
    private int flight_no;
    private String flight_name;
    private String flight_country;

    public void setflight_no(int flight_no){
        this.flight_no=flight_no;
    }
    public int getflight_no(){
        return flight_no;
    }
    public void setflight_name(String flight_name){
        this.flight_name=flight_name;
    }
    public String getflight_name(){
        return flight_name;
    }
    public void setflight_country(String flight_country){
        this.flight_country=flight_country;
    }
    public String getflight_country(){
        return flight_country;
    }
    public static void main (String[] args){
        Airforce a1=new Airforce();
        a1.setflight_no(112);
        a1.setflight_name("AGNI");
        a1.setflight_country("India");
        System.out.println("NAVY="+a1.flight_no+a1.flight_name+a1.flight_country);
    }

}