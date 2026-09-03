import java.util.*;

public class LowestCommonAncestor {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findLCA(Node root, int p, int q) {
        if (root == null)
            return null;

        if (root.data == p || root.data == q)
            return root;

        Node left = findLCA(root.left, p, q);
        Node right = findLCA(root.right, p, q);

        if (left != null && right != null)
            return root;

        if (left != null)
            return left;

        return right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++)
            nodes[i] = new Node(sc.nextInt());

        for (int i = 0; i < n; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n)
                nodes[i].left = nodes[left];

            if (right < n)
                nodes[i].right = nodes[right];
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        Node ans = findLCA(nodes[0], p, q);

        System.out.println(ans.data);
    }
}
