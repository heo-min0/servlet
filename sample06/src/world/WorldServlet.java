package world;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.MemberDto;

public class WorldServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8"); //한글 깨지는거 막는 것
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		
		pw.println("<head>");
		pw.println("<title>제목</title>");
		pw.println("</head>");
		pw.println("<body>");

		pw.println("<h3>World Servlet</h3>");
		/*
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		pw.println("<p>name : " + name + "</p>" );
		pw.println("age : <input type='text' value=" + age + " ><br>");
		*/
		
		//가지고 온 짐 풀기
		MemberDto mem = (MemberDto)req.getAttribute("mem");
		pw.println("<p>name : " + mem.getName() + "</p>" );
		pw.println("age : <input type='text' value=" + mem.getAge() + " ><br>");
		
		
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
