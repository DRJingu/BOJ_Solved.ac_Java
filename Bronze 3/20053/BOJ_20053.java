import java.util.Scanner;

public class BOJ_20053{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            int temp = -1000000, min = 1000000,ib;
            for(int j=0;j<b;j++){
                ib = sc.nextInt();
                if(ib>temp){
                    temp = ib;
                }
                if(ib<min){
                    min = ib;
                }
            }
            System.out.println(min+" "+temp);
        }
    }
}