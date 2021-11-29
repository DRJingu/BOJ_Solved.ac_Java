import java.util.Scanner;

public class BOJ_10179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double arr[] = new double[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextDouble();
            System.out.printf("$%.2f\n",arr[i]-(arr[i]*1/5));
        }
    }
}
