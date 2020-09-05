package array;
//擲骰子作弊模式
//原本產生6個亂數,其實都都產生9個亂數
//出現7算在4上面
//出現8算在5上面
//出現9算在6上面
public class ArrayCheatDiec {

	public static void main(String[] args) {
				int[] p = new int[7];

				
				//這邊偷偷會骰到7,8,9增加了分母然後把7,8,9骰到的次數偷偷加到4,5,6
				for(int i=0; i<1000; i++) {
					int rand = (int) (Math.random() * 9 + 1); //亂數偷偷嘅成9分之一
					//1,2,3,4,5,6 不動 骰到7,8,9要變成4,5,6所以 => 7-3 ,8-3, 9-3
					// (boolean) ? Value1(true) : Value2(false) => 如果正確走Value1,錯的話走Value2
//					p[rand] ++; 原本的
					
					//如果骰出來的值大於等於7的話都-3
					p[rand>=7?rand-3:rand] ++; 
					
				}
				
				for(int i=1; i<=6; i++) {
					System.out.printf("%d點共骰到了%d次\n" ,i ,p[i]);
				}
				
				//6.如果有骰到0才顯示出來,代表產生1~6是有錯誤才會出現0
				if(p[0]> 0) {
					System.out.printf("%d錯誤點了%d次\n" ,0 ,p[0]);
				}
	}
	
//				結果：
//				1點共骰到了113次
//				2點共骰到了111次
//				3點共骰到了114次
//				4點共骰到了203次
//				5點共骰到了230次
//				6點共骰到了229次

}
