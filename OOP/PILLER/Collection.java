public class  Collection extends Company{
    private int j_collection;
    private int a_collection;
    private int total_ls;
    Collection(String jio,String airtel,int j_cl, int a_cl ){
        super(jio, airtel);
        this.j_collection=j_cl;
        this.a_collection=a_cl;
    }
    // setters and getters
    public void settotal_ls(int total_ls){
        this.total_ls=total_ls;
    }
    public int gettotal_ls(){
        return total_ls;
    }
    public int turn_over(){
        int turn_over=(this.j_collection+this.a_collection)-gettotal_ls();
        return turn_over;
    }
}