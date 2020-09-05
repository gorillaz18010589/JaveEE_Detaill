package array;
//目的：擲骰子陣列版本
public class ArrayDiec {

	public static void main(String[] args) {
		//1.準備一個骰子有6點加一點0錯誤點
		int[] p = new int[7];
		
		//2.骰一千次,每骰到一次就在那房間+1 代表骰到多一次
		for(int i=0; i<1000; i++) {
			//3.產生1~6的亂數,這邊是隨機產生骰子骰到的值
			int rand = (int) (Math.random() * 6 + 1);
			
			//4.進去1~6的亂數房間時,就+1當錯進去次數就是骰到次數
			p[rand] ++;
			
		}
		
		//5.尋訪一到六的骰子房間取值看各骰到幾次
		for(int i=1; i<=6; i++) {
			//p[1] -> 有幾次
			//p[2] -> 有幾次
			//p[3] -> 有幾次
			//p[4] -> 有幾次
			//p[5] -> 有幾次
			//p[6] -> 有幾次
			System.out.printf("%d點共骰到了%d次\n" ,i ,p[i]);
		}
		
		//6.如果有骰到0才顯示出來,代表產生1~6是有錯誤才會出現0
		if(p[0]> 0) {
			System.out.printf("%d錯誤點了%d次\n" ,0 ,p[0]);
		}
		
	
	}

}
