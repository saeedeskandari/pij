public class list {
    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int lastid = 1;
        String[][] list;
        System.out.println("please enter name :");
        String name = scan.nextLine();
        System.out.println( "pleade enter ID :");
        String Id =scan.nextLine();
        list = new String[1][1];
        list[0][0]=name;
        list[0][1]=Id;
        String cont = scan.next();
        System.out.println("do you want to continue? (y/n)");
        cont = scan.next();
        while ("y".equals(cont)){
            String[][] list1;
            list1 = new String[lastid][2];
            for (int i=0 ; i<lastid; i++) {
                list1[i][0] = list[i][0];
                list1[i][1] = list[i][1];
            }
            System.out.println("please enter name :");
            name = scan.nextLine();
            System.out.println( "pleade enter ID :");
            Id =scan.nextLine();


//        System.out.println(list1[0][0]+list1[0][1]);
//        System.out.println(list1[0][1]);
            System.out.println("do you want to continue? (y/n)");
            cont = scan.next();
        }
    }
}
