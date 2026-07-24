import java.util.Scanner;

public class ChipExchange{
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
            System.out.println(ans);
        }
        scanner.close();
    }
    public static long solve(long A, long B, long cA, long cB, long fA) {
        long currentTotal = A + ((B/cB) * cA);
        if (currentTotal > fA) 
            return 0;
        long neededA = fA - currentTotal;
        long batchesNeeded = (neededA + cA - 1)/cA;
        long targetB = batchesNeeded * cB;
        long neededB = (targetB - B%cB) + (cB - 1);
        return Math.max(neededA, neededB);
    }
}