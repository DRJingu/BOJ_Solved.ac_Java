import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_8437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger(), b=sc.nextBigInteger();
        System.out.println((a.add(b)).divide(BigInteger.valueOf(2)));
        System.out.println((a.subtract(b)).divide(BigInteger.valueOf(2)));
    }
}