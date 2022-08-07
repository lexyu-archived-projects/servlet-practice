package pk;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 取得 請求的參數
		String account = request.getParameter("account");
		System.out.println("Servlet1 中 查看看參數：" + account);
		
		// 給 請求 設定 value，並傳遞至 Servlet2 再去查看
		request.setAttribute("key", "Servlet1" );
		
		// 指定 去 Servlet2 的 路&方法。 http://ip:port/專案名/
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Servlet2");
		
		// 前進 Servlet2
		requestDispatcher.forward(request, response);
		
	}

}
