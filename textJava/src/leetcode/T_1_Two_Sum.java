package leetcode;

import java.util.HashMap;
import java.util.Set;
//java.util.HashMap => boolean containsKey(Object key):依你傳進來的key參數查看hashMap裡是否有這個值

/* 兩數總和
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

//題目:依據這個目標將陣列李相加起來等於目標值的,兩個位置用int[]回傳
//解法邏輯:尋訪這個[2,7,11,15]如果 target = 13 - [i]2 沒有在hashMap裡時,將這個2存起來在key裡,value存陣列位置,繼續尋訪直到 target  13 - [2]位置的11時裡面的值是2,
 * 而這個2有存在之前存的HashMap,所以這時將這個值11存在result[0] ,將這個numMaps.get(target - nums[i] ：取得hashMap裡面的 13-11 = 2,取得這個2的value,這就是這個值的位置
 * */

/*
 * Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * */
public class T_1_Two_Sum {

	public static void main(String[] args) {
		int [] nums = {2,7,1,15};
		int target = 8;
		int [] result = new int[2];
		HashMap<Integer, Integer> numMaps = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			 if(numMaps.containsKey(target - nums[i])) { // 22 - 2 = 20  , 20是否有值含在這個maps裡,沒有的話將這個陣列的一個值存在key裡,將位置i存在value裡
				 result[0] = i;
			     result[1] = numMaps.get(target - nums[i]);
				 System.out.println("是答案 nums[0]:" + i+",result[1]:" + numMaps.get(target - nums[i]));
				 break;
			 }else {
				 System.out.println("不是答案 存起key -> nums[i]:" + nums[i] +", 存起value ->陣列位置i:" + i);
				 numMaps.put(nums[i], i);// nums[i] = 2, i=0;  沒有的話將第一個值存在key裡,將位置存在value裡,繼續到第二回圈去問
			 }
				System.out.println("看一下numMaps:key:" + nums[i]);
				
				//查看hashMap存的值
				for(int set: numMaps.keySet()){
					System.out.println("看一下numMaps裡面所有的值:" + set);
					System.out.println("--------------");
				}
		}
		
	}
	
	public void test() {
		
	}

	/*
	 * 依據target ,如果target等於nums陣列裡面兩個值的相加,取得那兩個值的位置,用陣列int回傳
	 * @Param int[] nums ex: nums = [2,7,11,15]
	 * @Param target ex:9 
	 * return   Because nums[0] + nums[1] == 9, we return [0, 1].
	 * */
	public int[] twoSum(int[] nums, int target) {
		int [] result = new int[2];
		HashMap<Integer, Integer> numMaps = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			 if(numMaps.containsKey(target - nums[i])) {
				 result[0] = i;
			     result[1] = numMaps.get(target - nums[i]);
				 System.out.println("是答案 nums[0]:" + i+",result[1]:" + numMaps.get(target - nums[i]));
				 break;
			 }else {
				 System.out.println("不是答案 nums[i]:" + nums[i] +", i:" + i);
				 numMaps.put(nums[i], i);
			 }
		}
		return result;
    }

}
