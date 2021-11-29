import java.util.Scanner;

public class BOJ_1110 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int z;
        int b = a%10 + a/10;
        int ni = (a%10)*10 + b%10;
        int i=1;
        while(a!=ni){
            z = ni;
            b = ni%10 + ni/10;
            ni = (z%10)*10 + b%10;
            i++;
        }
        System.out.println(i);
    }
}
