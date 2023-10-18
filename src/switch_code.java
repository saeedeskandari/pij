enum Day {MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY, SONDAY }
public class switch_code {
    public static void main(String[] args) {

        Day dayofweek = Day.MONDAY;

        switch (dayofweek) {

            case MONDAY:
                System.out.println("monday");
                break;
            case TUESDAY:
                System.out.println("tuesday");
                break;
            case WEDNESDAY:
                System.out.println("wednesday");
                break;
            case THURSDAY:
                System.out.println("thursday");
                break;
            case FRIDAY:
                System.out.println("friday");
                break;
            case SATURDAY:
                System.out.println("saturday");
                break;
            case SONDAY:
                System.out.println("sonday");
                break;
        }
        System.out.println(dayofweek);

    }
}