package arraytest;
//透過index for迴圈尋訪陣列資料
public class array2 {

	public static void main(String[] args) {
		int[] ary1 = new int[4];			//0,0,0,0 ,初始化沒宣告
		int[] ary2 = new int[] {1,2,3,4};	//1,2,3,4 ,此方法可以先宣告後給值
		int[] ary3 = {1,2,3,4};				//5,6,7,8 ,此方法只能直接宣告給值
		
		for(int i=0; i< ary1.length; i++) {
			System.out.println("ary1:" + ary1[i]);
		}
		System.out.println("----------------");
		
		for(int i=0; i< ary2.length; i++) {
			System.out.println("ary1:" + ary2[i]);
		}
		System.out.println("----------------");
		
		for(int i=0; i< ary3.length; i++) {
			System.out.println("ary1:" + ary3[i]);
		}
		System.out.println("----------------");
		
		int[] ary4 = {9,10,11,12};
		//用for迴圈尋訪
		for(int i : ary4) {
			System.out.println("用for迴圈尋訪暫存變數i:" +i);
		}
	}

}
