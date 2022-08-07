package pk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 取得 請求參數 查看
		String account = request.getParameter("account");
		System.out.println("在 Servlet2 中 查看參數： " + account);
		
		// 查看 Servlet1 是否 設定 value 成功
		Object value =  request.getAttribute("key");
		System.out.println("Servlet1-value：" + value);
		
		// 處理 Servlet2 自己業務
		System.out.println("Servlet2 處理自己業務");
		
	}

}
