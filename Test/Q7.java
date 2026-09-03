import java.util.*;

public class CourseScheduleII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        int[] indegree = new int[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[b].add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        int count = 0;

        while (!q.isEmpty()) {
            int course = q.remove();
            System.out.print(course + " ");
            count++;

            for (int next : graph[course]) {
                indegree[next]--;

                if (indegree[next] == 0)
                    q.add(next);
            }
        }

        if (count != n)
            System.out.println("No valid order");
    }
}
