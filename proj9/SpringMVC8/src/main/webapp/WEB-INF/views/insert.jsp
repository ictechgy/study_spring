<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:out value="���� JSTL�� ����� �����..."></c:out>
ȸ�����Կ� �����Ͽ����ϴ�. <br>
<hr>
${hi}
����� ������ ������ �Ʒ��� �����ϴ�.<br>
ID : ${memberDTO.id}<br>
PW : ${memberDTO.pw}<br>
NAME : ${memberDTO.name}<br>
TEL : ${memberDTO.tel}<br>
</body>
</html>