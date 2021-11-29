import java.util.Scanner;

public class BOJ_10952 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            int a = s.nextInt(), b=s.nextInt();
            if(a+b != 0){
                System.out.println(a+b);
            }else{
                break;
            }
        }

    }
}
