package leetcode;

import java.util.HashMap;
import java.util.Set;

/*
 * 依據指定的參數相加或相減，如果左邊的數大於等於右邊的話相加,反之相減
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together.
 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
 However, the numeral for four is not IIII.
  Instead, the number four is written as IV.
   Because the one is before the five we subtract it making four. 
   The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * */
public class T_13_Roman_to_Integer {

	public static void main(String[] args) {
		String s = "VII";
		
		HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
	    int result = 0;

		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		  for (int i = 0; i < s.length(); i++) {
		        if (i == s.length() - 1 ||
		        		romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
	        		//如果字串的前一個字元的值大於等於後面一位的值的話,相加
		            result += romanMap.get(s.charAt(i));
					System.out.println("前面的數大於等於後面的數numMaps.get(s.charAt(i):" + romanMap.get(s.charAt(i)));

		        } else {
		            result -= romanMap.get(s.charAt(i));
		          //如果字串的前一個字元的值大於等於後面一位的值的話,相減
					System.out.println("前面的數小於等於後面的數numMaps.get(s.charAt(i):" + romanMap.get(s.charAt(i)));
		        }
		    }
		  System.out.println("result:" + result);
		
	}
	
	
	
	/*
	 * 輸入ex:Input: s = "LVIII" 字串,如果左邊的數大於等於右邊的話相加,小於的話相減
	 * ＠param s ex:LVIII 
	 * return int 依據公式取得加或減後的值
	 * */
	public static int romanToInt(String s) {
	    HashMap<Character, Integer> romanMap = new HashMap<>();
	    romanMap.put('I', 1);
	    romanMap.put('V', 5);
	    romanMap.put('X', 10);
	    romanMap.put('L', 50);
	    romanMap.put('C', 100);
	    romanMap.put('D', 500);
	    romanMap.put('M', 1000);
	    int result = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (i == s.length() - 1 ||
	        	romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) { 
        		//如果字串的前一個字元的值大於等於後面一位的值的話,相加
	            result += romanMap.get(s.charAt(i));
	        } else {
	        	//如果字串的前一個字元的值大於等於後面一位的值的話,相減
	            result -= romanMap.get(s.charAt(i));
	        }
	    }
	    return result;
	}
	//class Solution {

    /**
     * @param String $s
     * @return Integer
     */
//    function romanToInt($s) {
//        $StoV = [
//            'I' => 1,
//            'V' => 5,
//            'X' => 10,
//            'L' => 50,
//            'C' => 100,
//            'D' => 500,
//            'M' => 1000,
//        ];
//        $special = [
//            'IV' => 4,
//            'IX' => 9,
//            'XL' => 40,
//            'XC' => 90,
//            'CD' => 400,
//            'CM' => 900,
//        ];
//        $Arr = str_split($s);
//        foreach ($Arr as $Str) {
//            
//        }
//    }
//}
}
