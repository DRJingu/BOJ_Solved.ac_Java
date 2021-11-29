import java.util.Scanner;

public class BOJ_2562 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int st=0;

        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                st = i+1;
                max = arr[i];
            }
        }
        System.out.print(max+"\n"+st);

    }
}
