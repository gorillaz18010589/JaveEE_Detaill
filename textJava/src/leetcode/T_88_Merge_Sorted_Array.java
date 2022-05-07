package leetcode;
/*
 * 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 * */
public class T_88_Merge_Sorted_Array {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		
		//ans:[1,2,2,3,5,6]
		int[] ansAray = merge(nums1, m, nums2, n);
	
		
		int i=0;
		for(System.out.printf("(印出答案 ->"); i< ansAray.length; i++ ) {
			System.out.printf("%d,",ansAray[i]);
		}
		System.out.println(")");
	}
	
	 /*
	  * 
	  * */
	 public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		   int last = m + n -1; // m + n 同等於 nums1.length
		   System.out.printf("merge -> m:%d, n:%d, last:%d \n" ,m ,n ,last);
	        m--; // 直接使用原本的變數，就不宣告新的
	        n--; // 直接使用原本的變數，就不宣告新的
	        
	        // 因為題目是要求將 nums2 合併到 nums1，所以必須跑到 nums2 清空為止
	        while (n > -1) {
	            if (m > -1 && nums1[m] > nums2[n]) {
	                nums1[last--] = nums1[m--];
	                System.out.printf("nums1[m] > nums2[n] -> last:%d\n",last);
	            } else {
	                nums1[last--] = nums2[n--];
	                System.out.printf("nums1[m] < nums2[n] -> last:%d\n",last);
	            }
	            System.out.println("--------");
	        }
	       return nums1;
	    }

}
