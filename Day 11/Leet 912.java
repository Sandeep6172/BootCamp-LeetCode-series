class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    void quickSort(int[] a, int l, int r) {
        if (l >= r) return;

        int p = a[r], i = l;

        for (int j = l; j < r; j++) {
            if (a[j] < p) {
                int t = a[i];
                a[i++] = a[j];
                a[j] = t;
            }
        }

        int t = a[i];
        a[i] = a[r];
        a[r] = t;

        quickSort(a, l, i - 1);
        quickSort(a, i + 1, r);
    }
}
