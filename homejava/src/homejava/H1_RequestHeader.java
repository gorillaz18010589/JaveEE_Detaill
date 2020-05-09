package homejava;
////request網址：https://javaee.github.io/javaee-spec/javadocs/javax/servlet/http/HttpServletRequest.html
/*Request
 * 1.是一種隱含物件,不需要物件實體化
 * 2.接收Client端送出要求,我們這邊伺服器收到要求去做處理
 * */

/*Response
 * 1.我們這邊Servlet處理的結果由Respone的物件來處理送出
 * 2.Respone是一個物件,getWriter只是從裡面拿出輸出串流
 * 3
 * */

/*Response.PrintWritet
 * 1.
 * 2.是response中取得的其中一條串流
 * 3.PrintWriter就是當年xxx.writer就是在處理字元
 * 4.因為頁面原始碼都是字元所以用PrintWriter輸出
 * */

/*Header
 * 1.從使用者傳來的Request中取得HeaderNaem,value
 * 2.每個瀏覽器傳回來的Header並不相同
 * host=localhost:8080  //連線主機為：
 *upgrade-insecure-requests=1
 *accept=text/html,application/xhtml+xml,application/xml;q=0.9,*;q=0.8
 *user-agent=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_3) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.3 Safari/605.1.15
 *accept-language=zh-tw //預設語系 => zh(語系)-tw(地區)
 *accept-encoding＝gzip, deflate  //預設編碼： 
 *connection＝keep-alive //是否連線：持續連線中
*/

/*後端觀念Service
 * 1.就是要負責送這些些頁面原始碼過去給前端
 * 2.後端的頁面原始碼不會被看到,但前端會被看到
 * 3.後端這邊寫code執行後的結果由Writer送出
 * 4.你傳統寫的html,css,js,都由這邊送出去
 * 5.目前是用TomCat
 * 6.你Clent提出Request由這邊Service來接收
 * 7.這邊要做就是跟資料有關的,所以跟DB有關
 * 8.ex:檔案上傳也是由這邊負責,上傳到伺服器或
 * 9.ex:像蝦皮賣東西,你丟圖片上來,並不是照你的照片規格去做處理,所以你丟圖上來,伺服器幫你做縮放的動作,你只要圖片上來就幫你處理掉,不像前端麻煩
 * */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class H2_RequestHeader
 */
@WebServlet("/H2_RequestHeader")
public class H1_RequestHeader extends HttpServlet {
//request.getHeaderNames():(回傳到Enumeration<String>)
//request.getHeader(String name)://取得Header的值如果沒有值回傳null(要查詢的headName欄位)(回傳值String)
//Enumeration<E>.hasMoreElements():判斷這個列舉裡是否還有更多的物件,如果有回傳true沒有false(回傳值boolean)
//Enumeration<E>.nextElement()://如果這個列舉裡還有下一個元素將下一個元素回傳到String(回傳值String)
//PrintWriter.write(String s)://輸寫String檔案內容(要輸出的String)
//PrintWriter.flush()://將這個串流沖出才不會漏資料
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			//A.取得PrintWrite做輸出
			 response.setContentType("text/html,charset=UTF-8");
			 PrintWriter printWriter = response.getWriter();
			
			//B.從使用者傳來的Request中取得HeaderNaem,value
			Enumeration<String> enumeration = request.getHeaderNames(); //取得Request回傳的所以有headerName(回傳到Enumeration<String>)
			while(enumeration.hasMoreElements()) {//判斷這個列舉裡是否還有更多的物件,如果有回傳true沒有false
				String headerName = enumeration.nextElement();//如果這個列舉裡還有下一個元素將下一個元素回傳到String(回傳值String)
				String headerValue = request.getHeader(headerName);//取得Header的值如果沒有值回傳null(要查詢的headName欄位)(回傳值String)
				printWriter.write(headerName +"="+ "headerValue:" + headerValue +"<br>");//輸寫String檔案內容
			}
			printWriter.flush();//將這個串流沖出才不會漏資料
		}


}
