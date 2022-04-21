package leetcode;

import java.util.HashMap;

/*
 * 目的：給你一組陣列,從這個陣列中刪除重複的值,最後只留下讀一物二的數,並回傳這個陣列的元素有幾個
 * 
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.*/
public class T_26_Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,1,2,3,3,4};
		test(a);
	}
	
public static int test(int[] nums) {
	 //如果值只有一個回傳此值
	 if (nums.length <= 1) return nums.length;
	 
     int i = 0;
     for (int j = 1; j < nums.length; j++) {
    	 //如果一開始後一個元素不等於上一個元素,符合值不同需求,將i+1,nums[i] = nums[j];,將此值存放到nums[i]
         if (nums[j] != nums[i]) {
        	 System.out.println("如果後面一個元素不等於前一個元素的話 第一個位置等於新值 nums[i] = nums[j]"  +  nums[i] + ", " + nums[j]);
             i++;
             nums[i] = nums[j];
         }else {
         //值相同不符合需求,不存放	 
        	 System.out.println("相同值被我濾掉的"  +  nums[i] + ", " + nums[j]);
         }
     }
     System.out.println(i +1);
     return i + 1;
	}

}
