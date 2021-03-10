package serv;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.FormDto;

public class ServServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String ages = req.getParameter("ages");
		String sex = req.getParameter("sex");
		String hobby = req.getParameter("hobby");
		/*String hobby[] = req.getParameterValues("hobby");
		String shobby = "";
		for (int i = 0; i < hobby.length; i++) {
			shobby += hobby[i];
			if (i < hobby.length-1) {shobby += ", ";}
		}*/
		
		FormDto dto = new FormDto(name, ages, sex, hobby);
		req.setAttribute("fdto", dto);
		
		req.getRequestDispatcher("resu").forward(req, resp);
		
	}
}
