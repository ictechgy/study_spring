<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
당신이 좋아하던 과일은 ${fruit}이셨군요!<p>
<form action="fruit">
좋아하는 과일은 <input type='text' name=fruit>
<button type="submit">전송</button>
${fruit}
</form>
</body>
</html>