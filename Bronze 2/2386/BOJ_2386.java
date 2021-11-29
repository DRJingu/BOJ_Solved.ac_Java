import java.util.Scanner;

public class BOJ_2386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        while(true){
            temp = 0;
            String[] a = sc.nextLine().split(" ");
            for(int i=1;i<a.length;i++){
                for(int j=0;j<a[i].length();j++){
                    if(a[0].equals(a[i].charAt(j))){
                        temp++;
                    }
                }
            }
            System.out.println(a[0]+" "+temp);
        }
    }
}
