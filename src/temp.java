
public class temp {
    public static void main(String[] args) {
        java.util.Scanner scan =new java.util.Scanner(System.in);
        System.out.println("please enter 2 number");
        double num1= scan.nextDouble();
        double num2= scan.nextDouble();
        String sym;
        double result=0;
        boolean cr = false;
        while (cr==false){
            System.out.println("now please enter the operation symbol: + , - , * or /");
            sym = scan.next();
            switch (sym){
                case "+":
                    result =num1 +num2;
                    break;
                case "-":
                    result =num1-num2;
                    break;
                case "*":
                    result =num1*num2;
                    break;
                case "/":
                    result=num1/num2;
                    break;
                default:
                System.out.println("your operation symbol was not correct.");
                break;
            }
        if ("+".equals(sym) ||"-".equals(sym) ||"*".equals(sym)|| "/".equals(sym)) cr= true;
        }
        System.out.println(result);
    }
}
