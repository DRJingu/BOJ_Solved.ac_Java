import java.util.Scanner;

public class BOJ_2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(a%4==0 && (a%100 !=0 || a%400==0) ? 1 :0 );
    }
}
