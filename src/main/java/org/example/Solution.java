package org.example;

public class Solution {
    public boolean canJump(int[] nums) {
        //set the goal at the destination
        int goal = nums.length - 1;
        //iterate through the given int array
        for (int i = goal; i >= 0; i--) {
            //check if the maximum jump at the current index can reach the goal
            if (i + nums[i] >= goal) {
                //update the goal to the current index
                goal = i;
            }
        }
        //return true if the goal is now at 0
        return goal == 0;
    }
}
