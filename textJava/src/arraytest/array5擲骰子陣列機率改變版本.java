package arraytest;
//目的,調整骰子的機率,實驗測試,這是一個邏輯測試
//假設讓4,5,6出現機率高
//本來骰子是6分之1機率,我調成9分之1,然摋到7,8,9時,我讓他-3 => 4.5,6 ,這樣4,5,6的抽籤機率就會提高
public class array5擲骰子陣列機率改變版本 {

	public static void main(String[] args) {
	int[] ps = new int[7]; //準備1~7的骰子,0點是錯誤點正常不會進去
		
		for(int i=0; i<= 1000; i++) {
		 int rad = (int)(Math.random() * 9 +1);	//產生1~9點數其實這樣會摋到7,8,9的機率
		 	//1,2,3,4,5,6 => 摋到7,8,9時調整 => 7-3, 8-3 , 9-3 這樣就變成4,5,6,提高了摋到4.5.6的機率
		    ps[rad >=7?rad-3:rad] ++; 
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
