package sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.MemberDto;

public class SampleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("SampleServlet doGet");

		String name = req.getParameter("name");
		String age = req.getParameter("age");
		System.out.println("이름과 성명 : " + name + ", " + age);
		
		//java로 이용해서 이동!!
		//resp.sendRedirect("world?name="+name+"&age=" + age);
		
		MemberDto dto = new MemberDto(name, age);
		req.setAttribute("mem", dto); //짐을 쌈, 포장완료
		
		//forward(전진) 짐을 가지고 이동
		req.getRequestDispatcher("world").forward(req, resp);
		resp.sendRedirect("world");// 짐을 안가져간다 이동만 한다
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SampleServlet doPost");
	}

}
