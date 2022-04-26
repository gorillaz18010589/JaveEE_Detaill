package leetcode;

/*
 * 35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

二元搜尋(Binary Search)演算法又稱為二分搜尋(Half-Interval Search)
演算法或是對數搜尋(Logarithmic Search)演算法，
顧名思義，這套演算法的核心思想就在於「二分」，可以在已排序好的序列中進行高效率的搜尋。

目的：
這題主要目的在於了解如何處理以排序陣列的快速方法：二元搜尋法。
給定一個排序的陣列和目標值，假定陣列的數字不會重複。
題目要求找到目標值在這個陣列中的位置；
若無，則回傳如果要將其插入時，應插入的位置。

解析：
分析/解題：
給定一個排序的陣列和目標值，假定陣列的數字不會重複。
題目要求找到目標值在這個陣列中的位置；
若無，則回傳如果要將其插入時，應插入的位置。

這題是很典型的二元搜索法(Binary Search)。
所謂的Binary Search，就是資料已處於被排序的狀態，
那麼在這些資料內搜索某個特定值就不用一個一個找，
我們可以用比較快的方法來搜尋。

假設我們有一組排序過的陣列，
搜尋的第一步就是取得中間點的那個值，我們先稱之為mid，
那mid左邊的數必然小於mid，反之mid右邊的數必然大於mid。
(按順序排的嘛XD)
所以我們拿目標值target跟mid比較，
如果target == mid，那mid所在的位置就是我們要的答案；
如果target > mid，表示答案只可能在mid右邊到尾端之間(不含mid)；
如果target < mid，表示答案只可能在mid左邊到開頭之間(不含mid)。
如此一來，每次取得區塊的中間點的值，並和target做比較，
則每次都可以至少刪掉一半的可能的數量，
直到找到答案(target == mid)，
或是區塊上下限交錯(那就表示target不存在於陣列之中)，
我們同樣可以將下限的index輸出，因為它就代表應該被插入的點。

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 * */
public class T_35_Search_Insert_Position {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 5;
		searchInsert(nums, target);
	}
	
	  /*
	   * 依據排序過的陣列,輸入target,回傳目標的位置,如果沒有在裡面,則回傳陣列的目標中間位置
	   *  nums  ex有排序的陣列 int[] nums = {1,3,5,6};
	   *  target 目標值
	   *  return 返回陣列元素中目標的位置,如果陣列中沒有此目標,則依照數字回傳此目標會被放入的位置
	   * */
	  public static int searchInsert(int[] nums, int target) {
	        int left = 0;  //陣列最左邊最小值
	        int right = nums.length - 1; //陣列最右邊最大值
	        System.out.println("初始 left:" + left +", right:" + right +", target:" + target);
			System.out.println("-------------------");
	        while(left <= right) { 	//當最小值沒有超過最nums的最大位置,時檢查
	        	//取得中陣列中位數index => mid
	            int mid = (left + right) / 2; 
	            System.out.println("當left <= right  min = (left + right)/2 -> min:" + mid);
		        System.out.println("----------------------");
	            if(nums[mid] < target) {
	            	//當中位數的陣列元素,小於目標時,往右飄移一位繼續檢查
	                left = mid + 1; 
	                System.out.println("else if (nums[min]<target) ->  left = min + 1-> left:" + left);
		            System.out.println("----------------------");
	            }else if(nums[mid] > target) 
	            	//當中位數的陣列元素,大於目標時,往左飄移一位繼續檢查
	            {
	                right = mid - 1; 
	                System.out.println("if(nums[min]>target) ->  right = min - 1 -> right:" + right);
		            System.out.println("----------------------");
	            }
	            else {
	            	//當中位數,等於答案時,回傳解答
		        	System.out.println(" mid:" + mid);
	                return mid; 
	            }
	        } 
		    System.out.println("left`" + left);
	        return left; // 因為題目要求找不到元素時得回傳插入的索引，不然正常情況應是回傳 -1
	    }
	  
	

}
