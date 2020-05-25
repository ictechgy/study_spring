package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StarServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*PrintWriter out = response.getWriter();
		out.print("i am star!");*/
		request.setCharacterEncoding("UTF-8");
		String best=request.getParameter("best");
		String worst=request.getParameter("worst");
		String main=request.getParameter("main");
		System.out.println("best : " + best);
		System.out.println("worst : " + worst);
		System.out.println("main : " + main);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
