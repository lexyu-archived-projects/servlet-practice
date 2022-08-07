package pk;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServletMap extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// public ServletContext getServletContext() { return getServletConfig().getServletContext(); }
		// 取得 ServletContext 物件
		ServletContext context  = getServletContext();
		// 類似 Map 功能
		context.setAttribute("key1", "value1");
		System.out.println("ContextServletMapUrl 中取得Data key1的值是:" + context.getAttribute("key1")); // value1
	}

}
