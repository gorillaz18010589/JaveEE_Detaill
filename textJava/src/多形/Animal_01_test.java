package 多形;
//*此目的是一般人設計多個動物個字叫的方式
//*假入今天主管跟你說要加需求,因為需求不段變更，才襯托多形的重要性
//需求多後每次聊天都要取得動物的種類又要到處修改swicth區塊
//*switch是一種非常醜的程市結構
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
//多形非常好維護,假設今天我同事要新增一隻老鼠,他繼承animal抽象屬性後,系統會自動要他實作這些方法,且不用去修改我動物的屬性類別,甚至也不用瞭解動物


//1.一開始三種動物，各自叫
//2.尋訪動物,在此用siwitch判斷動物
//3.難道在這邊寫每次都要寫siwthc嗎？ 把switch拿到動物類別裡自己判斷,加上talk方法
//4.假設今天除了talk,要加入eat方法難道又要sitch一次嗎

//5.新的方式用抽象animal 抽象方法 eat, talk等  後代dog跟cat等去繼承各自類別實作他
//6.動物陣列卻可以放狗跟貓的物件,因為我們是用動物陣列去看待,而狗跟貓都繼承了父類別抽象動物,所以他們也是動物,卻有個字不同的方法實作跟型態,這就是生物多態性
//多形非常好維護,假設今天我同事要新增一隻老鼠,他繼承animal抽象屬性後,系統會自動要他實作這些方法,且不用去修改我動物的屬性類別,甚至也不用瞭解動物
//7.因為放的都是動物陣列,用動物的角度去使用方法,但貓跟狗各自展現
//8.那需不需要讓動物抽象類別都有attack方法就看你的設計
public class Animal_01_test {

	public static void main(String[] args) {
		
		//6.動物陣列卻可以放狗跟貓的物件,因為我們是用動物陣列去看待,而狗跟貓都繼承了父類別抽象動物,所以他們也是動物,卻有個字不同的方法實作跟型態,這就是生物多態性
		Animal[] animals = new Animal[] {new Dog("狗"),new Cat("貓")};
		
		//7.因為放的都是動物陣列,用動物的角度去使用方法,但貓跟狗各自展現
		for(Animal animal : animals) {
			animal.eat();
			//因為適用Animal角度去看待,所以animal沒有attack方法
//			animal.attack (x) 
		}
		
		//8.那要使用貓方法可以如下
		Cat cat = new Cat("貓");
		cat.attack();
		
		//9.陣列裡面都是貓,你當然不能放狗
		Cat[] cats = new Cat[] {new Cat("貓") , new Cat("折耳貓")};
		for(Cat cat1 : cats) {
			System.out.print(cat1.getName() +":");
			cat1.attack();
		}
		
		
		
		
		
	}
		//1.動物一群陣列初始化
//		Animal[] animals = new Animal[] {new Animal("狗", Animal.DOG), 
//				new Animal("熊", Animal.BEAR),
//				new Animal("鳥", Animal.BIRD),
//				new Animal("貓", Animal.CAT),
//				new Animal("牛", Animal.COW),
//				};
//		
//		
//		//3.用新方法動物類別自己判斷物種並且發出各自叫聲
//		for(Animal animal : animals) {
//			System.out.print(animal.getName() +":");
//			animal.talk();
//			}
//		}
		
		//2.尋訪動物,在此用siwitch判斷動物
//		for(Animal animal : animals) {
//			System.out.print(animal.getName() +":");
//			
//			switch (animal.getType()) {
//			case Animal.DOG:
//				System.out.println("旺旺叫");
//				break;
//			case Animal.BEAR:
//				System.out.println("罵罵叫");
//				break;
//			case Animal.BIRD:
//				System.out.println("吱吱叫");
//				break;
//			case Animal.CAT:
//				System.out.println("喵喵叫");
//				break;
//			case Animal.COW:
//				System.out.println("繆繆叫");
//				break;
//			}
//		}
	

}
