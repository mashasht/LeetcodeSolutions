package org.leetcode.solutions;
// TODO: review
public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= new int[2];
        if(nums.length ==0){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;
    }

    int search(int[] nums , int target , boolean isStart){
        int ans= -1;
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while(start<=end){
            mid = start + (end - start) /2;
            if(target > nums[mid]){
                start = mid + 1 ;
            }
            else
                if( target < nums[mid]){
                    end = mid-1;
                }
                else {
                    ans=mid;
                    if (isStart) {
                        end=mid - 1;
                    }
                    else start=mid + 1;
            }
        }
        return ans;
    }
}
