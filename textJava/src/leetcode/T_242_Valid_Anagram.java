package leetcode;

import java.util.Arrays;

/*
 * 242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false


 * */
public class T_242_Valid_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "nagaram";
		isAnagram(s, t);
	}
	
	 public static  boolean isAnagram(String s, String t) {
		 	boolean isAnagram = false;
		 	char[] sArray = s.toCharArray(); //[a,n,a,g,r,a,m]
		 	char[] tArray = t.toCharArray(); //[n,a,g,a,r,a,m]
		 	
		 	//排序從a-z
	 		Arrays.sort(sArray);//[a,a,a,g,m,n,r]
	 		Arrays.sort(tArray);//[a,a,a,g,m,n,r]

		 	for(char c : sArray) {
		 		System.out.print("sArray:" + c +", ");
		 	}
		 	System.out.println("--------" );
		 	for(char b : tArray) {
		 		System.out.print("tArray:" + b +", ");
		 	}
		 	
		 	//比較[a,a,a,g,m,n,r] 是否相等於 [a,a,a,g,m,n,r] ,是的話代表一樣單字只是char,排序不同
		 	if(String.valueOf(sArray).equals(String.valueOf(tArray))) {
		 		isAnagram = true;
		 	}
		 	System.out.println("兩個單字是否其實一樣,只是字元順序不同:" + isAnagram);
	        return isAnagram;
	    }

}
