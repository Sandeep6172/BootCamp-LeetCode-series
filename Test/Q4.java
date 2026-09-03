import java.util.*;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] temp = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++)
            temp[i] = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int index = stack.pop();
                ans[index] = i - index;
            }

            stack.push(i);
        }

        for (int x : ans)
            System.out.print(x + " ");
    }
}
