package model;

import java.util.ArrayList;

public class subject {
	
	private String id = "";
	private String subject = "";
	private ArrayList<subject> subjectList = null;
	
	public subject(ArrayList<subject> subjectList) {
		this.subjectList = subjectList;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public ArrayList<subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<subject> subjectList) {
		this.subjectList = subjectList;
	}
}
