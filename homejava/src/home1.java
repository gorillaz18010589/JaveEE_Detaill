

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
@WebServlet("/home1") //@WebServlet =>對外營業的名稱
public class home1 extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home1() {
        super();
        System.out.println("home1()");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html , charset =UTF-8"); //設定瀏覽器格式
		response.getWriter()//取得java.io.PrintWriter物件
		.append("Served at: ")
		//1.可以寫網頁html,但因為沒有指定為html,所以你h1根本無效
		.append("<h1>Hello world </h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
