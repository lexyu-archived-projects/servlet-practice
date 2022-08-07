package pk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestAPIServlet")
public class RequestAPIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 取得 request 的 .xml url-pattern /路徑
		System.out.println("URI => " + request.getRequestURI());
		
		// 取得 request 的 絕對路徑
		System.out.println("URL => " + request.getRequestURL());

		// 取得 客戶端 ip 位址
		System.out.println("Cliet 端 ip => " + request.getRemoteHost());

		// 取得 request header
		System.out.println("User-Agent => " + request.getHeader("User-Agent"));

		// 取得 request method
		System.out.println("Request 的方式 => " + request.getMethod());
	}
}
