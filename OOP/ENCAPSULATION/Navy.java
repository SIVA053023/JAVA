public class Navy{
    private String c_name;
    private String coastname;
    private String country;
    private int c_id;

    public void setc_name(String c_name){
        this.c_name=c_name;
    }
    public String getc_name(){
        return c_name;
    }
    public void setcoastname(String coastname){
        this.coastname=coastname;
    }
    public String getcoastname(){
        return coastname;
    }
    public void setcountry(String country){
        this.country=country;
    }
    public String getcountry(){
        return country;
    }
    public void setc_id(int c_id){
        this.c_id=c_id;
    }
    public int getc_id(){
        return c_id;
    }
    public static void main(String [] args){
        Navy a1= new Navy();
        a1.setc_name("krishna");
        a1.setcoastname("eastcoast");
        a1.setcountry("INDIA");
        a1.setc_id(108);
        System.out.println("commando details="+a1.getcountry()+a1.getc_id()+a1.getc_name()+a1.getcoastname());
    }
}
