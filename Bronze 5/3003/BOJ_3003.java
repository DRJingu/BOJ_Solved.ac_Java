import java.util.Scanner;

public class BOJ_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,1,2,2,2,8};
        int a;
        for(int i=0; i<arr.length;i++){
            a = sc.nextInt();
            System.out.print(arr[i] - a +" ");
        }

    }
}
