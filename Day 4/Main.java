// Richest Customer Wealth

public class Main {

    public static int solution(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 9, 1 }, { 4, 5 }, { 2, 3 } };

        System.out.println(solution(accounts));
    }
}
