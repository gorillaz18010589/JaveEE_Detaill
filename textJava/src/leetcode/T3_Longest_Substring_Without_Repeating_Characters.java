package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/*
 * 3. Longest Substring Without Repeating Characters
 * 
Given a string s, find the length of the longest substring without repeating characters.

目的:【圖例】輸入字串”pwwkew”，求不含重複字元的最長子字串長度。
下面这种解法使用了 HashSet，核心算法和上面的很类似，把出现过的字符都放入 HashSet 中，
遇到 HashSet 中没有的字符就加入 HashSet 中并更新结果 res，如果遇到重复的，则从左边开始删字符，直到删到重复的字符停止：

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * */
public class T3_Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew";
		int ans = lengthOfLongestSubstring(s);
		System.out.println("ans:" + ans);
	}
	
	/*
	 * 輸入字串”pwwkew”，求不含重複字元的最長子字串長度。
	 * */
	    public static int lengthOfLongestSubstring(String s) {
	        int res = 0, left = 0, right = 0;
	        HashSet<Character> t = new HashSet<Character>();
	        while (right < s.length()) {
	            if (!t.contains(s.charAt(right))) {
	                t.add(s.charAt(right++));
	                res = Math.max(res, t.size());
	                System.out.println("t沒有包含陣列中的字元 t:"  + s.charAt(right++) +", res:" + res);
	                System.out.println("----------");
	            } else {
	                t.remove(s.charAt(left++));
	                System.out.println("t有包含刪除 t: " + s.charAt(left++));
	                System.out.println("==========");
	            }
	            System.out.println("沒進迴圈 s.charAt(left++):" + s.charAt(left++));
	            System.out.println("~~~~~~~~~~");
	        }
	        return res;
	    }
}

