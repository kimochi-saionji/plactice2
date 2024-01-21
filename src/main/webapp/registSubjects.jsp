<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>科目登録ページ</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%@include file = "header-navi.jsp"%>
	
	<h2>科目登録ページ</h2>
	
	<form action="regist-subject-servlet" method="post">
		科目名 <input type="text" name="subjectName">
		<input type="submit" value="登録">
	</form>
</body>
</html>