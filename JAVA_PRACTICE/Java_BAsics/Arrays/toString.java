 class TestOne {
    public static void main(String[] args) {
        int[] eids;
        eids = new int[4];
        eids[0] = 101;
        eids[1] = 102;
        eids[2] = 103;
        eids[3] = 104;
        eids[0] = 110;

        // Manually build the string representation
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < eids.length; i++) {
            sb.append(eids[i]);
            if (i < eids.length-1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        // Print the manually constructed string
        System.out.println(sb.toString());
    }
}
 