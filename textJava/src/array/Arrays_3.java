package array;
//多維陣列
//用矩陣觀念來看java是錯誤的
//Java陣列的觀念永遠是用一維觀念下看就是一維下去還有一維如下圖
//看你記憶體的量來決定,是樹狀圖的概念,指向的味道
//二為陣列就是一維裡面還有一維
//三為陣列就是一維裡面還有一維還有在一維
public class Arrays_3 {
	public static void main(String[] args) {
		//A.以下是矩陣的,多維陣列的宣告方式
		int[][] ary1 = new int[3][4]; //二維陣列 3x4的概念
		System.out.println(ary1[2][3]); //在第一維的第三個位置,取得第四個位置的元素
		System.out.println("-------------");
		
		//1.查看多為陣列的元素個素
		//代表從ary1這一維看看下去有三個元素
		System.out.println(ary1.length);    //3
		//代表從ary1第0個位置看下去有四個元素
		System.out.println(ary1[0].length); //4
		System.out.println("-------------");

		//B.以下是程式觀念,多維陣列的宣告方式
		int[][] ary2 = new int[3][]; //一開始一維陣列裡有三個元素,下一維的元素還沒給
		//1.這邊開始在0,1,2的一維,去分配元素就實現以上圖的概念,這就是矩陣做不到的
		ary2[0] = new int[2]; //在ary2[0]的位置分配2個元素
		ary2[1] = new int[2]; //在ary2[1]的位置分配2個元素
		ary2[2] = new int[1]; //在ary2[2]的位置分配1個元素
		
		//2.印出值發現,你根本說不出這是幾x幾的概念
		System.out.println(ary2[0][1]); //印出第一維0位置的,第二維的第2個位置元素值
		System.out.println(ary2[1][1]); //印出第一維1位置的,第2維個位置元素值
		System.out.println(ary2[2][0]); //印出第一維2位置的,第1維個位置元素值
		
		//3.多維陣列取得個數的方式
		//印出一維看下去是3個元素
		System.out.println(ary2.length);    //3
		//印出0位置底下有2個元素
		System.out.println(ary2[0].length); //2
		//印出1位置底下有2個元素
		System.out.println(ary2[1].length); //2
		//印出2位置底下有1個元素
		System.out.println(ary2[2].length); //1

		

	
	}

}
