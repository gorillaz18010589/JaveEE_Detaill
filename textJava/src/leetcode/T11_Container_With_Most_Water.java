package leetcode;

/*
 * 11. Container With Most Water
 * https://www.cnblogs.com/cnoodle/p/11781368.html
 * 給你 n 個非負整數 a1，a2，...，an，每個數代表坐標中的一個點 (i, ai) 。
 * 在坐標內畫 n 條垂直線，垂直線 i 的兩個端點分別為 (i, ai) 和 (i, 0) 。
 * 找出其中的兩條線，使得它們與 x 軸共同構成的容器可以容納最多的水。

說明：你不能傾斜容器。

存儲水量 = 寬度 * 高度 = (right - left) * Math.min(height[left], height[right])

 * You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 * */
public class T11_Container_With_Most_Water {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7}; //代表塊板子的高度,第一根高度是1,第二根高度是8
		maxArea(height);
	}
	
	  	  /*
	  	   * 取得木板的最大裝水面積,木板要平的
	  	   * 存儲水量 = 寬度 * 高度 = (right - left) * Math.min(height[left], height[right])
	  	   * */
	      public static int maxArea(int[] height) {
	          int res = 0;
	          int left = 0;
	          int right = height.length - 1;
	          System.out.println("初始值 -> res:" + res +", left:" + left +", right:" + right);
	          while (left < right) {
	        	  int heightValue = Math.min(height[left], height[right]);
	        	  
	        	  //存儲水量 = 寬度 * 高度 = (right - left) * Math.min(height[left], height[right])
	              res = Math.max(res, Math.min(height[left], height[right])   * (right - left));
	              System.out.println("left < right -> res:" + res +", height[left]:" + height[left] +", height[right]:" + height[right] +", heightValue:" +heightValue);
	             if (height[left] < height[right]) {
	            	 System.out.println("height[left] < height[right] -> left++" );
	                  left++;
	             } else {
	            	 System.out.println("height[left] >height[right] -> left--" );
	                 right--;
	             }
	         }
	         return res;
	     }
	 

}
