package array;
//用陣列方式產生1~52張不同的牌,第一階段洗牌
//1.撲克牌每張牌是獨立不會有重複
//2.洗完拍要能發到四個玩家手上,是輪流發牌不是一次發13張
//3.這邊先用直觀方式去寫洗牌
public class Poker_1 {

	public static void main(String[] args) {
		//1.用陣列產生52個排的位置,但一開始是[0-51] = 0的牌
		int[] porker = new int[52]; //[0 - 51] => 0;
		
		for(int i=0; i<porker.length; i++) {
			//2.產生1~52的亂數,放進去,但發現有重複
			int temp = (int)(Math.random()*52);
			
			//3.檢查是否重複
			boolean isReapt = false;
			for(int j=0; j<i; j++) {
				if(temp == porker[j]) {  //第i比的亂數值相等於撲克的[j]位置值代表重複
					isReapt = true; //重複就跳出回圈
					break;
				}
			}
			
			//4.重複與不重複排的給職處理
			if(isReapt) {
				//如果重複就i-- 不讓你加上去繼續跑跑到都沒重複
				i--;
			}else {
				//如果沒有重複把牌放進去
				porker[i] = temp;
				
			}
		}
		//5.查看值正不正確
				for(int i : porker) {
					System.out.println(i);
				}
	}

		
}
