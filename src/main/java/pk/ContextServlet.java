package pk;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 獲取 web.xml 中配置的上下文參數 context-param
		ServletContext context = getServletConfig().getServletContext();
		String username = context.getInitParameter("username");
		System.out.println("context-param 參數 username 的值 是 " + username);
		// ServletContext 無法取得 init-param 參數，只能由 ServletConfig 取得
		System.out.println("init-param 參數 url 的值 是 " + context.getInitParameter("url")); // 值為null
		// 2. 取得當前專案路徑
		System.out.println("當前路徑:" + context.getContextPath());
		// 3. 取得專案部屬後再 Server上的絕對路徑
		/**
		 *  "/" 斜線被Server解析 地址為: http://ip:port/專案名稱/   映射到IDE的webapp目錄<br/>
		 */
		System.out.println("專案部署的路徑:" + context.getRealPath("/"));
		System.out.println("專案底下css目錄的絕對路徑:" + context.getRealPath("/css"));
		System.out.println("專案底下imgs目錄底下ServletTest.jpg的絕對路徑:" + context.getRealPath("/imgs/1.jpg"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
