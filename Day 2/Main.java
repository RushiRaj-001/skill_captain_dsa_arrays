public class Main {

    public static int[] calculate(int[] nums) {

        int n = nums.length;
        int[] leftSide = new int[n];
        int[] rightSide = new int[n];
        int[] result = new int[n];

        leftSide[0] = 1;
        for (int i = 1; i <= n - 1; i++) {
            leftSide[i] = leftSide[i - 1] * nums[i - 1];
        }

        rightSide[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightSide[i] = rightSide[i + 1] * nums[i + 1];
        }

        for (int i = 0; i <= n - 1; i++) {
            result[i] = leftSide[i] * rightSide[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4 };
        int[] result = calculate(number);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}