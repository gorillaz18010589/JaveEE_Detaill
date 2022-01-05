package leetcode;
/*
 * 9. Palindrome Number
 * 目的：判斷一個整數是否是迴文數。回文數是指正序（從左向右）和倒序（從右向左）讀都是一樣的整數。
 * 邏輯參考https://ithelp.ithome.com.tw/articles/10160654
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * */
public class T_9_Palindrome_Integer {

	public static void main(String[] args) {
		boolean isPalindromeFalue =	isPalindrome(196);
		System.out.println("是否是回文數:" + isPalindromeFalue);
	}
	
    public static boolean isPalindrome(int x) {
        int t=x;      
        int re=0;  
        System.out.println("使用者要查詢的值為:" + x);
    	System.out.println("================");
        if(x<0) {			//1. 負數無法為回文
        	System.out.println("x是負數,不是回文數");
        	System.out.println("================");
        	return false;  
        }    
        while(t>0) 			//2. 推斷是否將t的全部位數取完         
        {
        	re = re*10+t%10;//3. 將t的最後一位拼接在re的後面
        	t = t/10;       //取得二位數以上的值
        	System.out.println("t>0 re:" + re  + ", t:" + t);
        	System.out.println("================");
        }
    	System.out.println("x==re ->" + "x:" + x +", re:" + re);
    	System.out.println("================");
        return x==re;       //4. 將兩數進行比較並返回結果
    }

}
