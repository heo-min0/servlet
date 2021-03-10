package work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WorkServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String ages = req.getParameter("ages");
		String sex = req.getParameter("sex");
		String hobby[] = req.getParameterValues("hobby");
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>title</title>");
		pw.println("</head>");
		pw.println("<body>");
		
		pw.println("<form action='serv' method='post'>");
		pw.println("이름 : <input type='text' name='name' value='"+ name +"'><br>");
		pw.println("연령대 : <input type='text' name='ages' value='"+ ages +"'><br>");
		pw.println("성별 : <input type='text' name='sex' value='"+ sex +"'><br>");
		pw.print("취미 : <input type='text' name='hobby' value='");
		for (int i = 0; i < hobby.length; i++) {
			pw.print(hobby[i]);
			if (i < hobby.length-1) { pw.print(", "); }
		}
		pw.println("'><br>");
		/*for (int i = 0; i < hobby.length; i++) {
			pw.print("취미 : <input type='text' name='hobby' value='" + hobby[i] + "'><br>");
		}*/
		pw.println("<button type='submit'>submit</button>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
