package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.operation2;

@WebServlet("/select-subject-servlet")
public class selectSubjects extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// パラメーター取得
		request.setCharacterEncoding("UTF-8");
		// セッションオブジェクト取得
		HttpSession session = request.getSession();
		//検索処理
		operation2 op2 = new operation2();
		op2.getList(session);
		
		// 遷移先指定
		String url = "subjectsList.jsp";
		
		// 遷移。
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}
