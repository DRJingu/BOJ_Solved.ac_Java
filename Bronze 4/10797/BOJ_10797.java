import java.util.Scanner;

public class BOJ_10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        int temp = 0;
        String[] b = sc.nextLine().split(" ");
        for(int i=0;i<b.length;i++){
            if(b[i].contains(String.valueOf(a))){
                temp++;
            }
        }
        System.out.println(temp);
    }
}
