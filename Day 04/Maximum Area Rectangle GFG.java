class Solution {
    public int calArea(int[][] arr) {
        // code here
        int maxArea=0;
        for(int i=0;i<arr.length;i++){
        int area=arr[i][0]*arr[i][1];
        maxArea=Math.max(maxArea,area);
        
            
        }
        return maxArea;
        
    }
}
