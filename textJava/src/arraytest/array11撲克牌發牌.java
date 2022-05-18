package arraytest;
//這邊實現B.發牌概念
//用陣列方式產生1~52張不同的牌,第一階段洗牌
//1.撲克牌每張牌是獨立不會有重複
//2.洗完拍要能發到四個玩家手上,是輪流發牌不是一次發13張
//3.這邊先用直觀方式去寫洗牌
//4.要配合圖片看
/*
*  0,1,2,3 是四家 -> 0,0,0,0 發0輪牌
*  4,5,6,7 是四家 -> 1,1,1,1 發1輪牌
*  以此類推
*  
*  i  家 張   -> 這樣就是用二為陣列int players[4][13] => players[家][張],那要達到以下方法要用餘數
*  0  0  0
*  1  1  0
*  2  2  0
*  3  3  0
*  4  0  1
*  5  1  1
*  6  2  1
*  7  3  1
* */
public class array11撲克牌發牌 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();//千分之一秒
		int[] poker = new int[52];
		
		boolean isRepeat  = false;
		int rad;
		
		for(int i=0; i<poker.length; i++) {
			do {
				//產生亂數牌
				rad = (int)(Math.random() * 52 +1);
				
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
		int[][] player = new int[4][13];
		
		//[家][張] player => i：0時, 將poker[0]得牌,發給[0家][0張] => i：1時將poker[1]得牌,發給[1家][0張] => i：2時將poker[2]得牌,發給[2家][0張]  => i：3時, 將poker[3]得牌,發給[3家][0張] 
		// i：4時, 將poker[4]得牌,發給[0家][1張] => i：5時將poker[5]得牌,發給[1家][1張] => i：6時將poker[6]得牌,發給[3家][1張]  => i：7時, 將poker[7]得牌,發給[3家][1張] 
		for(int i=0; i<poker.length; i++) {
			player[i%4][i/4] = poker[i];
		}
		
		System.out.println("---------");
		
		//查詢第0家的所有牌
		for(int card : player[0]) {		
			System.out.println("player[0] 第零家的牌:" + card);
		} 
	
	}

}
