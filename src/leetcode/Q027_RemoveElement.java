package leetcode;

import java.util.Arrays;

/**
 * Created by SUN on 2017.12.18.
 * Given an array and a value, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given nums = [3,2,2,3], val = 3,
 * Your function should return length = 2, with the first two elements of nums being 2.
 */
public class Q027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums==null)
            return 0;
        Arrays.sort(nums);
        int p=0,q=0;
        while (p<nums.length&&nums[p]!=val){p++;}
        q=p;
        while (q<nums.length&&nums[q]==val){q++;}
        while (q<nums.length){
            nums[p++]=nums[q++];
        }
        return p;
    }

    //不用排序最简单的方法更快
//    public int removeElement(int[] nums, int val) {
//        int i = 0;
//        for (int j = 0; j < nums.length; j++) {
//            if (nums[j] != val) {
//                nums[i] = nums[j];
//                i++;
//            }
//        }
//        return i;
//    }
}
