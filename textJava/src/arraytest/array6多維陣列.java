package arraytest;
//多維陣列
//用矩陣觀念來看java是錯誤的
//Java陣列的觀念永遠是用一維觀念下看就是一維下去還有一維如下圖
//看你記憶體的量來決定,是樹狀圖的概念,指向的味道
//二為陣列就是一維裡面還有一維
//三為陣列就是一維裡面還有一維還有在一維
//只要new就是物件,陣列也是一種物件
//多維陣列的矩陣只是其中一種,多維的精華在一維還有一維
public class array6多維陣列 {

	public static void main(String[] args) {
		//1.矩陣 3 x 4陣列
		int[][] aray1 = new int[3][4];
		System.out.println("最大的位置aray[2][3]:" + aray1[2][3]);
		System.out.println("從一維看下去有:" + aray1.length +"個元素");				//3
		System.out.println("從二維看下去有第0個房間:" + aray1[0].length +"個元素");  //4
		System.out.println("從二維看下去有第1個房間:" + aray1[1].length +"個元素");  //4
		System.out.println("從二維看下去有第2個房間:" + aray1[2].length +"個元素");  //4
		System.out.println("--------------------");
		
		//2.多維陣列
		int[][] aray2 = new int [3][]; //一開始初始化三格房間
		
		//3.多維陣列進行二維給值
		aray2[0] = new int[2]; //(0,0) (0,1)
		aray2[1] = new int[2]; //(1,0) (1,1)
		aray2[2] = new int[1]; //(2,0) 
		System.out.println(aray2[0][1]);
		System.out.println(aray2[1][1]);
		System.out.println(aray2[2][0]);
		System.out.println("---------------");
		System.out.println("從一維看下去有:" + aray2.length +"個元素");				//3
		System.out.println("從二維看下去有第0個房間:" + aray2[0].length +"個元素");  //2
		System.out.println("從二維看下去有第1個房間:" + aray2[1].length +"個元素");  //2
		System.out.println("從二維看下去有第2個房間:" + aray2[2].length +"個元素");  //1
		
		
		
		

	}

}
