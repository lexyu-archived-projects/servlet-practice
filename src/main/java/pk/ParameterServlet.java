package pk;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParameterServlet")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("-------DoGet------");

		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String hobby = request.getParameter("hobby");
		//取得 Request 參數
		System.out.println("帳號 " + account);
		System.out.println("密碼 " + password);
		System.out.println("興趣 " + hobby);
		
		// 若參數為複數個值時
//		String[] hobbies = request.getParameterValues("hobby");
//		System.out.println(Arrays.asList(hobbies));
//		for (String h : hobbies) {
//			System.out.println(h);
//		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("-------DoPost------");

		// 設置UTF-8，解決POST請求的中文亂碼，必須放在取得參數之前
		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");

		String password = request.getParameter("password");
			
		//取得 Request 參數
		String account = request.getParameter("account");
		String hobby = request.getParameter("hobby");
		
		System.out.println("帳號 " + account);
		System.out.println("密碼 " + password);
		System.out.println("興趣 " + hobby);
		
//		String[] hobbies = request.getParameterValues("hobby");
//		System.out.println(Arrays.asList(hobbies));
		
	}

}
