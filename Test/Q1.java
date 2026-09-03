import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int left = 1;

        for (int i = 0; i < n; i++) {
            ans[i] = left;
            left *= nums[i];
        }

        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        for (int x : ans)
            System.out.print(x + " ");
    }
}
