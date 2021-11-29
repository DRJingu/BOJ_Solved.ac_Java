import java.util.Scanner;

public class BOJ_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double all = sc.nextDouble(), bsum, per;
        Double[] sum;
        for(int i =0;i<all;i++){
            int b = sc.nextInt();
            sum = new Double[b];
            bsum = 0.00;
            per = 0.00;
            for(int j=0;j<b;j++){
                sum[j] = sc.nextDouble();
                bsum += sum[j];
            }
            double pg = bsum/b;
            for(int j=0;j<b;j++){
                if(sum[j] > pg){
                    per += 1;
                }
            }
            per = (per/b)*100;
            System.out.printf("%.3f%%\n", per);
        }
    }
}
