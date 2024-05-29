public class Army{
        private int soldier_id;
        private String soldier_name;
        private int soldier_rank;

        public void setsoldier_id(int soldier_id){
            this.soldier_id=soldier_id;
        }
        public int getsoldier_id(){
            return soldier_id;
        }

        public void setsoldier_name(String soldier_name){
            this.soldier_name=soldier_name;
        }
        public String getsoldier_name(){
            return soldier_name;
        }
        public void setsoldier_rank(int soldier_rank){
            this.soldier_rank=soldier_rank;
        }
        public int getsoldier_rank(){
            return soldier_rank;
        }

        public static void main(String[] args){

            Army a1=new Army();
            a1.setsoldier_rank(12);
            a1.setsoldier_id(101);
            a1.setsoldier_name("sivakrishna");
            System.out.println("solder_details="+a1.getsoldier_id()+a1.getsoldier_name()+a1.getsoldier_rank());
        }
}