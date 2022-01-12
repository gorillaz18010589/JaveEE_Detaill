package leetcode;
/*
 * 
 * 取得字串陣列中,共同擁有的相同的連續最大單字,並且回傳,如果沒有回傳
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

分析/解題：
題目要求從一組字串陣列中找出其最長的共用前綴，
字串只會由a到z所構成，若沒有的話則回傳空字串。

同樣的，若遇到這個問題，請第一時間記得問他們有沒有排序XD
依據資料的分布不同，不同的解法應該會有不同的優勢，
但非特殊情況的話，總體時間複雜度應為: O(單一字串長 * 總字串數)

最直觀的想法，就是從頭開始將每個相同位置的字元比對一次，
相同則往下繼續做，不同則停下將結果輸出，
但這麼做可能前面每次都要掃過相同位置的所有字元。

我們可以換個角度想，若先拿第一個字串當作common prefix(命名作pre)，
接下來用其餘的字串來檢查這個pre是否是其prefix，是的話則檢查下一個，
不是的話就將pre的尾端刪去重新檢查，這樣一旦當中有一個字串有大幅度差異，
我們很快就能將pre縮減到很短。

標題的英文是給定一個字串首字母，找到一個字串最常見的公共字串。
公開的最公開的將字串0]，當做當前最簡單的字首，公開當前的公開宣傳[當前的字串，如果攜帶當前的字則則穿越；如果是當前最簡單的字則則傳播。首推最後一個字元，再繼續比較；是所有剩餘的當前字首，即是串串的公共字首。
 * */
public class T_14_Longest_Common_Prefix {

	public static void main(String[] args) {
		 String [] strs = {"flower","flow","flight"};
		 String resutl = longestCommonPrefix(strs);
		 System.out.println(resutl);
		 
		 //使用到indexOf,跟substring
		 String test ="dwdw123";
		 System.out.println(test.indexOf("dwdw123")); //取得第一個找到的字元位置,第一個字元就找到是d,所以位置是0
		 System.out.println(test.subSequence(0, test.length()-1)); //自穿分割刪除最後一個字 //dwdw12

	}
	
	 public static String longestCommonPrefix(String[] strs) {
	        String temp = "";
	        if(strs != null && strs.length >0){    
	            temp = strs[0];                                            //先用第一個字串來比對
	            System.out.println("temp:" +temp);
	            if(temp == ""){return "";}                                 //如果是空字串就不要玩了
	            for(int i = 1 ; i<strs.length ; i++){                      //從次一個開始比  
	                while (strs[i].indexOf(temp) != 0)                     //這邊應用indexOf 比較有找到字元 如果他不是從第一個查到位置 != 0  
	                    temp = temp.substring(0, temp.length() - 1);       //我們就減少他最後一個字串 直到比到為止flower,flow,fl
	                	System.out.println("temp:" + temp);
	            }
	        }
	        System.out.println("方法結束----------------");
	        return temp;
	    }

}
