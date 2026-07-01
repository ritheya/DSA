/*Problem: Max Consecutive ones                                                                                                                 Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int current_count=0;
        int maxones=0;
        for(int j=0;j<n;j++){
            if(nums[j]==1){
                current_count++;
            }
            else{
                maxones=Math.max(maxones,current_count);
                current_count=0;
            }
        }
        return Math.max(maxones,current_count);
    }
}