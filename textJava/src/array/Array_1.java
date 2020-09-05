package array;
//陣列基本觀念
//陣列具有資料相關的
//陣列的宣告使用
//整數陣列ary1 ->透過new 產生4個元素,有new才叫完成初始化
//整數陣列還未給值之前是0
//byte, short, int, long 初值為0
//boolean初值為false
public class Array_1 {

	public static void main(String[] args) {
		//整數陣列ary1 ->透過new 產生4個元素,有new才叫完成初始化
		int[] ary1 = new int[4]; //byte, short, int, long => 0
		
		//整數陣列還未給值之前是0
		System.out.println(ary1[0]); //0
		System.out.println(ary1[1]); //0
		System.out.println(ary1[2]); //0
		System.out.println(ary1[3]); //0

	}

}
