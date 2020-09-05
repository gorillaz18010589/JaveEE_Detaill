package array;
//陣列的基本運用

public class Aray_2 {
	
	public static void main(String[] args) {
		//陣列初始化的三種方式
		int[] ary1 = new int[4];           //0,0,0,0
		int[] ary2 = new int[] {1,2,3,4};  //1,2,3,4
		//以下方法只能在宣告時同時給值
		int[] ary3 = {1,2,3,4};		   	   //1,2,3,4
	
		//透過index的for迴圈將值尋訪出來
		for(int i=0; i<ary3.length; i++) {
			System.out.println(ary3[i]);
		}
		
		System.out.println("--------");
			
		//示範兩者差異初始化的給值差異
		int[] ary4,ary5;
		ary4 = new int[] {5,6,7,8}; //此種方式可以先宣告後給值
//		ary5 = {5,6,7,8}; 此種方式直接宣告就必須給職
		
		//for-each 尋訪取值的方式,一次尋訪一個並存在變數裡讓你去玩它
		for(int var : ary1) {
			System.out.println(var);
		}
	}
}
	

