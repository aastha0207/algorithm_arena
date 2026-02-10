import java.util.Scanner;

public class solution1{

    static void printGfg(int N) {
        if (N == 0) {
            return;
        }

        System.out.print("GFG ");
        printGfg(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        printGfg(N);
    }
}
