class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                k+=1;
                if(k>sum){
                    sum=k;
                }
            }
            else{
                k=0;
            }
        }
        return sum;
    }
}
/*

You are given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]

Output: 3

Example 2:

Input: nums = [1,0,1,1,0,1]

Output: 2
Constraints:

1 <= nums.length <= 100,000
nums[i] is either 0 or 1.

*/