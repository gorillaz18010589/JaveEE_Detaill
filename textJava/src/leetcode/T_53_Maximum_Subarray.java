package leetcode;

/*
 * 題目：最大子序和給定一個整數陣列 nums ，找到一個具有最大和的連續子陣列（子陣列最少包含一個元素），返回其最大和。
 * 解題方法這題主要目的在於學習一個常見的演算法：動態規劃(Dynamic Programming)。



示例:

輸入: [-2,1,-3,4,-1,2,1,-5,4],
輸出: 6
解釋: 連續子陣列 [4,-1,2,1] 的和最大，為 6。

 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 * */
public class T_53_Maximum_Subarray {

	public static void main(String[] args) {		
		int mathMax = Math.max(1, -2 + 1);//比較兩值回傳比較大的值
		System.out.println("mathMax:" + mathMax);
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		maxSubArray(nums);
	}
	
	 /*
	  * 最大子序和給定一個整數陣列 nums ，找到一個具有最大和的連續子陣列（子陣列最少包含一個元素），返回其最大和。
	  * @nums = >[-2,1,-3,4,-1,2,1,-5,4]
	  * return 返回連續位置相加最大的合
	  * */
	 public static int maxSubArray(int[] nums) {
	        int max = nums[0];
	        int sum = nums[0];
	        System.out.println("初始參數 max:" + max +", sum:" + sum);
	        for (int i = 1; i < nums.length; i++) {
	           // 這裡最重要的就是這一行了，其實就是如果前面的 sum 是小於 0 的，那麼就不需要前面的 sum，反正加上了還不如不加大
	            System.out.println("sum = > 第二個值nums[i] ,sum + nums[i]跟後面的值家前面的值比較,取得比大的值變成sum  -> nums[i]:" + nums[i] + ",前 sum + nums[i]:" + sum +" +"+ nums[i]+"去比較");
	            sum = Math.max(nums[i], sum + nums[i]);//此方法為比較兩值,回傳較大的值 (1, -2 +1)
	            System.out.println("sum = > sum等於前後值,相加,相加後如果還小於後一個值,比較後擇取大的值當作sum:" + sum);
	            
	            
	            // max 是用來承載最大值的
	            System.out.println("max = Math.max(max, sum) 前傳回來的 max:" + max +", 傳回來前的sum:" + sum);
	            max = Math.max(max, sum);
	            System.out.println("max = Math.max(max, sum) 取得較大的值跟max去比較 max拿來裝新的大值,繼續尋訪下去-> max:" + max);
	            System.out.println("--------------");
	        }
	        return max;
	    }

}
