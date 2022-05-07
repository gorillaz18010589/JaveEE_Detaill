package arraytest;
//目的：先不用陣列方式,做出擲骰子讓你感覺為什麼之後要用陣列
//依照1,~6點擲骰子,各點數出現的次數總和
public class array3摋骰子 {

	public static void main(String[] args) {
		 int p0, p1, p2, p3, p4, p5, p6;		//1~6點骰子
		 p0 = p1 = p2 = p3 = p4 = p5 = p6 = 0;	//骰子初始化
		
		for(int i=0; i<1000; i++) {
			int randomValue = (int)(Math.random() * 6 +1); //1~6隨機的骰子
			switch (randomValue) {
			case 1:	p1 ++;  break;
			case 2: p2 ++;	break;
			case 3:	p3 ++;	break;
			case 4:	p4 ++;	break;
			case 5:	p5 ++;	break;
			case 6:	p6 ++;  break;
			default: p0++;
			}
		}
		
		System.out.printf("不存在骰子%d,出現:%d次\n",0,p0);
		System.out.printf("骰子%d,出現:%d次\n",1,p1);
		System.out.printf("骰子%d,出現:%d次\n",2,p2);
		System.out.printf("骰子%d,出現:%d次\n",3,p3);
		System.out.printf("骰子%d,出現:%d次\n",4,p4);
		System.out.printf("骰子%d,出現:%d次\n",5,p5);
		System.out.printf("骰子%d,出現:%d次\n",6,p6);

	}

}
