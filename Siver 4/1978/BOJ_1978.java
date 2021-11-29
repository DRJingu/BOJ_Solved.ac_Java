import java.util.Scanner;

public class BOJ_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int sum=0, temp =0;
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=2;j<=arr[i];j++){
                if(arr[i]%j == 0){
                    sum+=j;
                }
            }
            if(sum == arr[i]){
                temp++;
            }
            sum = 0;
        }
        System.out.println(temp);
    }
}
