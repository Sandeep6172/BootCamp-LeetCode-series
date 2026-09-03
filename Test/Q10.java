import java.util.*;

public class LongestIncreasing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            dp[i] = 1;
        }

        int ans = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            ans = Math.max(ans, dp[i]);
        }

        System.out.println(ans);
    }
}
