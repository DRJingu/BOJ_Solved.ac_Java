import java.time.LocalDate;

public class BOJ_16170 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
    }
}
