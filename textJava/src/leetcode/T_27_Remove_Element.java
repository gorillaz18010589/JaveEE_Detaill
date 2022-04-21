package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 27.Remove Element
 * 給定一個數組nums和一個值val，你需要原地移除所有數值等於val的元素，返回移除後數組的新長度。

不要使用額外的數組空間，你必須在原地修改輸入數組並使用O（1）額外空間的條件下完成。

元素的順序可以改變。你不需要考慮數組中超出新長度後面的元素。


 * 
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
 * */
public class T_27_Remove_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		
		int listSize = removeElement(nums, val);
		System.out.println("listSize:" + listSize);
	}
	
	public static int removeElementList(int[] nums , int vlaue) {		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		if(nums.length <=0) return 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != vlaue) {
				numList.add(i);
			}
		}
		return numList.size();
	}
	
	public static int removeElement(int[] nums, int val) {
        int retunrnVal = 0;
        	if(nums != null && nums.length >0) {
        		//如果陣列有值才計算
        		for(int i=0; i<nums.length; i++) {
        			if(nums[i] != val) {
        				//如果陣列的值不是要刪除的val
        				nums[retunrnVal] = nums[i]; //將正確的值從0寫入
        				System.out.println("nums[retunrnVal] :" + nums[retunrnVal]);
        				retunrnVal++; //index++
        			}
        		}
        	}
        return retunrnVal;
    }
}
	

	
	 


