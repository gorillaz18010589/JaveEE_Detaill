package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 136. Single Number
 * 
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//從陣列裡面找出只出現一次的數字，假設陣列裡只會有一個落單的數字
You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 * */
public class T_136_Single_Number {

	public static void main(String[] args) {
		int[] nums = {4,9,2,9,2};
	
		singleNumber(nums);
	}

	 public static int singleNumberNew(int[] nums) {
	        
	        int l = nums.length;
	        int res = nums[0];
	        for( int i = 1; i < l; i++ ){
	            res ^= nums[i];
	            System.out.println("res:" + res +", nums[i]:" + nums[i]);
	        }
	        return  res;
	    }
	 
	 
	 /*
	  *
	  * 從陣列裡面取得唯一沒重複的值,
	  * @ nums = {4,9,2,9,2};
	  * return ex:4
	  * */
	 public static int singleNumber(int[] nums) {
		 	//int[] nums = {4,9,2,9,2};
	        int resual=0;
	        Map<Integer, Integer> mapss = new HashMap<>();
	        for(int i : nums) {
	            if(!mapss.containsKey(i)){
	            	//如果沒有重複的話存key = > nums裡面的值,並且設定value為1,代表沒重複
	            	mapss.put(i,1);
	                System.out.println("沒有重複將值存在key裡,將value設定為1,代表沒重複"+"!map.containsKey(i) -> map.put(i,1):" + ", key:" + i +", value:" +1);
	            }else{
	            	//如果質重複,取得曾經存過的值本來是沒重複1,再加上1,變成2代表重複
	                System.out.println("有重複將值存在key裡,將原本有的value取得,取得他的沒有重複的1加上1變成2,代表註記為不重複" + "map.containsKey(i) -> map.put(i,1):" + ", key:" + i +", value:" +(int)(mapss.get(i) + 1));
	                mapss.put(i, mapss.get(i) + 1);
	            }
	        }
	 
	        for(Integer Key: mapss.keySet()){
	        	System.out.println("key:" + Key +",value:" + mapss.get(Key) +", value為2代表是重複的值");
	            if(mapss.get(Key)<2)
	            	//如果是1,代表沒重複,將這個key存起來就是nums的沒有重複的那個元素
	            	System.out.println("小於=1 代表沒重複值為：" + Key);
	                resual = Key;
	            }
	 
	        return resual;
	    }
}
