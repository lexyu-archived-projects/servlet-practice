package pk;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * doGet() 在 get 請求時呼叫
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet2 的 doGet()方法");
	}
	
	/**
	 * doPost() 在 post 請求時呼叫
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet2 的 doPost()方法");
	}

}
