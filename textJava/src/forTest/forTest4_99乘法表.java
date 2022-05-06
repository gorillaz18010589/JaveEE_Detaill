package forTest;
//99乘法表圖表方式呈現
//sysout是一列一列由左到右去畫
public class forTest4_99乘法表 {
	/*
	 * 2 x 1 = 2   3 x 1 = 3   4 x 1 = 4   5 x 1 = 5
	 * 2 x 2 = 4   3 x 2 = 6   4 x 2 = 8   5 x 2 = 10
	 *
	 * 
	 * */ 

	public static void main(String[] args) {
		
		//2.讓他重複9次
		for(int j=1; j<=9; j++) {
			//1.第一步印出 => 2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5
			for(int i= 2; i<= 5; i++) {
				int result = i * 1;
				System.out.printf("%d x 1 =%d\t", i, result);
			}
			//換列
			System.out.println();
		}
		System.out.println("END1______________");
		System.out.println();
		
//				2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5	
//				2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5	
//				2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5	
//				2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5	
//				2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5	
//				2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5	
//				2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5	
//				2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5	
//				2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5
		
		
		
		//4.讓他坐下半部,執行兩次,這邊k還可以變成執行幾次的count,2代表兩次,3代表3次
		for(int k=0; k<10; k++) {
			//2.讓他重複9次
			for(int j=1; j<=9; j++) {
				//1.第一步印出 => 2 x 1 =2	3 x 1 =3	4 x 1 =4	5 x 1 =5
				for(int i= 2; i<= 5; i++) {
					//5. 2 x 1 =2 -> 6 x1 = 2 ,差距就是2跟6之間差4,所以想辦法,讓k有用處第一圈k = 0 ,int newi = 2 + 0 * 4 ans: 第一圈k=0的情況 newi就是2,3,4,5
					//第二圈k=1  , int newi = 2 + 1 * 4 => 6,7,8,9
					int newi = i + k * 4;
					//3.讓j 1~9變成變數相成
					int result = newi * j;
					System.out.printf("%d x %d = %d\t", newi, j, result);
				}
				//換列
				System.out.println();
			}
			System.out.println("-------------------------------------------------------------");
		}
	
	}

}
