package forTest;
/*
 * for迴圈概念
 * 1.在java迴圈不只是用計算次數來執行的語法
 * 2.的確常用來計算次數,但其實他有很多不同的變化
 * */

/*
 * for迴圈真正運作方式
 * for迴圈的執行方式
 *    ->1     ->2
 * for(敘述句; 布林值; 敘述句;){
  
   }
   *
   *
   *int a = 10;									   
   *        1 -> 執行敘述句                          2->bollean值比對是否進入3執行內容 
		for(System.out.println("hank執行第一道敘述句");        a>0;                     System.out.println("----------")) {
		                   						  ↙ 5<-bollean值比對判斷是否要繼續做3 ⏎
		    3 -> 執行內容     												         ->↑ 4.印出敘述句
			System.out.println(a--);
		}
   *
   *
 * */
public class forTest1 {
	/*
	 hank執行第一道敘述句
10
----------
9
----------
8
----------
7
----------
6
----------
5
----------
4
----------
3
----------
2
----------
1
----------
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		for(System.out.println("hank執行第一道敘述句"); a>0; System.out.println("----------")) {
			System.out.println(a--);
		}

	}

}
