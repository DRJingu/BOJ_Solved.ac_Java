import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_2338 {
    public static void main(String[]z){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger(), b= sc.nextBigInteger();
        System.out.printf("%d\n%d\n%d",a.add(b),a.subtract(b),a.multiply(b));
    }
}
