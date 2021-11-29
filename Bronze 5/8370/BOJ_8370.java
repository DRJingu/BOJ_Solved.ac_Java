import java.util.Scanner;

public class BOJ_8370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,a,b,sum=0;
        for(i =0; i<2;i++){
            a = sc.nextInt();
            b = sc.nextInt();

            sum += a*b;
        }
        System.out.println(sum);
    }
}
