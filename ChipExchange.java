import java.util.Scanner;
public class ChipExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            long cA = scanner.nextLong();
            long cB = scanner.nextLong();
            long fA = scanner.nextLong();

            long ans = solve(A, B, cA, cB, fA);
        }


    }

    public static long solve(long A, long B, long cA, long cB, long fA) {
        return 0;
    }
}