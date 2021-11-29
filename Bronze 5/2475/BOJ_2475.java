import java.util.Scanner;

public class BOJ_2475 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        System.out.println((int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)+Math.pow(d,2)+Math.pow(e,2))%10);
    }
}
