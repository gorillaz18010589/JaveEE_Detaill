package array;
//用陣列方式產生1~52張不同的牌,第一階段洗牌用do_While方式
//因為產生牌,如果重複就不要做,這邏輯do while剛好
public class Poker_2_Do_While {

	public static void main(String[] args) {
		//1.用陣列產生52個排的位置,但一開始是[0-51] = 0的牌
		int[] porker = new int[52]; //[0 - 51] => 0;
		boolean isReapt = false;
		int temp ;
		for(int i=0; i<porker.length; i++) {
			//2.無論如何都要產生亂數
			do {
			    temp = (int)(Math.random()*52);
				//3.檢查是否重複,重複break
				isReapt = false;
				for(int j=0; j<i; j++) {
					if(temp == porker[j]) {  //第i比的亂數值相等於撲克的[j]位置值代表重複
						isReapt = true; //重複就跳出回圈
						break;
					}
				}
			}while(isReapt); //如果沒重複,把僕克牌給職
				porker[i] = temp;
		}
		//查看值正不正確
				for(int i : porker) {
					System.out.println(i);
				}
	}

		
}
