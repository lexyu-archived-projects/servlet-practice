package ajax_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Person3;

@WebServlet("/ajaxServlet")
public class AjaxServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	protected void javaScriptAjax(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Ajax Request 過來了");
		
		Person3 person3 = new Person3(1, "Lex");
		// 測試同步
//		try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }	
		// Java物件 轉成 JSON 字串
		Gson gson = new Gson();	
		String personJsonString = gson.toJson(person3);		
		res.getWriter().write(personJsonString);
	}

	protected void jQueryAjax(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("jQueryAjax Request 過來了");
		Person3 person3 = new Person3(1, "Lex");
		// Java物件 轉成 JSON 字串
		Gson gson = new Gson();	
		String personJsonString = gson.toJson(person3);		
		res.getWriter().write(personJsonString);
	}
	
	protected void jQueryGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	System.out.println("jQueryGet Request 過來了");
		Person3 person3 = new Person3(2, "Bruce");
		// Java物件 轉成 JSON 字串
		Gson gson = new Gson();	
		String personJsonString = gson.toJson(person3);		
		res.getWriter().write(personJsonString);
    }
	
    protected void jQueryPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	System.out.println("jQueryPost Request 過來了");
		Person3 person3 = new Person3(3, "Clark");
		// Java物件 轉成 JSON 字串
		Gson gson = new Gson();	
		String personJsonString = gson.toJson(person3);		
		res.getWriter().write(personJsonString);
    }


    protected void jQueryGetJSON(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	System.out.println("jQueryGetJSON Request 過來了");
		Person3 person3 = new Person3(4, "Diana");
		// Java物件 轉成 JSON 字串
		Gson gson = new Gson();	
		String personJsonString = gson.toJson(person3);		
		res.getWriter().write(personJsonString);
    }
    

    protected void jQuerySerialize(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	System.out.println("jQuerySerialize Request 過來了");
		
    	System.out.println("帳號： " + req.getParameter("username"));
    	System.out.println("密碼： " + req.getParameter("password"));
    	System.out.println("選單： " + req.getParameter("single"));
    	System.out.println("多選擇： " + req.getParameter("multiple"));
    	System.out.println("複選： " + req.getParameter("check"));
    	System.out.println("單選： " + req.getParameter("radio"));

    	Person3 person3 = new Person3(5, "Barry");
		// Java物件 轉成 JSON 字串
		Gson gson = new Gson();	
		String personJsonString = gson.toJson(person3);		
		res.getWriter().write(personJsonString);
    }

}
