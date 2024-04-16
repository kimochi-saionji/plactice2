<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.subject" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>科目一覧</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%@include file = "header-navi.jsp"%>
	
	<h2>科目一覧</h2>
	<form action="select-subject-servlet" method="POST">
		<input type="submit" value="検索">
	</form>
	<table>
		<tr>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<%ArrayList<subject> subjectList = (ArrayList<subject>) session.getAttribute("subjectList");
		  if(subjectList != null){ 
			for(int i=0; i<subjectList.size(); i++){
		%>
		<tr>
			<td><%=subjectList.get(i).getSubject()%></td>
			<td><input type="button" value="編集"></td>
			<td><input type="button" value="削除"></td>
		</tr>
		<%	} 
		  }
		%>
		
	</table>
	
	<a href="registSubjects.jsp">新規登録</a>
	
</body>
</html>