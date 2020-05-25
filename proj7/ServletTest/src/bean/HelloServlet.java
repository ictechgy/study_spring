package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/hello")	//���ͳ��ּҸ� �������ִ� Annotation�̴�. ���⼭�� �� �� �ִ�. �� path��η� ���ӽ� �� ������ �� �� �ִ�.
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HelloServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get��û ����.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post��û ����.");
		String id = request.getParameter("id");
		System.out.println("your id : " + id);
		
		String pw = request.getParameter("pw");
		System.out.println("your pw : " + pw);
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>your id : " + id + "</h1>");
		out.println("<h1>your pw : " + pw + "</h1>");
		out.println("</body></html>");
		
		out.close();
	}

}
