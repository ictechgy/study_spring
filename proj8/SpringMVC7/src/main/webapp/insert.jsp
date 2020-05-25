<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/CSS/out.css">
<script type="text/javascript" src="resources/js/out.js"></script>
<script>
	me()
</script>
</head>
<body>
<button onclick="me()">나를 눌러주세요</button><br>

<img src="resources/img/injeolmi1.png">
회원가입 정보를 입력해주세요.
<form action="insert.do">
	ID : <input type="text" name="id"><br>
	PW : <input type="password" name="pw"><br>
	NAME : <input type="text" name="name"><br>
	TEL : <input type="text" name="tel"><br>
	<button type="submit">회원가입</button>
</form>


</body>
</html>