<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
ȸ�� ������ ������ �����ϴ�.<br>
<form action="update">
ID : <input type="text" name="id" value="${dto.id}"><br>
PW : <input type="text" name="pw" value='${dto.pw}'><br>
NAME : <input type="text" name="name" value='${dto.name}'><br>
TEL : <input type="text" name="tel" value='${dto.tel}'><br>
<button type="submit">�����ϱ�</button>
</form>
</body>
</html>