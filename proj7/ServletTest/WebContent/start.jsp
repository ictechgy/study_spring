<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<a href="hello.do">Hello사이트 요청</a><br>

<form action="hello.do" method="POST">
	아이디 : <input type="text" name="id"><br>
	패스워드 : <input type="text" name="pw"><br>  <!-- 자바스크립트 쓰는 경우 id값도 넣어야 한다. -->
	<input type="submit" value="서버로 전송">
</form>

<a href="hi.do">Hi사이트 요청</a><br>


<a href="star">Star로 연결</a>

</body>
</html>