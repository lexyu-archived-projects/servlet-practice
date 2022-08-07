package pk;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class HelloServlet implements Servlet {

	public HelloServlet() {
		System.out.println("1. constructor method");
	}

	@Override
	public void destroy() {
		System.out.println("4. destory方法 執行了");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("2. init 初始化");
		
		// 取得Servlet程式的別名，servlet-name的值
		System.out.println("HelloServlet 程式的別名是 " + config.getServletName() );
		// 取得初始化參數init-param
		System.out.println("初始化參數username的值：" + config.getInitParameter("username"));
		System.out.println("初始化參數url的值：" + config.getInitParameter("url"));
		// 取得ServletContext物件
		System.out.println(config.getServletContext());
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("3. service - Hello Servelt 被執行了");
		// 轉型
		HttpServletRequest httpServletRequest = (HttpServletRequest) req;
		String method = httpServletRequest.getMethod();

		if ("GET".equals(method)) {
			doGet();
//			System.out.println("get請求");
		} else if ("POST".equals(method)) {
			doPost();
//			System.out.println("post請求");
		}
	}
	
	/**
	 * GET、POST 請求的分配處理
	 */
	public void doGet() {
		System.out.println("get請求");
	}

	public void doPost() {
		System.out.println("post請求");
	}

}
