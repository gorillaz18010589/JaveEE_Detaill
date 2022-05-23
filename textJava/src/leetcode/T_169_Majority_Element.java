package leetcode;

import java.util.HashMap;

/*
 * 169. Majority Element
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 判斷陣列裡哪個直大於半數回傳那個

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
 * */
public class T_169_Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3};
		int value = majorityElement(nums);
		System.out.println("value:" + value);
	}
	

	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		
		for(int i=0; i< nums.length; i++) {
			if(maps.containsKey(nums[i])) {
				//有重複,將那個值記上+1
				maps.put(nums[i],maps.get(nums[i]) + 1);
			}else {
				maps.put(nums[i], 1);
				//沒重複,設定為1
			}
		}
		
		for(Integer key : maps.keySet()) {
			int halfSize =  nums.length /2;
			System.out.println("key:" + key +", value:" + maps.get(key) +", halfSize:" +halfSize);

			//如果重複的值,超過元素值的一半,就代表是此值
			if(maps.get(key) >halfSize) {
				return key;
			}
		}
		
		return 0;
	}
}