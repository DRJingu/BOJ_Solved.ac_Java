import java.util.Scanner;

public class BOJ_1546 {
    static void main(String[]l) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        float arr[] = new float[a];
        float max=0;
        float al=0;
        for(int i=0;i<a;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<a;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i=0;i<a;i++){
            arr[i] =  arr[i]/max * 100;
            al +=arr[i];
        }
        System.out.println(al/arr.length);

    }
}
