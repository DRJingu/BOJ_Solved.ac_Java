import java.util.Scanner;

public class BOJ_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int divide =2 ;
        while (true){
            if(a==1){
                break;
            }
            if(a%divide == 0){
                a /= divide;
                System.out.println(divide);
            }else{
                divide++;
            }
        }
    }
}