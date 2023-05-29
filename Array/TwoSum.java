package Array;
import java.util.*;
/*
    * LEETCODE: 1. Two Sum
    * https://leetcode.com/problems/two-sum/
 */
 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=target-nums[i]; 
            if(hm.containsKey (key)){
              return new int[]{i,hm.get(key)};  
            }else{
                hm.put(nums[i],i);
            }
        }
        return null;
    }
}