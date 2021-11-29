import java.util.Scanner;

public class BOJ_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>40){
                sum += a[i];
            }else{
                sum+=40;
            }

        }
        System.out.println(sum/5);
    }
}
