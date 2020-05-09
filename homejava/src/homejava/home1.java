package homejava;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//永遠是繼承HttpServlet
/*
 * doGet:用戶端從Url傳遞參數
 * 
 * doPost:包在body裡傳遞,所以url看不到
 * doPost特性
 * 1.資訊隱藏
 * 2.檔案上傳,一錠只有走doPost這招
 * */
/*javax.servlet.http.HttpServletRequest
 * 要找getWriter發現,並沒有原來是爸爸類別有實做
 * 原來是Java.io.PrintWriter代表有使用javaAPI
 * */
/*PrintWriter java.io.PrintWriter.append(CharSequence csq)
裡面參數是放CharSequence但為什麼String可以,因為有實做CharSequence
回傳PrintWriter就是讓你繼續偕同個類別方法下去
 * */
//重啟伺服器是很大的事情,如果有人寶物交易,就掉了n
//可以寫網頁html,但因為沒有指定為html,所以你h1根本無效,所以需要再輸出設定ContentType
//java:玩得很細連CotentType都要設定
//Servlert：第一次伺服器會自己物件實體後走建構式new出物件後自己根本沒有new,都是由他服務所以每次執行都是doGet被叫
//Servlert:只有這個物件服務全世界
//Servlet:在Servlet裡建構式比較沒有意義,因為從頭到尾都是他這物件服務大眾居多
@WebServlet("/home1") //@WebServlet =>對外營業的名稱
public class home1 extends HttpServlet {
	private int a; 
	private static int b;
    public home1() {
        super();
        System.out.println("home1()");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html , charset =UTF-8"); //設定瀏覽器格式
		response.getWriter()//取得java.io.PrintWriter物件
		.append("Served at: ")
		//1.可以寫網頁html,但因為沒有指定為html,所以你h1根本無效
		.append("<h1>Hello world </h1>");
		//2.執行後一直是doGet被叫用
//		System.out.println("doGet");
		
		//3.示範static,跟一班int,後加的值都一樣,代表玩的物件都是同一個這個Servlet
		a++; b++;
		System.out.println("doGet:" +"a:" + a + "b:" +b);
	}

	
}
