import java.util.Scanner;

public class BOJ_20254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum=0;
        int arr[] = {56,24,14,6};
        for(int i=0;i<4;i++){
            n = sc.nextInt();
            sum += n * arr[i];
        }
        System.out.println(sum);
    }
}
