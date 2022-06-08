package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;import javax.xml.bind.ValidationEvent;

/*
 * 283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 將 0 全部移動到陣列後面
不打算非 0 元素的順序

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 * */
public class T_283_Move_Zeroes {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12} ;
		nums = moveZeroes(nums);
		for(int i : nums) {
			System.out.println("value:" + i);
		}
		

	}
	
		/*
		 * 將陣列中為0的元素放置陣列的最後
		 * ＠param   int[] nums : [0,1,0,3,12]
		 * return [1,3,12,0,0]
		 * */
	   public static int[] moveZeroes(int[] nums) {
		   int index = 0;
			for(int i=0; i< nums.length; i++) {
			    //如果訓訪的值不等於0的話,從元素第一位開始將值改成整數
				if(nums[i] != 0) nums[index++] = nums[i];  //ex : [1,3,12,3,12];
			}			
				//將後面的index = i,後面的原本重複的值都改成0
			  for(int i=index;i<nums.length;i++) {
		      		nums[i]=0;
			  }
		
	        return nums;
	    }

}
