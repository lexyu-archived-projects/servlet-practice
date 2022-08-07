package pk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Response_1")
public class Response_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("到此一遊 Respose_1 Servlet");
		
		// Response_1 設定 K:V
		request.setAttribute("Key1", "Value1");
		
		// 第一種方法： 設置 回應碼302, Redirect (已搬家)
//		response.setStatus(302);
//		response.setHeader("Location", "http://localhost:8080/ServletPR/Response_2");
		
		// 第二種方法：
		response.sendRedirect("http://localhost:8080");
	}

}
