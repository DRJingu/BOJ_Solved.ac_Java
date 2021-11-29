import java.math.BigDecimal;
import java.util.Scanner;

public class BOJ_15792 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ", -1);
        System.out.println(new BigDecimal(a[0]).divide(new BigDecimal(a[1]), 1000, BigDecimal.ROUND_HALF_UP));
    }
}
