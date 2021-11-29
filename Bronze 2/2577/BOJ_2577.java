import java.util.Scanner;

public class BOJ_2577 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int all = (s.nextInt() * s.nextInt() * s.nextInt());
        String str = Integer.toString(all);
        char arr[] = {'0','1','2','3','4','5','6','7','8','9'};

        for(int i=0;i<arr.length;i++){
            int z = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == arr[i]){
                    z++;
                }
            }
            System.out.println(z);
        }


    }
}
