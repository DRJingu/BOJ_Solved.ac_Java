import java.util.Scanner;

public class BOJ_5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d =sc.nextInt();
        int e = a+b+c+d;
        System.out.println(e/60+"\n"+e%60);

    }
}
