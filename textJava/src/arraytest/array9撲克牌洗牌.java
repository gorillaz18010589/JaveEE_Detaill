package arraytest;
//用陣列方式產生1~52張不同的牌,第一階段洗牌
//1.撲克牌每張牌是獨立不會有重複
//2.洗完拍要能發到四個玩家手上,是輪流發牌不是一次發13張
//3.這邊先用直觀方式去寫洗牌
public class array9撲克牌洗牌 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();//千分之一秒
		int[] poker = new int[10];
		
		for(int i=0; i<poker.length; i++) {
			int rad = (int)(Math.random() * 10 +1);
			
			//檢查是否重複
			boolean isRepeat = false;
			for(int j=0; j<i; j++) {
			
				if(rad == poker[j]) {
					isRepeat = true;
					break;
				}
			}
			
			//沒有重複的話將值放進去,因為再跑下去如果重複會在++再跑下一圈那就沒有塞值進去,所以這邊做i-- ,再重新產生一個亂數沒有重複舊房進去
			if(isRepeat) {
				i--;
				System.out.println("重複了 i-- 不要再跑同一次");
			}else {
				poker[i] = rad;
				System.out.println("沒重複將值放進去 poker[i]:" + poker[i]);
			}
			System.out.println("--------");
		}
		
		for(int card : poker) {
			System.out.println("card:" + card);
		}
		 
		System.out.println( System.currentTimeMillis() - startTime);//3 -> 0.003秒意思
	}

}
