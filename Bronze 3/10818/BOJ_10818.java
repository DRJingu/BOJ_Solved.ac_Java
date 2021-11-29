import java.util.Scanner;

public class BOJ_10818 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        int min = 1000001;
        int max = -1000001;

        for(int i=0;i<a;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print(min+" "+max);
    }
}
