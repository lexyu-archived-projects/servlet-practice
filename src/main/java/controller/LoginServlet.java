package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private UserService userService = new UserService();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User loginUser = userService.login(new User(null, username, password, null));

		if (loginUser == null) {
			// 跳回登錄頁面
			request.getRequestDispatcher("html/user/login.html").forward(request, response);
			System.out.println("帳號密碼錯誤!");
		} else {
			// 登錄成功，跳轉至成功頁面			
			request.getRequestDispatcher("html/user/login_success.html").forward(request, response);
		}

	}

}
