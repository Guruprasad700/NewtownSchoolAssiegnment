import java.util.Scanner;

public class Assign {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 5; i <= n; i+=5) {
            System.out.print(i+",");
        }
    }
}
