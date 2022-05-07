package arraytest;
//方便處理多個相同性質的變數
//陣列還具有資料相關的
//一為陣列,二為陣列,多為陣列
//陣列基本觀念
//陣列具有資料相關的
//陣列的宣告使用
//整數陣列ary1 ->透過new 產生4個元素,有new才叫完成初始化
//整數陣列還未給值之前是0
//byte, short, int, long 初值為0
//boolean初值為false
public class array1 {

	public static void main(String[] args) {
		int[] ary1; //還沒初始化
		ary1 = new int[4]; //byte, short, int, long => 0
						   //float, double => 0.0
						   //boolean => flase
		//陣列int未給值,其初始值為0
		System.out.println(ary1[0]);//0
		System.out.println(ary1[1]);//0
		System.out.println(ary1[2]);//0
		System.out.println(ary1[3]);//0
		System.out.println("----------");
		
		byte[] byte1 = new byte[4];
		System.out.println(byte1[0]);//0
		System.out.println(byte1[1]);//0
		System.out.println(byte1[2]);//0
		System.out.println(byte1[3]);//0
		System.out.println("----------");
		
		short[] short1 = new short[4];
		System.out.println(short1[0]);//0
		System.out.println(short1[1]);//0
		System.out.println(short1[2]);//0
		System.out.println(short1[3]);//0
		System.out.println("----------");
		
		long[] long1 = new long[4];
		System.out.println(long1[0]);//0
		System.out.println(long1[1]);//0
		System.out.println(long1[2]);//0
		System.out.println(long1[3]);//0
		System.out.println("----------");

	}

}
