package arraytest;
//為何要用陣列，比較array3用switch方式,假設今天要100點骰子,你要switch case 1~100嗎？
//利用陣列的值,有相同的特性,依據指定數字找到房間在那int房間++次數即可
public class array4擲骰子陣列版本 {

	public static void main(String[] args) {
		int[] ps = new int[7]; //準備1~7的骰子,0點是錯誤點正常不會進去
		
		for(int i=0; i<= 1000; i++) {
		 int rad = (int)(Math.random() * 6 +1);	//產生1~6點亂數
		 	//依據摋到的1~6房間,摋到指定點數就在那點數房間 +1(重點)
		    ps[rad] ++; 
		}

		//因為骰子是存1~6這邊跑1~6的迴圈
		for(int i=1; i<=6; i++) {
			System.out.printf("%d點,出現%d次\n",i, ps[i]);
		}
		
		if(ps[0] > 0) {
			System.out.printf("錯誤%d點,出現%d次\n",0, ps[0]);

		}
		
	}

}
