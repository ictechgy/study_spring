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
<c:forEach items="${list}" var="dto">
ID : ${dto.id}<br>
PW : ${dto.pw}<br>
NAME : ${dto.name}<br>
TEL : ${dto.tel}<br>
<p>
</c:forEach>

</body>
</html>