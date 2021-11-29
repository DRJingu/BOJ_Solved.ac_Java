import java.util.Scanner;

public class BOJ_21300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        for(int i=0; i<6;i++){
            n = sc.nextInt();
            sum += n*5;
        }
        System.out.println(sum);
    }
}
