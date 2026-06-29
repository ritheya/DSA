/*Problem: Reverse Integer                                                                                                                            Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsign
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21*/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int start=nums[i];
            while(i<nums.length-1 && nums[i]+1 == nums[i+1])
            {
                i++;
            }
                 int end=nums[i];

        
        if(start == end){
            ans.add(String.valueOf(start));
        }
        else{
            ans.add(start+ "->" +end);
        }
        i++;
    }
      return ans;  
    }
 
}