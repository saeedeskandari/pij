public class ascii_code {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("pleas enter a number :");
        String input = scan.next();
        // use ascii-code.com
        int caratposzero = input.charAt(0);
        System.out.println(caratposzero);
        int i = scan.nextInt();

        System.out.println(i);
    }
}
