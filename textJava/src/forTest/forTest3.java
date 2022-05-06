package forTest;
//for迴圈的精神運用加深
//1.前後敘述句是可以跳過不做的
//2.for(int i=0; i<10; i++){i只活在此範圍}
/*3.示範讓i讓迴圈外的認識方法,前後敘述句可以不做的展示
 * 
 * //讓i認識給迴圈外的人認識方法
		int i = 0;
		//示範敘述句,沒有敘述句,沒有東西好執行的狀況
		for(; i<10; ) {
			System.out.println(i++);
		}
		System.out.println("---------");
		System.out.println(i);
		
		結果:
		0
		1
		2
		3
		4
		5
		6
		7
		8
		9
	---------
		10
*4.如果for( ; ; )敘述句; 布林值; 敘述句 ＝>都不做的狀況下會產生無窮迴圈
*5.示範敘述句執行方法
*int a = 0;
		for(m1(); a<10; ) {
			System.out.println(a++);
		}
		System.out.println("---------");
		System.out.println(i);
		System.out.println("END_____________");
 * */
public class forTest3 {

	public static void main(String[] args) {
		
		//3.讓i認識給迴圈外的人認識方法
		int i = 0;
		//3.示範敘述句,沒有敘述句,沒有東西好執行的狀況
		for(; i<10; ) {
			System.out.println(i++);
		}
		System.out.println("---------");
		System.out.println(i);
		System.out.println("END_____________");
		
		//5.示範敘述句執行方法
		int a = 0;
		for(m1(); a<10; ) {
			System.out.println(a++);
		}
		System.out.println("---------");
		System.out.println(i);
		System.out.println("END_____________");
	}
	
	public static void m1() {
		System.out.println("我還可以在敘述句內執行方法m1()");
	}

}
