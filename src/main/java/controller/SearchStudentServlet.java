package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

@WebServlet("/SearchStudentServlet")
public class SearchStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 取得請求的參數
		// 2. 發 SQL 語法 查詢 學生資料
		// 3. 使用 for loop 產生 查詢到的資料
		List<Student> studentList = new ArrayList<Student>();
	  	for(int i = 0; i < 10; i++){
	  		int t = i + 1;
	  		studentList.add(new Student(t+1, "name"+t, 18+t, "phone"+t));
	  	}
	  	// 4. 保存查詢到的結果，儲存到 request 中
	  	request.setAttribute("stuList", studentList);
	  	// 5. 請求轉發 到 showStudent.jsp 頁面
	  	request.getRequestDispatcher("/showStudent.jsp").forward(request, response);
	}

	
}
