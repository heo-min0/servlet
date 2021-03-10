package resu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.FormDto;

public class ResultServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		FormDto dto = (FormDto)req.getAttribute("fdto");
		System.out.println("이름 : " + dto.getName());
		System.out.println("나이 : " + dto.getAges());
		System.out.println("성별 : " + dto.getSex());
		System.out.println("취미 : " + dto.getHobby());
		
	}

}
