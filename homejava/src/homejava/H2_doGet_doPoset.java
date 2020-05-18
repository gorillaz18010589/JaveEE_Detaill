package homejava;
//目的：看一下Service,doGetp,doPost的生命流程
//看流程怎麼會叫近來這邊
//1.實際上是先叫super.service(req, resp),然後拉到doget去做
//2.因為省略這段沒寫,所以每次物件實體後service都會super而super就是讓doget被叫
//3.這是u1.html的後端
//4.跟u1.html連接,看出do get跟post差異
/*do get
 *1.得到的資訊走url,你從url那邊打的參數,永遠是走doGet
 *2.如果 service,沒有overrRider因為super.service(req, resp)關西,隱含在做這件事,所以都會先叫doGet
 *3.如果前端的form沒有定義method的話預設試走doGet
 
 * */

/*doPost:
 * 1.走的是機密資訊
 * 2.是將資訊包在body去做處理
 * 3.因為是包在body資訊機密,所以url網址是不會看到參數的
 * 4.可以在url用?帶參數
 * 5.doPost適用getParameter去看Clent端送什麼參數給我們
 * */

/*service:
 * 1.是第一個被叫的
 * 2.super.service(req, resp):叫爸爸的這招,看你是走do get還是post然後再指派處理
 * 3.如果沒有複寫這個方法,預設都會偷偷叫super爸爸那招,所以通常都走doGet
 * 
 * */
/*5.自己寫一個doTesk方法做改寫
 * 1.好處是不管你前端是metho => doGet或是doPost皆可接收參數處理
 * 2.不管doGet或是doPost都是doTask處理,你前端怎麼改都是我接收
 * */
//6.後端要處理的就是參數

/*在url輸入中文,或是,空白符號字串等
 * 1.在url傳遞的過程中,會將字串參數進行編碼的動作呈現在url上
 * 2.例如說：空白符號
 * 3.但在google直接搜尋中文出現爪哇中文,因為google有進行處理
 * 4.搜尋抓瓦 卡通(中間有空格) 空格變成了＋號,因為其實空格也算一個搜尋字斷
 * 5.空白會變成＋號
 * 6.為什麼我們可以在網頁輸入中文,因為contentType有用Utf-8
 * 7.網頁預設編碼是iso-8859-1
 * */

/*u1.html輸入中文仍然可讀並輸出方式
 * 要傳遞網路時String.getByte傳遞
 * 一般來說如果妳網頁沒有設定 <meta charset="utf-8"/>  => 宣告html為UTF-8格式的話會是IOS-8859-1
 * new String(value.getBytes("ISO-8859-1"),"UTF-8") =>取得IOS-8859-1 轉乘UTF-8
 * */
//javax.servlet.ServletRequest.getParameter(String arg0):取得指定參數的值(String參數名稱)(回傳值String )
//javax.servlet.ServletRequest.getParameterNames():取得參數名子的物件(回傳)
//java.util.Enumeration.nextElement(): //裡面還有元素嗎(回傳到String)
//javax.servlet.http.HttpServletRequest.getRequestURL()://抓取丟出請求息的網址(回傳值 StringBuffer)
//java.lang.String.getBytes(String charsetName)://把字串的原本是iso-8859-1改成byte UTF-8(回傳byte[]陣列)

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/H2_doGet_doPoset")
public class H2_doGet_doPoset extends HttpServlet {
       
    
	//1.service => overRider
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service()");
//		super.service(req, resp); //這行是叫爸會叫到doGet那去,註解起來則不會直接到doGet去
		
		//3.在service時,直接指派到我們這隻task做處理
		doTask(req, resp);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}
	
	//2.自己寫一個自己寫一個doTask來接收request跟response,跟doGet,doPost一模一樣
	private void doTask(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("doTask()");
		
		//4.得到輸出串流跟種類
		response.setContentType("text/html, charset=UTF-8");
		PrintWriter printWriter = response.getWriter();
		
		//5.取得u01傳來的帳號,密碼參數一個一個的方式
//		String account = request.getParameter("account");//取得指定參數(String參數名)
//		String password = request.getParameter("password");
//		printWriter.write(account +"<br>" + password + "<br>");		
		
		//6.一次取出參數的值方式,並且輸出
		Enumeration<String> emEnumeration = request.getParameterNames();//取得參數裡的所有名稱
		while(emEnumeration.hasMoreElements()) {
			String name = emEnumeration.nextElement();
			String value = request.getParameter(name);//取得指定參數(指定的String參數名)
//			printWriter.write(name +":" + value +"<br>");
			
			//7.取得IOS-88591格式,轉成Utf-8
			String newValue = new String(value.getBytes("ISO-8859-1"),"UTF-8");
			printWriter.write(name +":" + newValue +"<br>");

		}
		printWriter.flush();
	}
}

