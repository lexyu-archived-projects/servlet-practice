package pk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResponseIOServlet")
public class ResponseIOServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 預設 ISO-8859-1
//		System.out.println(response.getCharacterEncoding());

		// 解決亂碼 方法一 這只設定了 Server, Browser不知Server已經設定 UTF-8
//		response.setCharacterEncoding("UTF-8");
		
		// 解決亂碼 方法二 通過 Response Header, 設定 瀏覽器 也使用 UTF-8
		// 此方法一定要在 取得 Stream 物件之前使用才有效
		response.setHeader("Content-Type", "text/html; charset=UTF-8");
		System.out.println(response.getCharacterEncoding());
		
		// 回傳客戶端 字串
		PrintWriter writer = response.getWriter();
		// 英文字
		writer.write("response's content");
		// 中文字
		writer.write("中文字");

//		response.getOutputStream();
	}

}
