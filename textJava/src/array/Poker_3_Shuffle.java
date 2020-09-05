package array;

import java.lang.reflect.Array;
import java.util.Arrays;

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
public class Poker_3_Shuffle {

	public static void main(String[] args) {
		//A.洗牌流程
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
				//查看前面52張牌
				for(int card: porker) {
					System.out.println(card);
				}
				System.out.println("---------------");
				
				//B.發牌
				//4.宣告四個玩家有13張牌特例的二維陣列
				int[][] players = new int[4][13];
				
				//5.發牌每一家要有13張牌
				for(int i=0; i<porker.length; i++) {
//					用%取得家的0,1,2,3因為,然後用/取得商就是張
//					players[家][張] = porker[i];
					
					//得到以下類似的效果
					players[i%4][i/4] = porker[i]; 	// i  家  張
//					players[0%4][0/4] = porker[i];  // 0, 0 , 0
//					players[1%4][1/4] = porker[i];  // 1, 1 , 0
//					players[2%4][2/4] = porker[i];  // 2, 2 , 0
				}
				
//				//6.查驗單家拿到的牌
//				for(int card : players[0]) { //查驗第0家的牌
//					System.out.println(card);
//				}
				
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
						System.out.print(suits[card/13] +values[card%13]); //取得sutis[0-3的四家]配合values[0-12 的13張]
					}
					System.out.println("");
				}

	}

}
