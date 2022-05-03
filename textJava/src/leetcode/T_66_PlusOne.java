package leetcode;
/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

PS：題中假定陣列不為空，並且所有的數字都是非負數。
加一是指，將最後一位加1，
eg: input:[9,9]       99 + 1 = 100         return [1,0,0]
假定所有數字都是隻有一位數。

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 * 
 * */
public class T_66_PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int [] digits = {9,9}; //
	   int [] ans = plusOne(digits);
	   for(int i :  ans) {
		   System.out.println("i:" + i);
	   }
	}
	
	 /*
	  * 題中假定陣列不為空，並且所有的數字都是非負數,將最後數字加一
	  * 
	  * int[] digits : ex: {9,9};
	  *  return 1,0,0 
	  * */
	 public static int[] plusOne(int[] digits) {
	        for (int i = digits.length - 1; i > -1; i--) {
	        	//i = digits.length - 1 => 從最後一個數3開始跑,一圈一圈往回去看
	            if (digits[i] < 9) {
	            	//如果最後一個值是小於9,的話我們要＋1
	                digits[i]++;
	                System.out.println("digits[i] < 9 ->  digits[i]++: " + digits[i]++ + ", i:" +i);
	                System.out.println("----------");
	                return digits;
	            }
	            	//如果最後一個值大於9,將最後一個值設為0,再跑下一迴圈往前一位數如果遇到9,一樣變成0再跑下一位數,如果小於９就+1
	            digits[i] = 0;
	            System.out.println("digits[i] = 0 :" + digits[i]);
                System.out.println("--------------");
	        }
	    
	        // 只有全部的位數都是 9 的情況才會跑完迴圈，故只要將第一位變成 1 就好
	        int[] result = new int [digits.length + 1];
	        result[0] = 1;
	        System.out.println("只有全部的位數都是 9 的情況才會跑完迴圈，故只要將第一位變成 1 就好 -> result[0] = 1 這樣就會變成1000xxx" );
	        return result;
	    }

}
