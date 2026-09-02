class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list= new ArrayList<>();
        
        for(int i=0;i<numRows; i++){
            List<Integer> temp=new ArrayList<>();
            for(int k=0;k<i+1; k++){
                temp.add(1);
            }
            for(int j=1; j<i;j++){
                temp.set(j, list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            list.add(temp);
        }
        return list;
    }
}
