package myjava;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;

//1.先創一個java專案
//2.寫一個視窗版的類別
//3.會使用外部檔案,有可能是影像檔案,或影音檔案
//4.在專案案/New/Folder夾開一個檔案名一定要叫resource
//5.然後將csv檔案複製放入resource資料夾,這樣就可以使外部資源
//6.這個類別寫一個簡單的視窗介面

public class MyWinApp  extends JFrame{ //A.繼承JFrame
	private JButton clear, chLange; 
	private ArrayList<HashMap<String, String>> menu = new ArrayList<>(); //宣告一個[{key:value}]資料結構的語系list
	public MyWinApp() {
		//B.初始化視窗設定
		setLayout(new FlowLayout());
		
		loadLaruage();
		
		//按鈕初始化
		clear = new JButton();
		chLange = new JButton("Change Lanuge");
		
		//新增按鈕
		add(clear); add(chLange);
		
		//設定視窗
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//E.下載語系方法
	private void loadLaruage() {
		//F.讀取外部檔案,載入資源黨
		try {
			InputStream in = 
					getClass()//找到我目前專案的類別
					.getClassLoader()//取得類別載入器=>地位拉高到
					.getResourceAsStream("word.csv");//取得固定resousse資源檔案,回傳到inputStream
			
		    //G.用BufferRead,因為可以讀一列一列
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
			
			//第一列讀取標題跳過
			bufferedReader.readLine();
			
			//當readLine != null時,代表還有一列一列讀取
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			
			bufferedReader.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static void main(String[] args) {
		//C.呼叫寫好的視窗
		new MyWinApp();
	}

}
