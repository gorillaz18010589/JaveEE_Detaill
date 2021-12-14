package 多形;
//*此目的是一般人設計多個動物個字叫的方式
//*假入今天主管跟你說要加需求,因為需求不段變更，才襯托多形的重要性
//*擴充性是多性的重點之一
//*你不希望別人修改你的類別多形的優點
//多形：就是生物多態性，同一種生物底下有不同型態
//多形：我們先定義一種動物抽象的概念 ,之後定義貓是一種動物,狗是一種動物
//多形：狗跟貓因為繼承了父類別動物的抽象概念,所以他有了動物的特性(在軟體裡就是函式跟屬性)
//抽象父類別：定義好動物能做什麼,但不全部實作出來,讓未來繼承的後代去各自實作出來
//抽象子類別：如果你繼承爸爸的動物抽象類別,那狗跟貓就要實作出來

//*需求多後每次聊天都要取得動物的種類又要到處修改swicth區塊是不好的設計
//*switch是一種非常醜的程市結構
//*擴充性的重要也是靠多行處理,希望增加新的需求就不要回來改他了
//*假設你今天你寫好的模組跟類別,你希望給同事用,他那邊的專案想要新增新的魚,因為他對城市不熟,那不就是他要近來修給你的animal,這樣不好,而且如果你用lib給他他也無法改了,所以擴充性也是多形的重點
//*這樣的類別有三個致命缺點：1.可讀性低：如果動物越來越多越難懂 2.維護性差:假設新增魚還要加入魚跟常數,方法也不好新增  3.擴充性低


//5.新的方式用抽象animal 抽象方法 eat, talk等  後代dog跟cat等去繼承各自類別實作他
//6.動物陣列卻可以放狗跟貓的物件,因為我們是用動物陣列去看待,而狗跟貓都繼承了父類別抽象動物,所以他們也是動物,卻有個字不同的方法實作跟型態,這就是生物多態性
//多形非常好維護,假設今天我同事要新增一隻老鼠,他繼承animal抽象屬性後,系統會自動要他實作這些方法,且不用去修改我動物的屬性類別,甚至也不用瞭解動物
//7.因為放的都是動物陣列,用動物的角度去使用方法,但貓跟狗各自展現
//8.那需不需要讓動物抽象類別都有attack方法就看你的設計

//4.新增抽象動物類別
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//5.抽象方法,為實作讓後代去做,只是定義一個行為
	public abstract void talk();
	
	public abstract void eat();
		
	public abstract void metaing(Animal animal) ;
		

}
//1.一開始三種動物，各自叫
//2.尋訪動物,在此用siwitch判斷動物
//3.難道在這邊寫每次都要寫siwthc嗎？ 把switch拿到動物類別裡自己判斷,加上talk方法
//4.假設今天除了talk,要加入eat方法難道又要sitch一次嗎
//5.以下為舊類別多種動物就要多種常數,而且要一直新增switch非常難看不好改,可讀性低
//public class Animal {
//	public static final int DOG = 0;
//	public static final int BEAR = 1;
//	public static final int BIRD = 2;
//	
//	//2.今天多兩種動物的話
//	public static final int CAT =3;
//	public static final int COW = 4;
//	private String name;
//	private int type;
//	
//	public Animal(String name, int type) {
//		super();
//		this.name = name;
//		this.type = type;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getType() {
//		return type;
//	}
//
//	public void setType(int type) {
//		this.type = type;
//	}
//	
//	
//	//3.新增此方法自己判斷動物各自叫
//	public void talk() {
//		switch (getType()) {
//		case Animal.DOG:
//			System.out.println("旺旺叫");
//			break;
//		case Animal.BEAR:
//			System.out.println("罵罵叫");
//			break;
//		case Animal.BIRD:
//			System.out.println("吱吱叫");
//			break;
//		case Animal.CAT:
//			System.out.println("喵喵叫");
//			break;
//		case Animal.COW:
//			System.out.println("繆繆叫");
//			break;
//		}
//	}
//	
//	public void  eat() {
//		switch (getType()) {
//		case Animal.DOG:
//			System.out.println("旺旺叫");
//			break;
//		case Animal.BEAR:
//			System.out.println("罵罵叫");
//			break;
//		case Animal.BIRD:
//			System.out.println("吱吱叫");
//			break;
//		case Animal.CAT:
//			System.out.println("喵喵叫");
//			break;
//		case Animal.COW:
//			System.out.println("繆繆叫");
//			break;
//		}
//	}
//	
//	public void metaing(Animal animal) {
//		
//	}
//}
