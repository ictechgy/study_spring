package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/hello")	//인터넷주소를 매핑해주는 Annotation이다. 여기서만 쓸 수 있다. 저 path경로로 접속시 이 파일을 볼 수 있다.
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HelloServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get요청 들어옴.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post요청 들어옴.");
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
