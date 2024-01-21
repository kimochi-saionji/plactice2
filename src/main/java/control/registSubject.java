package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.operation2;

@WebServlet("/regist-subject-servlet")
public class registSubject extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// パラメーター取得
		request.setCharacterEncoding("UTF-8");
		String subjectName = request.getParameter("subjectName");
		
		operation2 op2 = new operation2();
		op2.registSubject(subjectName);
		
		//一覧に戻る
		selectSubjects select = new selectSubjects();
		select.doPost(request, response);
	}

}
