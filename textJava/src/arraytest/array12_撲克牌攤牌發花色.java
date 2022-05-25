package arraytest;

import java.util.Arrays;

public class array12_撲克牌攤牌發花色 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();//千分之一秒
		int[] poker = new int[52];
		
		boolean isRepeat  = false;
		int rad;
		
		for(int i=0; i<poker.length; i++) {
			do {
				//產生亂數牌
				rad = (int)(Math.random() * 52 );
				
				//檢查是否重複
				isRepeat = false;
				for(int j=0; j<i; j++) {
					if(rad == poker[j]) {
						isRepeat = true;
						break;
					}
				}
			}while(isRepeat);//當重複時繼續跑do迴圈,繼續洗牌
				//沒有重複的話將值放進去
				poker[i] = rad;
				System.out.println("沒有重複將亂數放進去proker[i]:" + poker[i]);
			System.out.println("--------");
		}
		
		//印出看一下是否是52張每張都不同
		for(int card : poker) {
			System.out.println("card:" + card);
		}
		
		//準備四個玩家,每個玩家有13張牌
		int[][] players = new int[4][13];
		
		//[家][張] player => i：0時, 將poker[0]得牌,發給[0家][0張] => i：1時將poker[1]得牌,發給[1家][0張] => i：2時將poker[2]得牌,發給[2家][0張]  => i：3時, 將poker[3]得牌,發給[3家][0張] 
		// i：4時, 將poker[4]得牌,發給[0家][1張] => i：5時將poker[5]得牌,發給[1家][1張] => i：6時將poker[6]得牌,發給[3家][1張]  => i：7時, 將poker[7]得牌,發給[3家][1張] 
		for(int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		System.out.println("---------");
		
		//查詢第0家的所有牌
		for(int card : players[0]) {		
			System.out.println("player[0] 第零家的牌:" + card);
		} 
	
	
		System.out.println("--------------");
		//6.一次把四家的牌都攤牌出來
		// 0 - 12 -> 黑桃
		// 13 -25 -> 紅心
		// 26 -38 -> 方塊
		// 39 -51 -> 梅花
		String[] suits = {"黑桃","紅心","方塊","梅花"}; //花色
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","11 ","12 ","13 "};
		for(int[] player : players) { //從二為陣列players眼睛看下去是一個一維陣列,共有四家尋訪
			Arrays.sort(player); //進行理牌動作
			for(int card: player) { //從四家裡面取得各家的牌
				System.out.print(suits[card/13] +values[card%13]); //取得sutis[0-3的四家花色]配合values[0-12 A~13]
			}
			System.out.println("");
		}
	}

}
