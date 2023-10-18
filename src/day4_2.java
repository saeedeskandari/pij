public class day4_2 {
    static int add(int op1, int op2){
        int result =op1+op2;
        return result;
    }
    static void dosomthing() {
        int a=5;
        int sum= add(a,10);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        dosomthing();
    }
}
