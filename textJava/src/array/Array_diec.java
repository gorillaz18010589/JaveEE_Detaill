package array;
//目標擲骰子1~6點 骰1000次,各點出現幾次
//1.模擬擲骰子
//2.依照出現得點數,進行各點數的累加
//3.顯示結果
public class Array_diec {
	
	public static void main(String[] args) {
		//用陣列骰骰子的方法
		
		//1.準備計算6個骰子出現的次數,一開始初始設定植給0
		int p0, p1, p2, p3, p4, p5, p6;
	    p0 = p1 = p2 = p3 = p4 = p5 = p6 = 0; //一次初始化給0的方式
		
	    //骰骰子1000次
	    for(int i=0; i< 1000; i++) { 
		    	//2.產生1~6的亂數當擲骰子
				int rand = (int)( Math.random() * 6 + 1 );  //1~6 
				
				//3.switch抓亂數,1,2,3,4,5,6骰到各點的時候各自+1
				switch(rand) {
					case 1: p1 ++; break;
					case 2: p2 ++; break;
					case 3: p3 ++; break;
					case 4: p4 ++; break;
					case 5: p5 ++; break;
					case 6: p6 ++; break;
					default: p0 ++;
				//4.設計一個0當錯誤點,如果骰到0是錯誤的Defaut
				}	
		}
	    //5.印出骰子出現次數
	    System.out.printf("%d點共出現%d次\n" , 1,p1);
		System.out.printf("%d點共出現%d次\n" , 2,p2);
		System.out.printf("%d點共出現%d次\n" , 3,p3);
		System.out.printf("%d點共出現%d次\n" , 4,p4);
		System.out.printf("%d點共出現%d次\n" , 5,p5);
		System.out.printf("%d點共出現%d次\n" , 6,p6);
		System.out.print(p0);
		
		//6執行結果
//		1點共出現181次
//		2點共出現156次
//		3點共出現169次
//		4點共出現168次
//		5點共出現178次
//		6點共出現148次
	}

}
