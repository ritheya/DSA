/*Problem: Permutations 
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,new ArrayList<>(),result);
        return result;
    }
        public void backtrack(int[] nums, List<Integer> current,List<List<Integer>> result){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int num:nums){
            if(current.contains(num))
            continue;
            current.add(num);
            backtrack(nums,current,result);
            current.remove(current.size()-1);

        }
        
    }
}