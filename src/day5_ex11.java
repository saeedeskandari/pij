public class day5_ex11 {
    public static String[][] add2x(String list[][], String x, String y) {
        int len=0;
        for (String n[]:list) len++;
        String[][] list1 = new String[len + 1][2];
        for (int i = 0; i < len; i++) {
            list1[i][0] = list[i][0];
            list1[i][1] = list[i][1];
        }
        list1[len][0] = x;
        list1[len][1] = y;
        return list1;
    }
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String[][] list = new String[0][0];
        String next = "";
        do {
            System.out.println("please enter name :");
            String name = scan.next();
            System.out.println("pleade enter ID :");
            String Id = scan.next();
            list = add2x(list, name, Id);
            System.out.println("do you want to continue? (y/n)");
            next = scan.next();
        } while ("y".equals(next));
        for(String n[]:list)
            System.out.println("[" + n[0] + "," + n[1] + "]");
    }
}
