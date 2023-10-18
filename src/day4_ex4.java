import java.util.Scanner;

public class day4_ex4 {
    static int power(int b, int e)
    {
        int result = 1;
        for (int i =1; i <=e ;i++ ){
            result=result*b;
        }

        return result;
    }
    static  int power2 (int e){
        int result = power(2,e);
        return result;
    }
    static  int binary2decimal(String bi){
        int len= bi.length();
        int decimal=0;
        int exp = len -1;
        for (int i =0;i<len;i++){
            if (bi.charAt(i)=='1'){
                int a = power2(i);
                decimal = decimal+a;
            }
        }
        return  decimal;
    }
    static  String decimal2binary(int decimal) {
        String binary="";
        while (decimal >=1){
            int dev=decimal %2 ;
            System.out.println(dev);
            binary =  dev+ binary;
            decimal=decimal/2;

        }
        return binary;
    }
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

       System.out.println("please enter a decimal :");
       int decimal = scan.nextInt();
        System.out.println(decimal2binary(decimal));
//        int base = scan.nextInt();
//        System.out.println("please enter a number for exponent :");
//        int exp = scan.nextInt();
//        int res = power(base,exp);
//        System.out.println(res);
    }
}
