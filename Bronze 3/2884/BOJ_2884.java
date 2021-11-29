import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b=s.nextInt();
        if(b>=45){
            b-= 45;
        }else{
            if(a==0){
                a+=24;
            }
            a-=1;
            b+=60-45;
        }
        System.out.println(a+" "+b);
    }
}
