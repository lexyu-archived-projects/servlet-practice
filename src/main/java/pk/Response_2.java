package pk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Response_2")
public class Response_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 無法取得 Response_1 中 設定的 數據, 顯示為 null
		System.out.println(request.getAttribute("Key1"));
		
		response.getWriter().write("Response_2's result");
		
	}


}
