package leetcode;

import java.util.HashMap;

/*
 * 217. Contains Duplicate
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * 題目：給予一個陣列判斷裡面的值是否有重複,有重複的話回傳true,反之false
 * 解題思維：自己想的準備一個maps,尋訪陣列元素,將元素當作key儲存,利用containsKey,如果尋訪沒重複將maps的value存起來標記為1
 * 如果重複的話,取得這個重複的key, maps.put(nums[i], (maps.get(nums[i])) +1 ),將這個重複的元素取得當時存的1在+1,及重複的會大於1
 * 尋訪map,有回傳大於1的代表有重複直接retrun true,且break;結束迴圈,沒有重複的話回傳false

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 * */
public class T_217_Contains_Duplicate {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1};		
		boolean isRepeat = containsDuplicate(nums);
		System.out.println("isRepeat:" + isRepeat);

	}
	
	  public static boolean containsDuplicate(int[] nums) {
	        HashMap<Integer,Integer>maps = new HashMap<Integer, Integer>();
	        boolean isRepeat = false;
	        for(int i=0; i< nums.length; i++){
	            if(maps.containsKey(nums[i])){
	                maps.put(nums[i], (maps.get(nums[i])) +1 );
	            }else{
	                maps.put(nums[i], 1);
	            }
	        }
	        
	        for(int key : maps.keySet()){
	            if(maps.get(key) > 1){
	               isRepeat  =true;
	               break;
	            }else{
	                 isRepeat = false;
	            }
	        }
	        return isRepeat;
	    }

}
