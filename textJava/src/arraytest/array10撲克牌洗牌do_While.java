package arraytest;
/*
 * 這個邏輯更適合用do while方式去洗牌
 * do while邏輯：至少做一次do{},才去做檢查,針對white(boolean),如果為ture,繼續do,如果為flase跳出迴圈
 * 
 * do{
 * 無論如何都會做一次
 * }while(true時),繼續跑do迴圈,直到false跳出
 * */
public class array10撲克牌洗牌do_While {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();//千分之一秒
		int[] poker = new int[10];
		
		boolean isRepeat  = false;
		int rad;
		
		for(int i=0; i<poker.length; i++) {
			do {
				//產生亂數牌
				rad = (int)(Math.random() * 10 +1);
				
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
		
		for(int card : poker) {
			System.out.println("card:" + card);
		}
		 
		System.out.println(System.currentTimeMillis() - startTime);//3 -> 0.003秒意思
	}
	

}
