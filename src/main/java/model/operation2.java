package model;


import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import ConnectDb.select;

public class operation2 {
	
	public void getList(HttpSession session) {
		ArrayList<subject> list =  select.main(null);
		
		session.setAttribute("subjectList", list);
	}
	
	public void registSubject(String subjectName) {
		ConnectDb.registSubject registSubject = new ConnectDb.registSubject();
		registSubject.regist(subjectName);
	}
}
