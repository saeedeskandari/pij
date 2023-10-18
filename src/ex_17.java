public class ex_17 {
    public static void main(String[] args) {
        java.util.Scanner scan =new java.util.Scanner(System.in);
        System.out.println("please enter a number :");
        int num = scan.nextInt();
        double i=0 ;
        double result;
        double total=0;
        int negetive= 1;
        while (i < num){
            result=(negetive*(4/((2*i)+1)));
            total= total +result;
            negetive = negetive * -1;
            i++;
        }
        System.out.println(total);
    }
}
