package leetcode;

import java.util.HashMap;

/*
 * 268. Missing Number 
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * 給定一個包含 [0, n]中n個數的陣列 nums ，找出 [0, n] 這個範圍內沒有出現在陣列中的那個數。



 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 * */
public class T_268_Missing_Number {

	public static void main(String[] args) {
		//題目給予nums{0,n}  , {3,0,1}; => maps[0,1,2,3] 這是目標值陣列裡面要有0,1,2,3元素,依據參數nums{3,0,1} 判斷少了目標哪個數,代表少了2
		
//		int[] nums = {9,6,4,2,3,5,7,0,1};
//		int[] nums = {3,0,1};
		int[] nums = {0,1};
		
		missingNumber(nums);
		
	}
	
	   public static int missingNumber(int[] nums) {
	        int end = nums.length;
			int start = 0;
	        int ans = 0; 
			HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
			
			
			//1.將{3,0,1};  [0, n] => 代表從[0,這個nums的size] => 代表要0 ~ 3 => [0,1,2,3];
			for( ; start<=end; start++) {
				maps.put(start, start);
				System.out.println("key:" + maps.get(start));
			}
			System.out.println("-----------------------");
			
			//將指定的nums尋訪,如果參數陣列nums[3,0,1] 裡面的元素沒有包含maps{0,1,2,3}的話我代表有值,我將maps那個value設定為0,這樣沒被改到的那個value就是nums少的值 ex:2
			for(int value : nums) {
				if(maps.containsKey(value)) {
					maps.put(value, 0);
					System.out.println("有包含value:" + value);
				}else {
					maps.put(value,1);
					System.out.println("沒包含value:" + value);
				}
			}
			
			System.out.println("-----------------------");
			
			//尋訪[0,1,2] 取得value,依據上述邏輯,有包含的他的value為0,而大於等於1以上的值代表沒有包含,就是ans
			for(int i : maps.keySet()) {
				if(maps.get(i) >=1) {
					System.out.println("ans:" + maps.get(i));
					ans = maps.get(i);
				}
			}
	        
	        return ans;
	    }

}
