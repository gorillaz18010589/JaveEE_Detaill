package leetcode;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * 228. Summary Ranges
 * 
 * You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
 * */
public class T_228_Summary_Ranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,4,5,7};  //Output: ["0->2","4->5","7"]
		  ArrayList<String> list = new ArrayList();
	        for (int i = 0; i < nums.length; i++){

	            int start = nums[i];
	            while (i < nums.length - 1 && nums[i + 1] - nums[i] == 1){
	            	System.out.println("當後面的值：" + nums[i+ 1] +" - " +"前面得值：" + nums[i] +" =" +"1時,我讓i++直到後面值減前面值不等於1時,跳出迴圈做下面的判斷");
	                i++;
	                System.out.println("i++:" + i);
	            }
	            if (start != nums[i]){
	            	System.out.println("起始的值start:" + start +"不相等於"+ " nums[i]:" + nums[i] + "讓他讓起始值start -> 重複的最後值拼成字串"); 
	                list.add(new String(start + "->" + nums[i]));    
	            } else {
	            	System.out.println("start 等於 nums[i] -> start:" + start + " nums[i]:" + nums[i] +"代表沒有順序就是只有此值"); 
	                list.add(String.valueOf(start));
	            }
	            System.out.println("--------- i:" + i);
	        }

	}
	
	/*
	 * 依據陣列的元素將有數字順序的值加上=> 沒有順序的值單純加上去 ex  int[] nums = {0,1,2,4,5,7};  //Output: ["0->2","4->5","7"]
	 * int[] nums =>  {0,1,2,4,5,7}
	 * return =>  ["0->2","4->5","7"]
	 * */
	 public static ArrayList<String> summaryRanges(int[] nums) {
//		 int[] nums = {0,1,2,4,5,7};  //Output: ["0->2","4->5","7"]
		  ArrayList<String> list = new ArrayList();
	        for (int i = 0; i < nums.length; i++){

	            int start = nums[i]; //設定沒有順序的第一個值為起始值
	            
	            //當後面的值減前面的值== 1, 時代表有順序如0,1,2 ,則我們i++跳脫迴圈直到不等於時進入下方判斷,做字串相加0 - > 2
	            while (i < nums.length - 1 && nums[i + 1] - nums[i] == 1){
	            	System.out.println("當後面的值：" + nums[i+ 1] +" - " +"前面得值：" + nums[i] +" =" +"1時,我讓i++直到後面值減前面值不等於1時,跳出迴圈做下面的判斷");
	                i++;
	                System.out.println("i++:" + i);
	            }
	            
	            if (start != nums[i]){
	            	//當起始的0值不等於2時,代表0 -> 2
		            //為什麼會是0因為0是一開始起始值,2是因為跳脫迴圈兩次,index為2,就是當時照順序後的最後一個值
	            	System.out.println("起始的值start:" + start +"不相等於"+ " nums[i]:" + nums[i] + "讓他讓起始值start -> 重複的最後值拼成字串"); 
	                list.add(new String(start + "->" + nums[i]));      
	            } else {
	            	//這邊的值代表沒有順序的值,只有自己存起來
	            	System.out.println("start 等於 nums[i] -> start:" + start + " nums[i]:" + nums[i] +"代表沒有順序就是只有此值"); 
	                list.add(String.valueOf(start));
	            }
	            System.out.println("--------- i:" + i);
	        }
	        return list;
	    }

}
