class Solution {
    public int[] getConcatenation(int[] nums) {
        int res[]=new int[2*nums.length];
        int j=0;
        for (int i:nums){
            res[j]=i;
            j++;
        }
        for (int i:nums){
            res[j]=i;
            j++;
        }
        return res;
    }
}